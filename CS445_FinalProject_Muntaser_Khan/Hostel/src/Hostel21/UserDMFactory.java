package Hostel21;





public class UserDMFactory {


		public static UserDM getUserDM(){
			return new UserDMSerImpl();
		}
		
		
	}
