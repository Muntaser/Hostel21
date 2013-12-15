



import java.text.ParseException;
import java.text.SimpleDateFormat;
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
//			if (qm.getHostelid()!=null&&qm.getHostelid().trim().length()>0){
//				if (!qm.getHostelid().equals(m.getHostelid())){
//					continue;
//				}
//			}
			if (qm.getHostelname2()!=null&&qm.getHostelname2().trim().length()>0){
				if (m.getHostelname().indexOf(qm.getHostelname2())==-1){
					if (!qm.getHostelname2().equals(m.getHostelname())){
					continue;
					}
					else{
						System.out.println("Duplicate Hostel name");
					}
				}
			}


			ret.add(m);
		}

		return ret;
    }
    public List<HostelModel> getByCityStartEndDate(String city, String startDate, String endDate){
    	List<HostelModel> hostelList=ReadWriteFile.readFromFile(FILE_NAME);
    	List<HostelModel> queriedHostelList=new ArrayList<HostelModel>();
    	ArrayList<AvailabilityModel> queriedAvailabilityList=new ArrayList<AvailabilityModel>();
    	HostelModel hmodel=new HostelModel();
    	Date startDateDate= null;
		Date endDateDate = null;
		Date currentDate = null;
    	
    	try {
			startDateDate = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(startDate);
			endDateDate = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(endDate);
			
			for(HostelModel h : hostelList){
	    		if(h.getCity().equals(city)){
	    			for(int i=0; i<h.getAvailability().size();i++){
	    				String date=String.valueOf(h.getAvailability().get(i).getDate());
	        			currentDate = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).parse(date);
	        			
	        			//if current date is between start and end dates, add to queriedHostelList
	    				if(startDateDate.compareTo(currentDate)<=0 && endDateDate.compareTo(currentDate)>=0){
	    					queriedAvailabilityList.add(h.getAvailability().get(i));
	    				}
	        		}
	    			h.setAvailability(queriedAvailabilityList);
	    			queriedHostelList.add(h);
	    		}
	    		
	    	}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
    	
    	return queriedHostelList;
    	
    }
  
    @Override
    public HostelModel getSingle(String Hostelid) {
        List<HostelModel> list = ReadWriteFile.readFromFile(FILE_NAME);
		for (int i=0;i<list.size();i++){
			final HostelModel m = list.get(i);
			if (m.getHostelid()==(Hostelid)){
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
