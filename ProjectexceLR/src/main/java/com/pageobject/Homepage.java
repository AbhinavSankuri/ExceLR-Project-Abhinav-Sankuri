package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Homepage 
{
	WebDriver driver;
	
	public Homepage(WebDriver idriver)
	{
		this.driver = idriver;
	}
	
public void LounchingUrl()
{
	driver.get("https://magento.softwaretestingboard.com/");
}

public void createNewAccount() throws InterruptedException
{
	Thread.sleep(5);
	driver.findElement(By.linkText("Create an Account")).click();
	driver.findElement(By.id("firstname")).sendKeys("dummy");
	driver.findElement(By.id("lastname")).sendKeys("test");
	driver.findElement(By.id("email_address")).sendKeys("dummytest01@dummyemail.com");
	driver.findElement(By.id("password")).sendKeys("Werplay050!");
	driver.findElement(By.id("password-confirmation")).sendKeys("Werplay050!");
	driver.findElement(By.linkText("Create an Account")).click();
}

public void passwordVerification() throws InterruptedException
{
	Thread.sleep(5);
	driver.findElement(By.linkText("Create an Account")).click();
	driver.findElement(By.id("firstname")).sendKeys("dummy");
	driver.findElement(By.id("lastname")).sendKeys("test");
	driver.findElement(By.id("email_address")).sendKeys("dummytest01@dummyemail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("password")).sendKeys("Werplay050!");
	driver.findElement(By.id("password-confirmation")).sendKeys("Werpdfgsdfgsedfgrdelay0500!");
	driver.findElement(By.linkText("Create an Account")).click();
}

public void signin() 
{
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("email")).sendKeys("dummytest01@dummyemail.com");
	driver.findElement(By.id("pass")).sendKeys("Werplay050!");
	driver.findElement(By.id("send2")).click();
	
	
}

public void passwordsigninerror()

{
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("email")).sendKeys("dummytest01@dummyemail.com");
	driver.findElement(By.id("pass")).sendKeys("Werplay050!sgdsdjh");
	driver.findElement(By.id("send2")).click();
}

public void emailsigninerror()
{
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("email")).sendKeys("hsdgw@shgdfwkjk.com");
	driver.findElement(By.id("pass")).sendKeys("Werplay050!");
	driver.findElement(By.id("send2")).click();
   	
}

public void emptyfieldssigninerror() 
{
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("email")).sendKeys("");
	driver.findElement(By.id("pass")).sendKeys("Werplay050!");
	driver.findElement(By.id("send2")).click();
	
}

public void createaccountpageverify()
	{
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/span[1]")).click();
		String actualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/h1[1]/span[1]")).getText();
		String expectedResult = "Create New Customer Account";
		Assert.assertEquals(actualResult, expectedResult);
	}

public void ChangePassword_MyAccountSection() throws InterruptedException
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[2]")).click();
	driver.findElement(By.xpath("//input[@name='current_password']")).sendKeys("Werplay050!");
	driver.findElement(By.xpath("//input[@name='password'][1]")).sendKeys("Werplay050!");
	driver.findElement(By.xpath("//input[@name='password_confirmation'][1]")).sendKeys("Werplay050!");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@title='Save']")).click();
	Thread.sleep(3000);
	String ActualResult = driver.findElement(By.xpath("//div[text()='You saved the account information.']")).getText();
	System.out.println(ActualResult);
}

public void ChangeEmail_MyAccountSection() throws InterruptedException
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/span[1]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/a[2]")).click();
	driver.findElement(By.xpath("(//input[@name='change_email'])[1]")).click();
	driver.findElement(By.xpath("(//input[@name='change_password'])")).click();
	driver.findElement(By.xpath("(//input[@name='current_password'])")).sendKeys("Werplay050!");
	driver.findElement(By.xpath("(//button[@class='action save primary'])")).click();
	Thread.sleep(5000);
	String ActualResult = driver.findElement(By.xpath("//div[text()='You saved the account information.']")).getText();
	System.out.println(ActualResult);
}

public void OrderPlacing_searchBox() throws InterruptedException
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Jupiter All-Weather Trainer");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[2]/div[2]/form[1]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/a[1]/span[1]/span[1]/img[1]")).click();
	driver.findElement(By.id("option-label-size-143-item-167")).click();
	driver.findElement(By.id("option-label-color-93-item-50")).click();
	Thread.sleep(6000);
	driver.findElement(By.id("product-addtocart-button")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/a[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a[1]/span[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("rt340zxZ1@couldmail.com");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastname");
	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("company");
	driver.findElement(By.xpath("//input[@name='street[0]']")).sendKeys("karwan");
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyderabad");
	WebElement country = driver.findElement(By.xpath("//select[@name='country_id']"));
	Thread.sleep(3000);
	Select s1 = new Select(country);
	s1.selectByVisibleText("India");
	Thread.sleep(2000);
	WebElement state = driver.findElement(By.xpath("//select[@name='region_id']"));
	Thread.sleep(3000);
	Select s2 = new Select(state);
	s2.selectByVisibleText("Telangana");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("9898989898");
	driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("500006");
	driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[3]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/button[1]")).click();
	Thread.sleep(5000);
	String ActualResult = driver.findElement(By.xpath("//span[@class='base']")).getText();
	System.out.println(ActualResult);
	
}

public void CreateAccount_AfterOrderPlacing() throws InterruptedException
{
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/div[2]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Werplay050!");
	driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Werplay050!");
	driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
	Thread.sleep(3000);
	String ActualResult = driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']")).getText();
	String ExpectedResult = "Thank you for registering with Main Website Store.";
	Assert.assertEquals(ActualResult,ExpectedResult);
	System.out.println(ActualResult);
}

public void AddProducts_WishlistPDP()
{
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tshirts for men");
	driver.findElement(By.xpath("//button[@title='Search']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/strong[1]/a[1]")).click();
	driver.findElement(By.id("option-label-size-143-item-167")).click();
	driver.findElement(By.id("option-label-color-93-item-50")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[5]/div[1]/a[1]/span[1]")).click();
	String ActualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText();
	System.out.println(ActualResult);
}

public void AddToCart_Wishlist()
{
	driver.findElement(By.xpath("//button[@class='action tocart']")).click();
	String ExpectedResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
	System.out.println(ExpectedResult);
}

public void AddToCart_WishlistErrorMessage()
{
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tshirts for men");
	driver.findElement(By.xpath("//button[@title='Search']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]/div[1]/div[1]/strong[1]/a[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[1]/div[5]/div[1]/a[1]/span[1]")).click();
	driver.findElement(By.xpath("//button[@class='action tocart']")).click();
	String ActualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText();
	String ExpectedResult = "You need to choose options for your item for \"Chloe Compete Tank\".";
	Assert.assertEquals(ActualResult, ExpectedResult);
}

public void ShareWishlist_email()
{
	driver.findElement(By.xpath("//button[@title='Share Wish List']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/textarea[1]")).sendKeys("jumm@jj.com");
	driver.findElement(By.xpath("//button[@title='Share Wish List']")).click();
	String ExpectedResult = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]")).getText();
	System.out.println(ExpectedResult);
}

public void StoredPaymentMethods_pageMessage() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[8]/a[1]")).click();
	String ActualResult = driver.findElement(By.xpath("//div[@class='message info empty']")).getText();
	String ExpectedResult = "You have no stored payment methods.";
	Assert.assertEquals(ActualResult, ExpectedResult);
}

public void MyProductsReview_pageMessage() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[10]/a[1]")).click();
	String ActualResult = driver.findElement(By.xpath("//div[@class='message info empty']")).getText();
	String ExpectedResult = "You have submitted no reviews.";
	Assert.assertEquals(ActualResult, ExpectedResult);
}

public void signout()
{
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/ul[1]/li[3]/a[1]")).click();
}

}