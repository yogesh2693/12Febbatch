package com.SauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePOMClass
{
	private WebDriver driver;
	
	//select single product
	 @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	 private WebElement product1;
	
	 public void clickproduct1() 
	 {
		 product1.click();	
	 }
	

	// add to cart all products
	 @FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	 private List<WebElement> allproduct;
	 
	 public void clickallproduct()
	 {
		 for(WebElement allcart : allproduct)
		 {
			 allcart.click();
		 }
	 }
	 
	 
	 
	 @FindBy(xpath="//span[text()='6']")
	 private WebElement alltext;
	 
	 public String getalltext()
	 {
		return alltext.getText();
		 
	 }
	 
	 @FindBy(xpath="//span[text()='1']")
	 private WebElement oneproduct;
	 
	 public String textoneproduct()
	 {
		 return oneproduct.getText();
	 }
	 
	 //click on menu
	 @FindBy(xpath="//button[@id='react-burger-menu-btn']")
	 private WebElement menu;
	 
	 public void clickonMenu()
	 {
		 menu.click();
	 }
	 
	 //click on logout
	 @FindBy(xpath="//a[@id='logout_sidebar_link']")
	 private WebElement logout;
	 
	 public void clickonLogout()
	 {
		 logout.click();
	 }
	 
	 
	 
	 
	 public HomepagePOMClass(WebDriver driver)
	 {
		 	this.driver=driver;
		 	PageFactory.initElements(driver, this);
	 }
}
