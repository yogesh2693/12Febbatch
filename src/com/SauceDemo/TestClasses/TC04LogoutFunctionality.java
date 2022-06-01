package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;

import junit.framework.Assert;

public class TC04LogoutFunctionality extends TestBaseClass
{
	@Test
	public void logoutVerification()
	{
		HomepagePOMClass hp = new HomepagePOMClass(driver);
		hp.clickonMenu();
		System.out.println("clicked on menu");
		
		hp.clickonLogout();
		System.out.println("clicked on logout");
		
		//validation
		String expected = driver.getCurrentUrl();
		String actual = "https://www.saucedemo.com/";
		
		Assert.assertEquals(expected, actual);
		
	} 

}
