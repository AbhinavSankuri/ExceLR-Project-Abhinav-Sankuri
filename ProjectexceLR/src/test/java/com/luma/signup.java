package com.luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

public class signup 
{
	WebDriver driver;
	
	@BeforeTest
	public void LounchingBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	@Test
	public void testMethod() throws InterruptedException
	{
		Homepage hp = new Homepage(driver);   //hp=object reference
		String expectedtitle = "Home Page";
		hp.LounchingUrl();
		String actualtitle = driver.getTitle();
		hp.createNewAccount();
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
