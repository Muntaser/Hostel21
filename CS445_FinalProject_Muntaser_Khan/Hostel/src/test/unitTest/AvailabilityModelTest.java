package test.unitTest;

import static org.junit.Assert.*;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Hostel21.*;




public class AvailabilityModelTest {

	private AvailabilityModel tm;
	@Before
	public void setUp() throws Exception
	{
		this.tm = new AvailabilityModel();
	}
	@Test
	public void testGetAvailabilityid() {
       this.tm.setAvailabilityid("1");
		
		Assert.assertEquals("1", this.tm.getAvailabilityid());
	}

	@Test
	public void testSetAvailabilityid() {
		this.tm.setAvailabilityid("5");
		
		Assert.assertEquals("5", this.tm.getAvailabilityid());
	}

	@Test
	public void testGetRoomID() {
        this.tm.setRoom(2);
		
		Assert.assertEquals(2, this.tm.getRoom());
	}

	@Test
	public void testSetRoomID() {
       this.tm.setRoom(1);
		
		Assert.assertEquals(1, this.tm.getRoom());
	}
	
	





	@Test
	public void testGetBeds() {
        this.tm.setBed(10);
		
		Assert.assertEquals(10, this.tm.getBed());
	}

	@Test
	public void testSetBeds() {
       this.tm.setBed(2);
		
		Assert.assertEquals(2, this.tm.getBed());
	}

	@Test
	public void testGetDate() {
         this.tm.setDate(20130506);
		
		 Assert.assertEquals(20130506, this.tm.getDate());
	}

	@Test
	public void testSetDate() {
		this.tm.setDate(20130507);
		
		 Assert.assertEquals(20130507, this.tm.getDate());
	}



	@Test
	public void testGetPrice() {
		this.tm.setPrice(90);
		
		 Assert.assertEquals((float)90, this.tm.getPrice());
	}

	@Test
	public void testSetPrice() {
		this.tm.setPrice(80);
		
		 Assert.assertEquals((float)80, this.tm.getPrice());
	}
   
	@Test
	public void testEquals()
	{
		this.tm.setAvailabilityid("1");
		
		AvailabilityModel tm2 = new AvailabilityModel();
		tm2.setAvailabilityid("2");
		AvailabilityModel tm3 = new AvailabilityModel();
		tm3.setAvailabilityid("1");
		
		AvailabilityQueryModel cqm = new AvailabilityQueryModel();
		
		Assert.assertEquals(true, this.tm.equals(this.tm));
		Assert.assertEquals(false, this.tm.equals(null));
		Assert.assertEquals(false, this.tm.equals(cqm));
		Assert.assertEquals(false, this.tm.equals(tm2));
		Assert.assertEquals(true, this.tm.equals(tm3));
	}
	@Test
	public void testToString() {
		
		this.tm.setAvailabilityid("123");
		this.tm.setDate(20130405);
		this.tm.setRoom(1);
		this.tm.setBed(10);
		this.tm.setPrice(10);
		String result = this.tm.toString();
		System.out.println(result);
//		"Availability ID:"+ availabilityid+"\n"+"Date:"+ date+ "\n"+ "Room ID:"+ 
//		room+"\n"+ "Bed ID:"+ bed + "\n"+"Price:"+ price
		Assert.assertEquals("Availability ID:123" +","+
				"Date:20130405" +","+
				"Room ID:1" +","+
				"Bed ID:10"+","+
				"Price:10.0", result);
	}

}
