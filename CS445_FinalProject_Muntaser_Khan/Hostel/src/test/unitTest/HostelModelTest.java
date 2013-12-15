package test.unitTest;



import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Hostel21.*;




public class HostelModelTest {

	private HostelModel tm;
	@Before
	public void setUp() throws Exception
	{
		this.tm = new HostelModel();
	}
	@Test
	public void testGetHostelid() {
       this.tm.setHostelid("1");
		
		Assert.assertEquals("1", this.tm.getHostelid());
	}

	@Test
	public void testSetHostelid() {
		this.tm.setHostelid("5");
		
		Assert.assertEquals("5", this.tm.getHostelid());
	}

	@Test
	public void testGetHostelname() {
       this.tm.setHostelname("romantic");
		
		Assert.assertEquals("romantic", this.tm.getHostelname());
	}

	@Test
	public void testSetHostelname() {
	       this.tm.setHostelname("hello");
			
			Assert.assertEquals("hello", this.tm.getHostelname());
	}

	@Test
	public void testGetStreet() {
        this.tm.setStreet("3241 s wabash");
		
		Assert.assertEquals("3241 s wabash", this.tm.getStreet());
	}
	@Test
	public void testSetStreet() {
        this.tm.setStreet("3240 s wabash");
		
		Assert.assertEquals("3240 s wabash", this.tm.getStreet());
	}
	
	@Test
	public void testGetState() {
        this.tm.setState("Illinois");
		
		Assert.assertEquals("Illinois", this.tm.getState());
	}
	


	@Test
	public void testGetCity() {
        this.tm.setCity("Chicago");
		
		Assert.assertEquals("Chicago", this.tm.getCity());
	}

	
	@Test
	public void testGetSmoking() {
         this.tm.setSmoking("N");
		
		 Assert.assertEquals("N", this.tm.getSmoking());
	}
	@Test
	public void testSetSmoking() {
         this.tm.setSmoking("y");
		
		 Assert.assertEquals("y", this.tm.getSmoking());
	}
	@Test
	public void testGetAlcohol() {
         this.tm.setAlcohol("N");
		
		 Assert.assertEquals("N", this.tm.getAlcohol());
	}
	
	@Test
	public void testGetFacebook() {
         this.tm.setFacebook("HOSTEL MAGNIFICENT");
		
		 Assert.assertEquals("HOSTEL MAGNIFICENT", this.tm.getFb());
	}
	@Test
	public void testGetWeb() {
         this.tm.setWeb("magni.hostel21.com");
		
		 Assert.assertEquals("magni.hostel21.com", this.tm.getWeb());
	}
	@Test
	public void testGetEmail() {
         this.tm.setEmail("magni@hostel21.com");
		
		 Assert.assertEquals("magni@hostel21.com", this.tm.getEmail());
	}
	@Test
	public void testGetCheckInTime() {
         this.tm.setCheckInTime("10:00");
		
		 Assert.assertEquals("10:00", this.tm.getCheckInTime());
	}
	@Test
	public void testGetCheckOutTime() {
         this.tm.setCheckOutTime("11:00");
		
		 Assert.assertEquals("11:00", this.tm.getCheckOutTime());
	}
	@Test
	public void testGetCountry() {
		this.tm.setCountry("Germany");
		
		 Assert.assertEquals("Germany", this.tm.getCountry());
	}
	@Test
	public void testGetPhone() {
         this.tm.setPhone("+1-777-666-4444");
		
		 Assert.assertEquals("+1-777-666-4444", this.tm.getPhone());
	}
	@Test
	public void testGetCanDeadLine() {
         this.tm.setCancellationDeadline(50);
		
		 Assert.assertEquals(50, this.tm.getDeadline());
	}
	@Test
	public void testGetCanPen() {
         this.tm.setCancellationPenalty("50%");
		
		 Assert.assertEquals("50%", this.tm.getPenalty());
	}
	@Test
	public void testGetCode() {
         this.tm.setPostalCode(11377);
		
		 Assert.assertEquals(11377, this.tm.getCode());
	}
	@Test
	public void testEquals()
	{
		this.tm.setHostelid("1");
		
		HostelModel tm2 = new HostelModel();
		tm2.setHostelid("2");
		HostelModel tm3 = new HostelModel();
		tm3.setHostelid("1");
		
		HostelQueryModel cqm = new HostelQueryModel();
		
		Assert.assertEquals(true, this.tm.equals(this.tm));
		Assert.assertEquals(false, this.tm.equals(null));
		Assert.assertEquals(false, this.tm.equals(cqm));
		Assert.assertEquals(false, this.tm.equals(tm2));
		Assert.assertEquals(true, this.tm.equals(tm3));
	}
	@Test
	public void testToString() {
		this.tm.setHostelname("fantastic");
		this.tm.setHostelid("123");
		this.tm.setAlcohol("N");
		this.tm.setCancellationDeadline(49);
		this.tm.setCancellationPenalty("80%");
		this.tm.setCheckInTime("13:00");
		this.tm.setCheckOutTime("09:00");
		this.tm.setCity("Dhaka");
		this.tm.setCountry("Portugal");
		this.tm.setEmail("fantastic@hostel21.com");
		this.tm.setWeb("fantastic.hostel21.com");
		this.tm.setFacebook("Hostel 21-fantastic");
		this.tm.setPhone("+1-333-444-5555");
		this.tm.setPostalCode(60616);
		this.tm.setSmoking("N");
		this.tm.setState("Texas");
		this.tm.setStreet("1234 N Wabash Avenue");
		
	
		String result = this.tm.toString();
		System.out.println(result);
		Assert.assertEquals("Hostel id: 123, Hostel branch name: fantastic, Street: 1234 N Wabash Avenue,  City: Dhaka, State: Texas, postal code: 60616, Country:Portugal, phone:+1-333-444-5555, email:fantastic@hostel21.com, facebook:Hostel 21-fantastic, web:fantastic.hostel21.com,Check In time:13:00, Check Out Time:09:00, Smoking:N, alcohol:N, Cancellation Deadline:49, Availability:null", result);
	}


}
