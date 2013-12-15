




import java.util.List;

/**
 *
 * @author 
 */
public interface Availability {
        public boolean create(AvailabilityModel model);
	public boolean update(AvailabilityModel model);
	public boolean delete(String Availabilityid);
	public List<AvailabilityModel> getAll();
	public List<AvailabilityModel> getByCondition(AvailabilityQueryModel qm);
	public AvailabilityModel getSingle(String Availabilityid);
}