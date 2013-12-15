package Hostel21;



	/*
	 * To change this template, choose Tools | Templates
	 * and open the template in the editor.
	 */



	import java.util.ArrayList;
import java.util.List;

	public class SearchImpl implements Search{
	  private static final String FILE_NAME = "Search.txt";
	    @Override
	    public boolean create(SearchModel model) {
	        List<SearchModel> list = ReadWriteFile.readFromFile(FILE_NAME);
	        UidDM DM = UidDMFactory.getUidDM();
	        int searchid = DM.getNextUid(UidModelEnum.SEARCH);
			for (SearchModel m:list){
				if (m.getSearchid().equals(model.getSearchid())){
					return false;
				}
			}
			model.setSearchid(String.valueOf(searchid));
			list.add(model);
			ReadWriteFile.write2File(list, FILE_NAME);
			return true;
	    }

	    @Override
	    public boolean update(SearchModel model) {
	        List<SearchModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			for (int i=0;i<list.size();i++){
				final SearchModel m = list.get(i);
				if (m.getSearchid().equals(model.getSearchid())){
					list.set(i, model);
					ReadWriteFile.write2File(list, FILE_NAME);
					return true;
				}
			}
			return false;
	    }

	    @Override
	    public boolean delete(String Searchid) {
	       List<SearchModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			for (int i=0;i<list.size();i++){
				final SearchModel m = list.get(i);
				if (m.getSearchid().equals(Searchid)){
					list.remove(i);
					ReadWriteFile.write2File(list, FILE_NAME);
					return true;
				}
			}
			return false;
	    }

	    @Override
	    public List<SearchModel> getAll() {
	        return ReadWriteFile.readFromFile(FILE_NAME);
	    }

	    @Override
	    public List<SearchModel> getByCondition(SearchQueryModel qm) {
	      List<SearchModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			List<SearchModel> ret = new ArrayList<SearchModel>();

			for (SearchModel m:list){
				if (qm.getSearchid()!=null&&qm.getSearchid().trim().length()>0){
					if (!qm.getSearchid().equals(m.getSearchid())){
						continue;
					}
				}
				


				ret.add(m);
			}

			return ret;
	    }

	    @Override
	    public SearchModel getSingle(String Searchid) {
	        List<SearchModel> list = ReadWriteFile.readFromFile(FILE_NAME);
			for (int i=0;i<list.size();i++){
				final SearchModel m = list.get(i);
				if (m.getSearchid().equals(Searchid)){
					return m;
				}
			}
			return null;
	    }
	    
	    public static void main(String[] args) {
			
			Search h = new SearchImpl();
			System.out.println(h.getAll());
		} 

}
