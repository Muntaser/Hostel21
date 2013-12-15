package Hostel21;




import java.util.*;

/**
 *
 * @author 
 */
public class AvailabilityImpl implements Availability{
   private static final String FILE_NAME = "Availability.txt";

    @Override
    public boolean create(AvailabilityModel model) {
        List<AvailabilityModel> list = ReadWriteFile.readFromFile(FILE_NAME);
        UidDM dao = UidDMFactory.getUidDM();
		int uid = dao.getNextUid(UidModelEnum.AVAILABILITY);
		for (AvailabilityModel m:list){
			if (m.getAvailabilityid().equals(model.getAvailabilityid())){
				return false;
			}
		}
		model.setAvailabilityid(String.valueOf(uid));
		list.add(model);
		ReadWriteFile.write2File(list, FILE_NAME);
		return true;
    }

    @Override
    public boolean update(AvailabilityModel model) {
        List<AvailabilityModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final AvailabilityModel m = list.get(i);
			if (m.getAvailabilityid().equals(model.getAvailabilityid())){
				list.set(i, model);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		return false;
    }

    @Override
    public boolean delete(String Availabilityid) {
       List<AvailabilityModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final AvailabilityModel m = list.get(i);
			if (m.getAvailabilityid().equals(Availabilityid)){
				list.remove(i);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		return false;
    }

    @Override
    public List<AvailabilityModel> getAll() {
        return ReadWriteFile.readFromFile(FILE_NAME);
    }

    @Override
    public List<AvailabilityModel> getByCondition(AvailabilityQueryModel qm) {
      List<AvailabilityModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		List<AvailabilityModel> ret = new ArrayList<AvailabilityModel>();

		for (AvailabilityModel m:list){
			if (qm.getAvailabilityid()!=null&&qm.getAvailabilityid().trim().length()>0){
				if (!qm.getAvailabilityid().equals(m.getAvailabilityid())){
					continue;
				}
			
			
			}
			if (qm.getPrice()>0){
				if (m.getPrice()<qm.getPrice()){
					//the min search price
					continue;
				}
			}
			if (qm.getPrice2()>0){
				if (m.getPrice()>qm.getPrice2()){
                                       // the max search price
					continue;
				}
			}
			if (qm.getDate()>0){
				if (m.getDate()<qm.getDate()){
                                    // the min search date
					continue;
				}
			}
			if (qm.getDate2()>0){
				if (m.getDate()>qm.getDate2()){
                                    // the max search date
					continue;
				}
			}
			
			if (qm.getBed()>0){
				if (m.getBed()<qm.getBed()){
                                    // the min search bed number
					continue;
				}
			}
			if (qm.getBed()>0){
				if (m.getBed()>qm.getBed()){
                                    // the max search bed number
					continue;
				}
			}

			ret.add(m);
		}

		return ret;
    }

    @Override
    public AvailabilityModel getSingle(String Availabilityid) {
        List<AvailabilityModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final AvailabilityModel m = list.get(i);
			if (m.getAvailabilityid().equals(Availabilityid)){
				return m;
			}
		}
		return null;
    }
    
    public static void main(String[] args) {
		
		Availability a = new AvailabilityImpl();
		System.out.println(a.getAll());
	} 
	
}
