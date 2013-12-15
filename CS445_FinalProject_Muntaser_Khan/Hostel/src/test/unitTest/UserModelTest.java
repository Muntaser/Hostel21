package test.unitTest;


import org.junit.Before;

import Hostel21.*;

import junit.framework.Assert;
import junit.framework.TestCase;

public class UserModelTest extends TestCase {
	private UserModel um;
	@Before
	protected void setUp() throws Exception
	{
		this.um = new UserModel();
	}
	public void testSetName()
	{
		this.um.setName("hello");
		
		Assert.assertEquals("hello", this.um.getName());
	}
	
	public void testGetName()
	{
		this.um.setName("world");
		
		Assert.assertEquals("world", this.um.getName());
	}
	
	public void testSetUuid()
	{
		this.um.setUuid("123");
		
		Assert.assertEquals("123", this.um.getUuid());
	}
	
	public void testGetUuid()
	{
		this.um.setUuid("here");
		
		Assert.assertEquals("here", this.um.getUuid());
	}
	
	public void testSetPwd()
	{
		this.um.setPwd("123");
		
		Assert.assertEquals("123", this.um.getPwd());
	}
	
	public void testGetPwd()
	{
		this.um.setPwd("345");
		
		Assert.assertEquals("345", this.um.getPwd());
	}
	
	public void testSetEmail()
	{
		this.um.setEmail("123");
		
		Assert.assertEquals("123", this.um.getEmail());
	}
	
	public void testGetEmail()
	{
		this.um.setEmail("345");
		
		Assert.assertEquals("345", this.um.getEmail());
	}
	
	public void testSetAddress()
	{
		this.um.setAddress("132");
		
		Assert.assertEquals("132", this.um.getAddress());
	}
	
	public void testGetAddress()
	{
		this.um.setAddress("345");
		
		Assert.assertEquals("345", this.um.getAddress());
	}
	
	public void testSetCreditCard()
	{
		this.um.setCreditCard("132");
		
		Assert.assertEquals("132", this.um.getCreditCard());
	}
	
	public void testGetCreditCard()
	{
		this.um.setCreditCard("345");
		
		Assert.assertEquals("345", this.um.getCreditCard());
	}
	
	public void testEquals()
	{
		this.um.setUuid("1");
		
		UserModel um2 = new UserModel();
		um2.setUuid("2");
		UserModel um3 = new UserModel();
		um3.setUuid("1");
		
		UserQueryModel cqm = new UserQueryModel();
		
		Assert.assertEquals(true, this.um.equals(this.um));
		Assert.assertEquals(false, this.um.equals(null));
		Assert.assertEquals(false, this.um.equals(cqm));
		Assert.assertEquals(false, this.um.equals(um2));
		Assert.assertEquals(true, this.um.equals(um3));
	}
	
	public void testToString()
	{
		this.um.setName("hello");
		this.um.setUuid("123");
		this.um.setEmail("mkhan12@iit.edu");
		
		String result = this.um.toString();
		Assert.assertEquals("User id: 123, Username: hello, Email: mkhan12@iit.edu", result);
	}


}
