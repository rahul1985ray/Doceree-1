package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import baseClass.TestBase_Advertiser;

import org.openqa.selenium.By;

public class Logout extends TestBase_Advertiser {

	@Test
	public void advertiserlogout() throws InterruptedException {

		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("Click here")).isDisplayed());

	}

}
