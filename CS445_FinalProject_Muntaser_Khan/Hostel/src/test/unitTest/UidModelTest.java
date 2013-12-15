package test.unitTest;



import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Hostel21.*;

public class UidModelTest {

private UidModel um;
	
	@Before
	public void setUp() throws Exception
	{
		um = new UidModel();
	}
	@Test
	public void testSetCurrentUid()
	{
		um.setCurrentUid(1);
		
		Assert.assertEquals(1, um.getCurrentUid());
	}
	@Test
	public void testGetCurrentUid()
	{
		um.setCurrentUid(2);
	
		Assert.assertEquals(2, um.getCurrentUid());
	}
	@Test
	public void testSetModelName()
	{
		um.setModelName("hello");
		
		Assert.assertEquals("hello", um.getModelName());
	}
	@Test
	public void testGetModelName()
	{
		um.setModelName("world");
		
		Assert.assertEquals("world", um.getModelName());
	}
	@Test
	public void testHashCode()
	{
		um.setModelName(null);
		
		int result1 = this.um.hashCode();
		
		Assert.assertEquals(31, result1);
		
		
		um.setModelName("hello");

		int result2 = this.um.hashCode();
		
		Assert.assertEquals(31 + "hello".hashCode(), result2);
	}
	@Test
	public void testEquals()
	{
		this.um.setModelName("hello");
		
		UidModel sm2 = new UidModel();
		sm2.setModelName("world");
		UidModel sm3 = new UidModel();
		sm3.setModelName("hello");
		UidModel sm4 = new UidModel();
		sm4.setModelName("welcome");
		
		OrderQueryModel bdqm = new OrderQueryModel();
		
		Assert.assertEquals(true, this.um.equals(this.um));
		Assert.assertEquals(false, this.um.equals(null));
		Assert.assertEquals(false, this.um.equals(bdqm));
		
		um.setModelName(null);
		Assert.assertEquals(false, this.um.equals(sm2));
		
		um.setModelName("hello");
		Assert.assertEquals(true, this.um.equals(sm3));
		Assert.assertEquals(false, this.um.equals(sm4));
	}
	
}
