package com.luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

public class ShareWishlist_email 
{
	WebDriver driver;
	
	@BeforeTest 
	
	public void LaunchingBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

@Test
	
	public void TestMethod() throws InterruptedException
	{
		Homepage hp = new Homepage(driver);   
		hp.LounchingUrl();
		hp.signin();
		hp.AddProducts_WishlistPDP();
		hp.ShareWishlist_email();
		
	}
	
@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
