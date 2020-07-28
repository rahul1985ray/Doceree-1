package advertiser_testcases;

import org.testng.annotations.Test;

import baseClass.TestBase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreativeHub_Images extends TestBase {

	@Test
	public void uploadImages() throws InterruptedException, IOException {

		driver.get(baseURL);

		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");

		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);

		driver.get("https://qa-exchange.doceree.com/advertiser/creativeHUB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Add Creative')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[6]/a/div")).click();
		Thread.sleep(3000);
		driver.switchTo().activeElement()
				.sendKeys("C:\\Users\\User\\git\\Doceree\\Doceree_Test\\Files\\Creative\\300x600 - Copy.png");
		WebElement creative = driver.findElement(By.xpath("//input[@type='file']"));
		creative.sendKeys("C:\\Users\\User\\git\\Doceree\\Doceree_Test\\Files\\Creative\\300x600 - Copy.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Upload')]")).click();
		driver.switchTo().parentFrame();
		// creative.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.name("creativeName")).sendKeys("Test Image");
		// driver.findElement(By.xpath("//mat-dialog-actions/button")).click();
		// Runtime.getRuntime().exec("C:\\Selenium\\AutoIT\\UploadCreativeImage.exe");
		// Thread.sleep(3000);

	}

}
