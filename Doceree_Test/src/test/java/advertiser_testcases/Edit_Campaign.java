package advertiser_testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseClass.TestBase_Advertiser;

public class Edit_Campaign extends TestBase_Advertiser {
	
	@Test
	public void editCampaign() throws InterruptedException {
	driver.get(baseURL);
	driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
	driver.findElement(By.id("pwd")).sendKeys("Test@123");
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
	driver.findElement(By.xpath("//input[@id='mat-input-9']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("Edit subcampaign");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[contains(.,'Next')])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[contains(.,'Next')])[3]")).click();
	driver.findElement(By.id("mat-input-13")).clear();
	driver.findElement(By.id("mat-input-13")).sendKeys("44");
	Thread.sleep(1000);
	driver.findElement(By.id("mat-input-14")).clear();
	driver.findElement(By.id("mat-input-14")).sendKeys("2500");
	Thread.sleep(1000);
	driver.findElement(By.id("mat-input-15")).clear();
	driver.findElement(By.id("mat-input-15")).sendKeys("88");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//button[contains(.,'Next')])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(.,'Save & Publish')]")).click();
	
	}
}
