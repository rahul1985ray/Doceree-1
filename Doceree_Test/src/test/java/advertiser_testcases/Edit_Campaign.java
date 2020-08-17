package advertiser_testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.TestBase;

public class Edit_Campaign extends TestBase {
	
	@Test
	public void editCampaign() throws InterruptedException {
	driver.get(baseURL);
	driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
	driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(10000);
	driver.findElement(By.linkText("Manage Campaigns")).click();
	Thread.sleep(7000);
	driver.findElement(By.cssSelector(".mat-row:nth-child(1) .icon-48")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector(".mat-row:nth-child(1) .icon-48")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//td[14]/button/span/i")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("Edit subcampaign");
	
	}
}
