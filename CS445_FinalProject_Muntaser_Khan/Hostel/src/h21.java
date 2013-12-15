
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// this class is for the command line interface
public class h21 {

	protected static loadFile l;
    HostelDMSerImpl hm;
 
	protected static void initialize() // init
	{
		
		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		initialize();
		
		if (interpretCmdLineArgs(args) != true)
		{
		printUsage();
		}
		return;
	}
	
	// validates the passed command line arguments and returns true if they're valid and action taken, else returns false...
	protected static boolean interpretCmdLineArgs(String[] args)
	{
		
		int userid=680;
		UserDMSerImpl uimpl=new UserDMSerImpl();
		UserModel u=new UserModel(); 
		Availability a=new AvailabilityImpl();
		HostelDM hostel=new HostelDMSerImpl();
		HostelDMSerImpl himpl=new HostelDMSerImpl();
		AvailabilityImpl aimpl=new AvailabilityImpl();
		List <UserModel> umodelist =new ArrayList<UserModel>();
		List <HostelModel> hmodelist =new ArrayList<HostelModel>();
		HostelModel hmodel=new HostelModel();
		HostelQueryModel hq=new HostelQueryModel();
		if (args.length < 1) // no arguments
		{
			
			return false;
		}
		
		
		
		
	
		if (args.length == 1) // 1 argument
		{
			//hmodel.setHostelname(hmodelist.get(0).getHostelname());
			if (args[0].compareTo("search") == 0) {

				for(int i=0;i<himpl.getAll().size();i++){
					
					System.out.println(himpl.getAll().toString()+"\n");
						
						}
				
			return true;
			}
		}
		
			
						if (args.length==3 && args[0].compareTo("admin") == 0) 
					{
							Scanner scan=new Scanner(System.in);
							System.out.println("Enter username");
							String username=scan.nextLine();
							System.out.println("Enter password");
							String password=scan.nextLine();
							if(uimpl.isOwner(username,password)==true){
								System.out.println("Welcome Admin");
							if (args[1].compareTo("load") == 0){
								
									String fileName=args[2];
									l = new loadFile();
									
									hmodelist.addAll(l.loadFromFile(fileName));
									

							
											
									
									return true;
								
							}
					}
							else{
								System.out.println("You are a user, can't execute this command");
								return false;
							}
			}
						else if(args.length==7){
						
							
							if(args[0].compareTo("search")==0 && args[1].compareTo("--city")==0 && args[3].compareTo("--start_date")==0 && args[5].compareTo("--end_date")==0){
								String city=args[2];
								String startDate=args[4];
								String endDate=args[6];
								List<HostelModel> hostels=new ArrayList<HostelModel>();
								for(int i=0;i<himpl.getByCityStartEndDate(city, startDate, endDate).size();i++){
									System.out.println(himpl.getByCityStartEndDate(city, startDate, endDate).toString());
								}

							}
						}
						else if(args.length==8){
						 if (args[0].compareTo("user") == 0)
							{
								if (args[1].compareTo("add") == 0) // 
								{
									
									if (args[2].compareTo("--first_name") == 0 && args[4].compareTo("--last_name") == 0 && args[6].compareTo("--email") == 0){
										UserModel u1=new UserModel();
										u1.setName(args[3]+" "+args[5]);
										u1.setUuid(""+userid);
										u1.setEmail(args[7]);
										uimpl.create(u1);
	
										for(int i=0;i<uimpl.getAll().size();i++){
											System.out.println(uimpl.getAll().toString()+"\n");
												
												}
										
										
										userid++;
									}
									
								}
//								if (args[1].compareTo("change") == 0) {
//									if (args[2].compareTo("--user_id") == 0 && args[4].compareTo("--first_name") == 0 && args[4].compareTo("--last_name") == 0 && args[8].compareTo("--email") == 0){					
//								}
//							
//							}
								}
						}
						
						else  if (args.length==3 && args[0].compareTo("search")==0 && args[1].compareTo("--email")==0){
								UserModel usearch= uimpl.getUserByEmail(args[2]);
								System.out.println(usearch.toString());
							 }
						
					
		

	
							else{
								return false;
							}
		return true;
	
							}
	
	
	
	
	protected static void printUsage() {
		System.out.println("Welcome to Command Line Interface of the Hostel 21 Software !!");
		System.out.println("................................................................");
		
		System.out.println("General format of command:");
		System.out.println("\th21 command [ command_options [ arguments ] ]");
		System.out.println("\tcommand => A command such as serch, user, book or admin");
		System.out.println("\tcommand_options => (Optional) options specific to the command such as hostel view, user add, etc");
		System.out.println("\targuments => (Optional) arguments specific to the command and command_options ");
		System.out.println("\t Commands:");
		System.out.println("\t\t search");
		System.out.println("\t\t user add,change, view");
		System.out.println("\t\t book add, cancel, view");
		System.out.println("\t\t admin load,revenue,occupancy");
		System.out.println();
		System.out.println("----------Possible Usages:------");
		System.out.println();
		System.out.println("h21 admin load ");
		System.out.println("\tIt will ask username and password: Enter username: Muntaser and Password:123 to login as admin");
		System.out.println("\t will load all the hostels in the system from the xml file");
		
		System.out.println();
		System.out.println("h21 search ");
		System.out.println("\t This shows all the hostel informations for the customer that have been in past and present");
		System.out.println("h21 search --city San Francisco --start_date 20140701 --end_date 20140704");
		System.out.println("\t will show number of beds with the price range in San Francisco city hostel with hostel id in the date range and also the search id,");
	
		System.out.println("h21 search --city San Francisco --start_date 20140701 --end_date 20140704 --beds 1");
		System.out.println("\t will show the room and price with specific number of beds including the search id,");
		System.out.println("h21 user add --first_name muntaser --last_name khan --email mkhan12@iit.edu");
		System.out.println("\t will add this user in the customer list");
		
		System.out.println("h21 search --email mkhan12@iit.edu");
		System.out.println("\t will show the user information with this email");
		
		

	}
	

}
