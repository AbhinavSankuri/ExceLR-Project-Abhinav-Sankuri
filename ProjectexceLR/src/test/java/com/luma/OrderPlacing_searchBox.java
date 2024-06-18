package com.luma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

public class OrderPlacing_searchBox 
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
		hp.OrderPlacing_searchBox();
		
	}
	
@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
	
