package com.SauceDemo.POMClasses;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SauceDemo.UtilityClasses.ExcelSheet;

public class LoginPagePOMClass 
{
	// normal login
	private WebDriver driver;
	
	 @FindBy(xpath="//input[@id='user-name']")
	 private WebElement username;
	
	public void sendUsername()
	 {
		 username.sendKeys("standard_user");
	 }
	
	 @FindBy(xpath="//input[@id='user-name']")
	 private WebElement username1;
	
	public String sendUsername1() throws IOException
	 {
		String s = ExcelSheet.exceldata(driver);
		username.sendKeys(s);
		return null;
	 }
	
	
	
	 @FindBy(xpath="//input[@id='password']")
	 private WebElement password;
	
	 public void sendPassword()
	 {
		 password.sendKeys("secret_sauce");
	 }
	 
	 @FindBy(xpath="//input[@id='login-button']")
	  private WebElement login;
	 
	  public void clickLogin() 
	  {
		  login.click();
	  }
	  
	  public LoginPagePOMClass(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
}




	 
	 
	 





