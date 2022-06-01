package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.POMClasses.HomepagePOMClass;
import com.SauceDemo.UtilityClasses.ScreenshotAllPage;

public class TestSuite extends TestBaseClass 
{
	@Test (priority=0)
	   public void loginFunctionalityTest() throws IOException 
	   {
		   
		   ScreenshotAllPage.screenshotfullpage(driver);
	       String expectedTitle = "Swag Labs";
	       String actualTitle = driver.getTitle();
	       
	       System.out.println("Verify the test case");
	        
	       if(expectedTitle.equals(actualTitle))
	       {
	    	   System.out.println("Test case is passed");
	       }
	       else
	       {
	    	   System.out.println("Test case is failed");
	       }
	   }  
	   

	@Test (priority=1)
	public void singleproducttest()
	{
		HomepagePOMClass hp = new HomepagePOMClass(driver);
		hp.clickproduct1();
		
		//validation
		String expected = "1";
		String actual = hp.textoneproduct();
		if(expected.equals(actual));
		{
			System.out.println("test pass");
		}
		
	}


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
		if(expected.equals(actual))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}
	
	
	
	
}
