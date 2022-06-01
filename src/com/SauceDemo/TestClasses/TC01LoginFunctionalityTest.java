package com.SauceDemo.TestClasses;





import java.io.IOException;

import org.testng.annotations.Test;

import com.SauceDemo.UtilityClasses.ScreenshotAllPage;

import junit.framework.Assert;

public class TC01LoginFunctionalityTest extends TestBaseClass
{

   @Test ()
   public void loginFunctionalityTest() throws IOException 
   {
	   
	   ScreenshotAllPage.screenshotfullpage(driver);
       String expectedTitle = "Swag Labs";
       String actualTitle = driver.getTitle();
       
       System.out.println("Verify the test case");
       
       
       Assert.assertEquals(expectedTitle, actualTitle);
        
//       if(expectedTitle.equals(actualTitle))
       {
 //   	   System.out.println("Test case is passed");
       }
 //      else
       {
  //  	   System.out.println("Test case is failed");
       }
   }  
   

}
