package Hostel21;





public class UidDMFactory {
	public static UidDM getUidDM(){
		return new UidDMSerImpl();
	}
}
