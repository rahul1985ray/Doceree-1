package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import baseClass.TestBase;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;

public class Login extends TestBase {

	@Test
	public void advertiserlogin() {

		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");

		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Audience")).isDisplayed());

	}

}
