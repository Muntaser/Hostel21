


/**
 * specific in-control user type
 * @author 
 *
 */
public enum UidModelEnum {

	USER("UserModel"), 
	HOSTEL("HostelModel"), 
	ORDER("OrderModel"),
	AVAILABILITY("AvailabilityModel"),
	SEARCH("SearchModel");
	

	private final String name;

	private UidModelEnum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
