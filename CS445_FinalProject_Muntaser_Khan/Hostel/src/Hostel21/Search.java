package Hostel21;


import java.util.List;

/**
 *
 * @author 
 */
public interface Search {
        public boolean create(SearchModel model);
	public boolean update(SearchModel model);
	public boolean delete(String Searchid);
	public List<SearchModel> getAll();
	public List<SearchModel> getByCondition(SearchQueryModel qm);
	public SearchModel getSingle(String Searchid);
}

