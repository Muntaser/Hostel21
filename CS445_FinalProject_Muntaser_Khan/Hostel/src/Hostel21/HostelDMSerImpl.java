package Hostel21;




import java.util.*;

/**
 *
 * @author 
 */
public class HostelDMSerImpl implements HostelDM{
   private static final String FILE_NAME = "Hostel.txt";

    @Override
    public boolean create(HostelModel model) {
        List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
        UidDM dao = UidDMFactory.getUidDM();
		int uid = dao.getNextUid(UidModelEnum.HOSTEL);
		for (HostelModel m:list){
			if (m.getHostelid().equals(model.getHostelid())){
				return false;
			}
		}
		model.setHostelid(String.valueOf(uid));
		list.add(model);
		ReadWriteFile.write2File(list, FILE_NAME);
		return true;
    }

    @Override
    public boolean update(HostelModel model) {
        List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final HostelModel m = list.get(i);
			if (m.getHostelid().equals(model.getHostelid())){
				list.set(i, model);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		return false;
    }

    @Override
    public boolean delete(String Hostelid) {
       List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final HostelModel m = list.get(i);
			if (m.getHostelid().equals(Hostelid)){
				list.remove(i);
				ReadWriteFile.write2File(list, FILE_NAME);
				return true;
			}
		}
		return false;
    }

    @Override
    public List<HostelModel> getAll() {
        return ReadWriteFile.readFromFile(FILE_NAME);
    }

    @Override
    public List<HostelModel> getByCondition(HostelQueryModel qm) {
      List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		List<HostelModel> ret = new ArrayList<HostelModel>();

		for (HostelModel m:list){
			if (qm.getHostelid()!=null&&qm.getHostelid().trim().length()>0){
				if (!qm.getHostelid().equals(m.getHostelid())){
					continue;
				}
			}
			if (qm.getHostelname()!=null&&qm.getHostelname().trim().length()>0){
				if (m.getHostelname().indexOf(qm.getHostelname())==-1){
					continue;
				}
			}


			ret.add(m);
		}

		return ret;
    }

    @Override
    public HostelModel getSingle(String Hostelid) {
        List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final HostelModel m = list.get(i);
			if (m.getHostelid().equals(Hostelid)){
				return m;
			}
		}
		return null;
    }
    
    public static void main(String[] args) {
		
		HostelDM h = new HostelDMSerImpl();
		System.out.println(h.getAll());
	} 
	
}
