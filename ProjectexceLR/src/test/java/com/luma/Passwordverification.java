package com.luma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.Homepage;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Passwordverification 
{
	WebDriver driver;
	ATUTestRecorder recorder;
	@BeforeTest
	
	public void LaunchingBrowser() throws ATUTestRecorderException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void TestMethod() throws InterruptedException
	{
		Homepage hp = new Homepage(driver);   
		hp.LounchingUrl();
		hp.passwordVerification();
		String actualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/fieldset[2]/div[3]/div[1]/div[1]")).getText();
		String expectedResult = "Please enter the same value again.";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Please check the error message for password field" +(expectedResult));
	}
	
	@AfterTest
	
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
