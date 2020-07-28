package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import baseClass.TestBase;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;

public class Edit_Profile extends TestBase {

	@Test
	public void advertisereditprofile() throws InterruptedException {

		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Edit Profile")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//h2/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("businessName")).clear();
		driver.findElement(By.name("businessName")).sendKeys("India Advertiser");
		driver.findElement(By.id("saveProfileBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[2]/div/h2/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Address")).clear();
		driver.findElement(By.name("Address")).sendKeys("Okhla");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='Address'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='Address'])[2]")).sendKeys("Phase 3");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-8")).clear();
		driver.findElement(By.id("mat-input-8")).sendKeys("Central Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-9")).clear();
		driver.findElement(By.id("mat-input-9")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-10")).clear();
		driver.findElement(By.id("mat-input-10")).sendKeys("110001");
		Thread.sleep(1000);
		driver.findElement(By.id("saveProfileBtn")).click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'India Advertiser')]")).isDisplayed());
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Central Delhi, Delhi')]")).isDisplayed());

	}


}
