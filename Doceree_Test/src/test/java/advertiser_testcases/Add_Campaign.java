package advertiser_testcases;

import org.testng.annotations.Test;
import baseClass.TestBase_Advertiser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Add_Campaign extends TestBase_Advertiser {

	@Test
	public void newCampaign() throws InterruptedException {
		//driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("New Campaign")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(.,'selenium')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("India Campaign");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Promote an event')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'Edited Audience')])[2]")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement next = driver.findElement(By.xpath("(//button[contains(.,'Next')])[2]"));
		action.doubleClick(next).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='mat-checkbox-label'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-calendar-body-today']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[5]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'CPC')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-11")).sendKeys("444");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-12")).sendKeys("666");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Choose limit to type')]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Per day')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-13")).sendKeys("555");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//small[contains(.,'Leaderboard')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Upload from Creative Hub')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mb-3 col-md-4 widthImg ng-star-inserted'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctaLinkInput']")).sendKeys("https://www.google.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mat-slide-toggle-thumb']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[contains(.,'Next')])[5]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='button' and contains(.,'Publish')]")).click();

	}
}
