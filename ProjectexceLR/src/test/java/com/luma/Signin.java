package com.luma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

public class Signin 
{
	WebDriver driver;
	
	@BeforeTest
	
	public void LounchingBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	
	@Test
	
	public void TestMethod()
	{
		Homepage hp = new Homepage(driver);   
		hp.LounchingUrl();
		hp.signin();
		String user = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")).getText();
		System.out.println("you are logged as: "+ (user));
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}

}
