package publisher_IndiaTestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.TestBase_Publisher;
import india_Publisher.PUBLoginPage;

public class PUBLoginPageTest extends TestBase_Publisher  {
	
	PUBLoginPage login ;
	
	@BeforeMethod
	public void setup() {
		initialise();
		login = new PUBLoginPage();
	}
	
	@Test
	public void advertiserlogin() {
		login.loginmethod();
		Assert.assertTrue(driver.findElement(By.linkText("Manage Slot")).isDisplayed());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
