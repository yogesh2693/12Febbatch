package com.SauceDemo.TestClasses;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClasses.LoginPagePOMClass;

public class TestBaseClass 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"D:\\WebDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver",
					"D:\\WebDriver\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//login
		LoginPagePOMClass lp = new LoginPagePOMClass(driver);
		lp.sendUsername1();
		System.out.println("username entered");
		lp.sendPassword();
		System.out.println("password entered");
		lp.clickLogin();
		System.out.println("clicked on login");
	}
	

	 @AfterMethod
	   public void tearDown()
	   {
	        //logout
	       driver.quit();
	       System.out.println("End of program");	
		}


}
