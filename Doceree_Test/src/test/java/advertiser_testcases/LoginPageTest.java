package advertiser_testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.ADV_POM;
import india_Advertiser.LoginPage;

public class LoginPageTest extends ADV_POM {

	LoginPage login;

	@BeforeMethod
	public void setup() {
		initialise();
		login = new LoginPage();
	}

	@Test
	public void advertiserlogin() {
		login.loginmethod();
		Assert.assertTrue(driver.findElement(By.linkText("New Campaign")).isDisplayed());

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
