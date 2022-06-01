package com.SauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotAllPage 
{
 @Test
 public static void screenshotfullpage(WebDriver driver) throws IOException
 {
	 TakesScreenshot ts = (TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("D:\\screenshot\\sauce.jpg");
	 FileHandler.copy(source, dest);
 }

}
