package Hostel21;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;







// this class is for the command line interface
public class h21 {

	protected static loadFile l;

	protected static void initialize() // init
	{
		l = new loadFile();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		initialize();
		
		if (interpretCmdLineArgs(args) != true)
		{
	//	printUsage();
		}
		return;
	}
	
	// validates the passed command line arguments and returns true if they're valid and action taken, else returns false...
	protected static boolean interpretCmdLineArgs(String[] args)
	{
		UserModel u=new UserModel();
		int userid=680;
		HostelDMSerImpl himpl=new HostelDMSerImpl();
		//HostelQueryModel hq=new 
		if (args.length < 1) // no arguments
		{
			return false;
		}
	
		

						if (args[0].compareTo("admin") == 0) 
					{
							if (args[1].compareTo("load") == 0){
								
									String fileName=args[2];
									l = new loadFile();
									l.loadFromFile(fileName);
									return true;
								
							}
					}
						if(args[0].compareTo("search")==0){
							if(args[1].compareTo("--city")==0 && args[3].compareTo("--start_date")==0 && args[5].compareTo("--end_date")==0){
								String city=args[2];
								long startDate=Long.parseLong(args[4]);
								long endDate=Long.parseLong(args[6]);
								List<HostelModel> ret = new ArrayList<HostelModel>();
								for(int i=0;i<ret.size();i++){
									//if(city.equals(himpl.getByCondition().){
										
									}
								}
								
								
							}
						
						
						else if (args[0].compareTo("user") == 0)
							{
								if (args[1].compareTo("add") == 0) // 
								{
									
									if (args[2].compareTo("--first_name") == 0 && args[4].compareTo("--last_name") == 0 && args[6].compareTo("--email") == 0){
									
										
										u.setName(args[3]+" "+args[5]);
										u.setUuid(""+userid);
										u.setEmail(args[7]);
										//u.equals(u);
										System.out.println(u.toString());
										userid++;
									}
									
								}
								
								
								}
		
							
//							}
//							else if (args.length == 6 && args[2].compareTo("--start_date") == 0 && args[3].length() == 8 && 
//									args[4].compareTo("--end_date") == 0 && args[5].length() == 8)
//								// tour view --start_date 20130701 --end_date 20130731
//							{
//								// mm/dd/yyyy format
//								String	checkIn = args[3].substring(4, 6) + "/" + args[3].substring(6, 8) + "/" + args[3].substring(0, 4);
//								String	enddate = args[5].substring(4, 6) + "/" + args[5].substring(6, 8) + "/" + args[5].substring(0, 4);
//								
//								tourlist = tourform.searchTourInfo(checkIn, enddate);
//								// fall through below to print the tour info
//							}
							else
								return false;
		return true;
							}
	
					
					
			
				
		
	
			
		
//			LinklistNode	tourlist = null;
//			
//			
//			 if (args.length >= 2) // validate the command_option and command_arguments
//			{
//				if (args[1].compareTo("--city") == 0) // tour view ...
//				{
//					if (args.length == 4 && args[2].compareTo("--hostel_id") == 0) // tour view --tour_id 123 
//					{
//					
//						String 	city = (args[3]);
				
//						tourlist = tourform.searchTourInfo(hostelId); // get the info of specific tour_id
//						// fall through below to print the tour info
//					}
//					else if (args.length == 6 && args[2].compareTo("--start_date") == 0 && args[3].length() == 8 && 
//							args[4].compareTo("--end_date") == 0 && args[5].length() == 8)
//						// tour view --start_date 20130701 --end_date 20130731
//					{
//						// mm/dd/yyyy format
//						String	checkIn = args[3].substring(4, 6) + "/" + args[3].substring(6, 8) + "/" + args[3].substring(0, 4);
//						String	enddate = args[5].substring(4, 6) + "/" + args[5].substring(6, 8) + "/" + args[5].substring(0, 4);
//						
//						tourlist = tourform.searchTourInfo(checkIn, enddate);
//						// fall through below to print the tour info
//					}
//					else
//						return false;
//					
//					if (tourlist == null) // some error, no tours have returned
//					{
//						System.out.println("No tour information is returned for arguments passed...");
//						System.out.println();
//						return false;
//					}
//					while (tourlist != null)
//					{
//						HostelDetail		details = (HostelDetail) tourlist.getElement();
//						StringTokenizer	dateToken = new StringTokenizer(details.getcheckInTime());
//						
//						// Example format: Tour id: 123. Date: 7/2/2013. Start: 10:00. Duration: 90m. Available Beds: 8. Price: $25. Booked: 3. Name: Intro to scuba.
//						System.out.println("Tour id: " + details.gethostelId() + ". " +
//								"Date: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR") + ". " +
//								"Start: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR") + ". " +
//								"Duration: " + (details.getDurationHours() * 60 + details.getDurationMinutes()) + "m. " +
//								"Available Beds: " + (details.getMaxNumBeds() - details.getCurrentNumBedsBooked()) + ". " +
//								"Price: $" + details.getCurrentPrice() + ". " +
//								"Booked: " + details.getCurrentNumBedsBooked() + ". " +
//								"Name: " + details.getName() + "."
//								);
//						tourlist = tourlist.getNext();
//					}
//					return true;
//				}
//				else if (args[1].compareTo("load") == 0) // tour load ...
//				{
//					if (args.length == 4 && args[2].compareTo("--file") == 0) // tour load --file file.xml 
//					{
//						tourlist = tourform.loadConfigFile(args[3]); // load the config file
//						
//						if (tourlist == null) // some error, no tours have returned
//						{
//							System.out.println("No tour information is returned for arguments passed...");
//							System.out.println();
//							return false;
//						}
//						int		numTours = 0;
//						
//						while (tourlist != null)
//						{
//							numTours++;
//							
//							HostelDetail		details = (HostelDetail) tourlist.getElement();
//							StringTokenizer	dateToken = new StringTokenizer(details.getcheckInTime());
//							
//							// Example format: Tour id: 123. Date: 7/2/2013. Start: 10:00. Duration: 90m. Available Beds: 8. Price: $25. Booked: 3. Name: Intro to scuba.
//							System.out.println("Tour id: " + details.gethostelId() + ". " +
//									"Date: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR") + ". " +
//									"Start: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR") + ". " +
//									"Duration: " + (details.getDurationHours() * 60 + details.getDurationMinutes()) + "m. " +
//									"Available Beds: " + (details.getMaxNumBeds() - details.getCurrentNumBedsBooked()) + ". " +
//									"Price: $" + details.getCurrentPrice() + ". " +
//									"Booked: " + details.getCurrentNumBedsBooked() + ". " +
//									"Name: " + details.getName() + "."
//									);
//							tourlist = tourlist.getNext();
//						}
//						System.out.println(numTours + " tours created");
//						return true;
//					}
//					else
//						return false;
//				}
//				else if (args[1].compareTo("add") == 0) // tour add ...
//				{
//					if (args.length == 16 && args[2].compareTo("--date") == 0 && args[3].length() == 8 &&
//						args[4].compareTo("--start_time") == 0 && args[5].length() == 5 && args[5].charAt(2) == ':' &&
//						args[6].compareTo("--duration") == 0 &&
//						args[8].compareTo("--price") == 0 &&
//						args[10].compareTo("--Beds") == 0 &&
//						args[12].compareTo("--name") == 0 &&
//						args[14].compareTo("--description") == 0
//						) 
//					// tour add --date 20130702 --start_time 10:00 --duration 90 --price 25 --Beds 8 
//						 // --name "Intro to scuba" --description "Great for newcomers to scuba diving"
//					{
//						try
//						{
//							LinklistNode	tour = null;
//							// try parsing the numbers
//							long	temp = Long.parseLong(args[3]); // date
//							temp = Long.parseLong(args[5].substring(0, 2)); // time hour
//							temp = Long.parseLong(args[5].substring(3, 5)); // time min
//							long duration = Long.parseLong(args[7]); // duration
//							long currentprice = Long.parseLong(args[9]); // price
//							long maxnumBeds = Long.parseLong(args[11]); // maxnumBeds
//
//							// mm/dd/yyyy format
//							String	checkIntime = args[3].substring(4, 6) + "/" + args[3].substring(6, 8) + "/" + args[3].substring(0, 4);
//							checkIntime += " " + args[5];
//							
//							if ((tour = tourform.createTour(args[13], "", args[15], checkIntime, duration / 60, duration % 60, 
//									currentprice, maxnumBeds, 1, 0, 0)) != null)
//							{
//								HostelDetail	details = (HostelDetail)tour.getElement();
//								StringTokenizer	dateToken = new StringTokenizer(details.getcheckInTime());
//								
//								System.out.println("Tour id: " + details.gethostelId());
//								System.out.println("Date: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR"));
//								System.out.println("Start time: " + (dateToken.hasMoreTokens() ? dateToken.nextToken() : "ERROR"));
//								System.out.println("Duration: " + (details.getDurationHours() * 60 + details.getDurationMinutes()) + "m");
//								System.out.println("Price per Bed: $" + details.getCurrentPrice());
//								System.out.println("Beds: " + details.getMaxNumBeds());
//								System.out.println("Tour name: " + details.getName());
//								System.out.println("Tour description: " + details.getDescription());
//								return true;
//							}
//							return false;
//						} catch (NumberFormatException ex)
//						{
//							return false;
//						}
//					}
//					else
//						return false;
//				}
//				else if (args[1].compareTo("delete") == 0) // tour delete ...
//				{
//					if (args.length == 4 && args[2].compareTo("--tour_id") == 0) 
//					// tour delete --tour_id 123
//					{
//						try
//						{
//							LinklistNode	tour = null;
//							// try parsing the number
//							long	hostelId = Long.parseLong(args[3]); // hostelId
//
//							if ((tour = tourform.deleteTour(hostelId)) != null)
//							{
//								HostelDetail	details = (HostelDetail)tour.getElement();
//								
//								System.out.println("Tour id: " + details.gethostelId() + " has been deleted");
//								return true;
//							}
//							System.out.println("Tour id: " + hostelId + " either doesn't exist or can't be deleted");
//							return true;
//						} catch (NumberFormatException ex)
//						{
//							return false;
//						}
//					}
//					else
//						return false;
//				}
//				else if (args[1].compareTo("cancel") == 0) // tour cancel ...
//				{
//					if (args.length == 4 && args[2].compareTo("--tour_id") == 0) 
//					// tour cancel --tour_id 123
//					{
//						try
//						{
//							LinklistNode	tour = null;
//							// try parsing the number
//							long	hostelId = Long.parseLong(args[3]); // hostelId
//
//							if ((tour = tourform.cancelTour(hostelId)) != null)
//							{
//								HostelDetail	details = (HostelDetail)tour.getElement();
//								
//								System.out.println("Tour id: " + details.gethostelId() + " has been cancelled");
//								
//								LinklistNode	bookinglist = details.getBookingList();
//								
//								while (bookinglist != null)
//								{
//									BookingDetail	bookingdetail = (BookingDetail) bookinglist.getElement();
//									if (bookingdetail != null)
//									{
//										System.out.println("User: " + bookingdetail.getCustomerDetails().getFirstname() + " " +
//												bookingdetail.getCustomerDetails().getLastname() + " notified. " +
//												bookingdetail.getCurrentNumBedsBooked() + " Bed(s). " + "$" +
//												bookingdetail.getCurrentTotalPrice() + " refund initiated.");
//									}
//									bookinglist = bookinglist.getNext();
//								}
//								return true;
//							}
//							System.out.println("Tour id: " + hostelId + " either doesn't exist or can't be cancelled");
//							return true;
//						} catch (NumberFormatException ex)
//						{
//							return false;
//						}
//					}
//					else
//						return false;
//				}
//				else
//					return false;
//			}
//			else
//				return false;
//			
//		} // end of "tour" command
//		else if (args[0].compareTo("user") == 0)
//		{
//			if (args[1].compareTo("add") == 0) // tour add ...
//			{
//				// user add --first_name --last_name --email [ --cc_number --expiration_date --security_code --phone ]
//				
//				LinklistNode	customer = null;
//				
//				// user add --first_name Bob --last_name Retter --email bob.retter@example.com
//				if ((args.length == 8 && args[2].compareTo("--first_name") == 0 &&
//						args[4].compareTo("--last_name") == 0 && args[6].compareTo("--email") == 0) ||
//					(args.length == 16 && args[2].compareTo("--first_name") == 0 &&
//						args[4].compareTo("--last_name") == 0 && args[6].compareTo("--email") == 0 &&
//						args[8].compareTo("--cc_number") == 0 && args[10].compareTo("--expiration_date") == 0 &&
//						args[12].compareTo("--security_code") == 0 && args[14].compareTo("--phone") == 0))
//				{
//					StringTokenizer	emailToken = new StringTokenizer(args[7], "@");
//					if (emailToken.countTokens() <= 1) // means, char @ isn't present
//						return false;
//					
//					// find out current date/time
//					DateFormat 	dateformat = new SimpleDateFormat("MM/dd/yyyy - HH:mm");
//					Date		currentdatetime = new Date();
//					String		dateTimeCreated = dateformat.format(currentdatetime);
//					
//					String creditCardNo =  (args.length == 16 ? args[9] : "");
//					String expirationDate =  (args.length == 16 ? args[11] : "");
//					int cardSecurityCode = 0;
//					try
//					{
//						cardSecurityCode = (args.length == 16 ? Integer.parseInt(args[13]) : 0);
//					} catch (NumberFormatException ex)
//					{
//						return false;
//					}
//					String phone = (args.length == 16 ? args[15] : "");
//					
//					if ((customer = tourform.addCustomer(args[3], args[5], args[7], creditCardNo, expirationDate, phone, 
//							cardSecurityCode, "", dateTimeCreated)) != null)
//					{
//						CustomerDetail	details = (CustomerDetail)customer.getElement();
//						
//						System.out.println("User id: " + details.getCustomerId());
//						System.out.println("Name: " + details.getFirstname() + " " + details.getLastname());
//						System.out.println("Email: " + details.getEmailId());
//						System.out.println("Date created: " + details.getDateTimeCreated());
//						return true;
//					}
//					else
//					{
//						System.out.println("User with the email " + args[7] + " exists already");
//						return true;
//					}
//				}
//				return false;
//			} // end of "add"
//			else if (args[1].compareTo("view") == 0) // user view ...
//			{
//				return false;
//			} // end of "view"
//			return false;
//		}
//		else if (args[0].compareTo("book") == 0)
//		{
//			return false;
//		}
//		else if (args[0].compareTo("admin") == 0)
//		{
//			return false;
//		}
//		else
//		{
//			return false;
//		}
//	}
	
	protected static void printUsage() {
//		System.out.println("Welcome to Command Line Interface of the Hostel 21 Software !!");
//		System.out.println();
//		System.out.println("Usage:");
//		System.out.println("\th21 command [ command_options [ arguments ] ]");
//		System.out.println("\tcommand => A command such as serch, user, book or admin");
//		System.out.println("\tcommand_options => (Optional) options specific to the command such as hostel view, user add, etc");
//		System.out.println("\targuments => (Optional) arguments specific to the command and command_options such as hostel view --start_date 20130701 --end_date 20130731");
//		System.out.println();
//		System.out.println("\t Commands:");
//		System.out.println("\t\t hostel add, delete, cancel, view, load");
//		System.out.println("\t\t user add,change, view");
//		System.out.println("\t\t book add, cancel, view");
//		System.out.println("\t\t admin");
//		System.out.println();
//		System.out.println("Possible Usages:------");
//		System.out.println();
//		System.out.println("h21 search");
//		System.out.println("\t will show all the hostels in the system, past and present");
//		System.out.println();
//		System.out.println("h21 search --start_date 20130701 --end_date 20130731");
//		System.out.println("\t will show only the tours in the system between 7/1/2013 and 7/31/2013. In this example, tour is the command,");
//		System.out.println("\t view is the command option, and start_date and end_date are arguments for view, introduced by double dashes (the long form of arguments)");
//		System.out.println();
//		System.out.println("lfss tour add --date 20130702 --start_time 10:00 --duration 90 --price 25 --Beds 8 \\");
//		System.out.println("--name \"Intro to scuba\" --description \"Great for newcomers to scuba diving\"");
//		System.out.println("\t (Note:- The price should only be an integer not fraction)");
//		System.out.println("\t The command will add the tour and return the tour detail, including the tour_id, such as:");
//		System.out.println("\t Tour id: 123");
//		System.out.println("\t Date: 7/2/2013");
//		System.out.println("\t Start time: 10:00");
//		System.out.println("\t Duration: 90m");
//		System.out.println("\t Price per Bed: $25");
//		System.out.println("\t Beds: 8");
//		System.out.println("\t Tour name: Intro to scuba");
//		System.out.println("\t Tour description: Great for newcomers to scuba diving");
//		System.out.println();
//		System.out.println("lfss tour delete --tour_id 123");
//		System.out.println("\t The command will delete the tour with the specified tour_id provided that no Bed on this tour has been booked and return:");
//		System.out.println("\t Tour id: 123 has been deleted");
//		System.out.println();
//		System.out.println("lfss tour cancel --tour_id 123");
//		System.out.println("\t The command will cancel the tour with the specified tour_id: money will be refunded to all customers ");
//		System.out.println("\t who have booked this tour and each of them will be notified of the cancellation. It'll return such as:");
//		System.out.println("\t Tour id: 123 has been cancelled. User: John Smith notified. 1 Bed. $25 refund initiated. ");
//		System.out.println("\t User: Alice Rosen notified. 2 Beds. $50 refund initiated.");
//		System.out.println();
//		System.out.println("lfss tour [ view ] [ --tour_id ] [ --start_date ] [ --end_date ]");
//		System.out.println("\t This is the default command option for tour. Without any tour_id and with no dates all the tours in the system will be displayed, ");
//		System.out.println("\t active or cancelled. If a date is provided only tours after or before the date will be displayed. ");
//		System.out.println("\t If a tour_id is provided, then only information about that tour will be displayed");
//		System.out.println("\t Example: lfss tour, will return:");
//		System.out.println("\t Tour id: 123. Date: 7/2/2013. Start: 10:00. Duration: 90m. Beds: 8. Price: $25. Booked: 3. Name: Intro to scuba.");
//		System.out.println("\t Tour id: 124. Date: 7/2/2013. Start: 15:00. Duration: 120m. Beds: 4. Price: $50. Booked: 4. Name: Advanced scuba.");
//		System.out.println();
//		System.out.println("lfss tour load --file new_tours_20130409.xml");
//		System.out.println("\t This will load tour information from XML file only (JSON not supported). The command will print information about all the tours created, like:");
//		System.out.println("\t 3 tours created");
//		System.out.println("\t Tour id: 125. Date: 7/3/2013. Start: 10:00. Duration: 90m. Beds: 8. Price: $21. Booked: 0. Name: Intro to scuba.");
//		System.out.println("\t Tour id: 126. Date: 7/3/2013. Start: 15:00. Duration: 120m. Beds: 5. Price: $50. Booked: 0. Name: Advanced scuba.");
//		System.out.println("\t Tour id: 127. Date: 7/4/2013. Start: 10:00. Duration: 90m. Beds: 6. Price: $40. Booked: 0. Name: Advanced scuba 2.");
//		System.out.println();
//		System.out.println("lfss user add --first_name --last_name --email [ --cc_number --expiration_date --security_code --phone ]");
//		System.out.println("\t The command will create a new user and return the user detail, including the user_id. ");
//		System.out.println("\t If a user with the same email address exists, then the command will return an error and detail about the existing user.");
//		System.out.println("\t Example:");
//		System.out.println("\t lfss user add --first_name Bob --last_name Retter --email bob.retter@example.com");
//		System.out.println("\t User id: 1234");
//		System.out.println("\t Name: Bob Retter");
//		System.out.println("\t Email: bob.retter@example.com");
//		System.out.println("\t Date created: 4/9/2013 - 17:18");
	}
	

}
