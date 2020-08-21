package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import baseClass.TestBase_Advertiser;

import org.openqa.selenium.By;

public class Edit_Audience extends TestBase_Advertiser {

	@Test
	public void editAudience() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.get("https://qa-exchange.doceree.com/advertiser/audience");
		// Thread.sleep(5000);
		driver.findElement(By.xpath("(//span/a/i)[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-0")).sendKeys("Edited Audience");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-1']/label/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-3']/label/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(.,'Update')]")).click();
		Thread.sleep(2000);
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//td[contains(text(),'Edited Audience')]")).isDisplayed());

	}

}
