package advertiser_testcases;

import org.testng.annotations.Test;

import baseClass.TestBase;

import org.testng.AssertJUnit;
import org.openqa.selenium.By;

public class Audience_variations extends TestBase {

	@Test
	public void createAudienceVariation() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
		driver.get("https://qa-exchange.doceree.com/advertiser/audience");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//img[@alt='audience'])[2]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("India Audience");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div[2]/div")).click();
		driver.findElement(By.xpath("//span[contains(.,'Exclude')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'All')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-2']/label/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-3']/label/div")).click();
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'India Audience')]")).isDisplayed());

	}

}
