package Hostel21;


public class AvailabilityFactory {



		public static Availability getAvailability(){
			return new AvailabilityImpl();
	
	}

}

