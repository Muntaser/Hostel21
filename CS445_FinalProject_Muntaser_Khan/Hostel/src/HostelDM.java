



import java.util.List;

/**
 *
 * @author 
 */
public interface HostelDM {
        public boolean create(HostelModel model);
	public boolean update(HostelModel model);
	public boolean delete(String Hostelid);
	public List<HostelModel> getAll();
	public List<HostelModel> getByCondition(HostelQueryModel qm);
	public List<HostelModel> getByCityStartEndDate(String city, String startDate, String endDate);
	public HostelModel getSingle(String Hostelid);
}
