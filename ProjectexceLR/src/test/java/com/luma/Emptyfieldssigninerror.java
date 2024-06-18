package com.luma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

public class Emptyfieldssigninerror 
{
	WebDriver driver;
	
	@BeforeTest
	
	public void Launchingbrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
				
	}
	
	@Test
	
	public void TestMethod()
	{
		Homepage hp = new Homepage(driver);
		hp.LounchingUrl();
		hp.emptyfieldssigninerror();
		String actualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[2]/div[1]/div[1]")).getText();
		String expectedResult = "This is a required field.";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@AfterTest
	
	public void CloseBrowser()
	{
		driver.quit();
	}

}
