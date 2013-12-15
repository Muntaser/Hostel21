



public class LoginEbo implements LoginEbi {

	@Override
	public String login(String name, String pwd) {
	
		UserDM DM=UserDMFactory.getUserDM();
		UserModel user=DM.getUserByName(name);
		if(user==null){
			return "Username does not exist!";
		}else{
			if(!user.getPwd().equals(pwd)){
				return "The password is not correct!";
			}else
				return null;
		}
	}

	public static void main(String[] args){
		UserDM DM=new UserDMSerImpl();
		LoginEbi ebi=new LoginEbo();
		System.out.println(ebi.login("SOUROV", "1"));
		System.out.println(ebi.login("MUNTASER", "1"));
	}
}
