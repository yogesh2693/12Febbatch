package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;

import junit.framework.Assert;

public class TC02Singleproduct extends TestBaseClass
{
	@Test (priority=1)
	public void singleproducttest()
	{
		HomepagePOMClass hp = new HomepagePOMClass(driver);
		hp.clickproduct1();
		
		//validation
		String expected = "0";
		String actual = hp.textoneproduct();
		
		Assert.assertEquals("test fail if expected and actual not equal", expected, actual);
		
//		if(expected.equals(actual));
		{
//			System.out.println("test pass");
		}
		
	}

}
