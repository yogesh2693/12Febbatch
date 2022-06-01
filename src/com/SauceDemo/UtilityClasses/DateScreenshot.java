package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class DateScreenshot 
{
	@Test
	public static void screenshotwithDate(WebDriver driver) throws IOException
	{
		Date d = new Date();
		DateFormat d1 = new SimpleDateFormat("MM-DD-YY & HH-MM-SS");
		String date = d1.format(d);
		
		TakesScreenshot ts  = (TakesScreenshot)driver ;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\screenshot.SauceDemo"+date+".jpg");
		FileHandler.copy(source, dest);
		
		
		
		
		
	}

}
