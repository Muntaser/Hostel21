


public enum UserTypeEnum {

	ADMIN(1,"Administrator"),
	CUSTORMER(2,"Customer");
	
	
	private final int type;
	private final String name;
	private UserTypeEnum(int type, String name) {
		this.type = type;
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public String getName() {
		return name;
	}
	
	public static String getNameByType(int type){
		for (UserTypeEnum userType:UserTypeEnum.values()){
			if (userType.getType()==type){
				return userType.getName();
			}
		}
		throw new IllegalArgumentException("No such type:"+type+",in UserTypeEnum");
	}
	
	public static int getTypeByName(String name){
		for (UserTypeEnum userType:UserTypeEnum.values()){
			if (userType.getName().equals(name)){
				return userType.getType();
			}
		}
		throw new IllegalArgumentException("No such name:"+name+",in UserTypeEnum");
	}
	
	public static void main(String[] args) {
	System.out.println(UserTypeEnum.getNameByType(1));
	System.out.println(UserTypeEnum.getNameByType(2));

		System.out.println(UserTypeEnum.getTypeByName("Administrator"));
		
	}
	
}


