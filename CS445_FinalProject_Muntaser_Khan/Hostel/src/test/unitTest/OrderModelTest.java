package test.unitTest;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Hostel21.*;


public class OrderModelTest {

	private OrderModel tm;
	@Before
	public void setUp() throws Exception
	{
		this.tm = new OrderModel();
	}
	@Test
	public void testGetEmail() {
        this.tm.setEmail("hello");
		
		Assert.assertEquals("hello", this.tm.getEmail());
	}

	@Test
	public void testSetEmail() {
		this.tm.setEmail("world");
		
		Assert.assertEquals("world", this.tm.getEmail());
	}

	@Test
	public void testGetTotal() {
     this.tm.setTotal(80);
		
		Assert.assertEquals((float)80, this.tm.getTotal());
	}
	

	@Test
	public void testSetTotal() {
		this.tm.setTotal(90);
		
		Assert.assertEquals((float)90, this.tm.getTotal());
	}

	@Test
	public void testGetHostelid() {
		this.tm.setHostelid("132");
		
		Assert.assertEquals("132", this.tm.getHostelid());
	}

	@Test
	public void testSetHostelid() {
       this.tm.setHostelid("333");
		
		Assert.assertEquals("333", this.tm.getHostelid());
	}

	@Test
	public void testGetQuantity() {
		 this.tm.setQuantity(3);
			
			Assert.assertEquals(3, this.tm.getQuantity());
	}

	@Test
	public void testSetQuantity() {
		this.tm.setQuantity(5);
		
		Assert.assertEquals(5, this.tm.getQuantity());
}

	@Test
	public void testGetUnitprice() {
		this.tm.setUnitprice(5);
		
		Assert.assertEquals((float)5, this.tm.getUnitprice());
	}

	@Test
	public void testSetUnitprice() {
		this.tm.setUnitprice(10);
		
		Assert.assertEquals((float)10, this.tm.getUnitprice());
	}

	@Test
	public void testGetOrderid() {
		this.tm.setOrderid("123");
		
		Assert.assertEquals("123", this.tm.getOrderid());
	}

	@Test
	public void testSetOrderid() {
		this.tm.setOrderid("1444");
		
		Assert.assertEquals("1444", this.tm.getOrderid());
	}

	@Test
	public void testGetDateCreate() {
		this.tm.setDateCreate(20130406);
		
		Assert.assertEquals(20130406, this.tm.getDateCreate());
	}

	@Test
	public void testSetDateCreate() {
		this.tm.setDateCreate(20130409);
		
		Assert.assertEquals(20130409, this.tm.getDateCreate());
	}

	@Test
	public void testGetUserid() {
		this.tm.setUserid("9");
		
		Assert.assertEquals("9", this.tm.getUserid());
	}

	@Test
	public void testSetUserid() {
		this.tm.setUserid("10");
		
		Assert.assertEquals("10", this.tm.getUserid());
	}

	@Test
	public void testGetStatus() {
		this.tm.setStatus(1);
		
		Assert.assertEquals(1, this.tm.getStatus());
	}

	@Test
	public void testSetStatus() {
		this.tm.setStatus(2);
		
		Assert.assertEquals(2, this.tm.getStatus());
	}

	@Test
	public void testEqualsObject() {
		this.tm.setOrderid("1");
		
		OrderModel tm2 = new OrderModel();
		tm2.setOrderid("2");
		OrderModel tm3 = new OrderModel();
		tm3.setOrderid("1");
		
		OrderQueryModel cqm = new OrderQueryModel();
		
		Assert.assertEquals(true, this.tm.equals(this.tm));
		Assert.assertEquals(false, this.tm.equals(null));
		Assert.assertEquals(false, this.tm.equals(cqm));
		Assert.assertEquals(false, this.tm.equals(tm2));
		Assert.assertEquals(true, this.tm.equals(tm3));
	}

	@Test
	public void testToString() {
		this.tm.setOrderid("12");
		this.tm.setHostelid("123");
		this.tm.setDateCreate(20130405);
		this.tm.setUserid("1");
		this.tm.setStatus(1);
		this.tm.setUnitprice(10);
		this.tm.setQuantity(90);
		this.tm.setTotal(30);
		this.tm.setEmail("fliu@iit.edu");
		OrderModel tm1=new OrderModel();
		tm1.setOrderid("12");
		tm1.setHostelid("123");
		tm1.setDateCreate(20130405);
		tm1.setUserid("1");
		tm1.setStatus(2);
		tm1.setUnitprice(10);
		tm1.setQuantity(90);
		tm1.setTotal(30);
		tm1.setEmail("fliu@iit.edu");
	
		String result = this.tm.toString();
		String result1=tm1.toString();
		Assert.assertEquals("OrderID: 12, UserID: 1, HostelID: 123, OrderCreateDate: 20130405, status: order completed",result);
		Assert.assertEquals("OrderID: 12, UserID: 1, HostelID: 123, OrderCreateDate: 20130405, status: order cancelled",result1);
		
	}

	@Test
	public void testCompareTo() {
		this.tm.setOrderid("123");
		this.tm.setDateCreate(20130405);
		OrderModel tm2 = new OrderModel();
		tm2.setHostelid("2");
		tm2.setDateCreate(20130409);
		int i=tm.compareTo(tm2);
		System.out.println(i);
		Assert.assertTrue(i<0);
	}

}
