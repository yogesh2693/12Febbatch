package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;

public class TC03AddAllProducts extends TestBaseClass
{
	@Test(priority=2)
	public void addAllproducts()
	{
		HomepagePOMClass hp = new HomepagePOMClass(driver);
		hp.clickallproduct();
		System.out.println("clicked on all products");
		String expected = "6";
		System.out.println("expected products added "+expected);
		String actual = hp.getalltext();
		System.out.println("actual products added "+actual);
		
		Assert.assertEquals(actual, expected);
		
		
//		if(expected.equals(actual))
		{
	//		System.out.println("test pass");
		}
//		else
		{
//			System.out.println("test fail");
		}
	}

}
