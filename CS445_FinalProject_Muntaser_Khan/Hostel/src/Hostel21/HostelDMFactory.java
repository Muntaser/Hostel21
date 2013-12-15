package Hostel21;




public class HostelDMFactory {


		public static HostelDM getHostelDao(){
			return new HostelDMSerImpl();
	
	}

}
