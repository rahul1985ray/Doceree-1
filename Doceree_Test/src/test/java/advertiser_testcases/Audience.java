package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import baseClass.TestBase_Advertiser;

import org.openqa.selenium.By;

public class Audience extends TestBase_Advertiser {

	

	@Test
	public void createAudience() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.get("https://qa-exchange.doceree.com/advertiser/audience");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='audience'])[2]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("Hello India");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(3000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Hello India')]")).isDisplayed());

	}

}
