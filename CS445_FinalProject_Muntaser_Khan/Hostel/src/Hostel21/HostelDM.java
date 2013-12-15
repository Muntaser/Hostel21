package Hostel21;




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
	public HostelModel getSingle(String Hostelid);
}
