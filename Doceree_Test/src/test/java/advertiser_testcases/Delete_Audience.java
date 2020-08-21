package advertiser_testcases;

import org.testng.annotations.Test;
import baseClass.TestBase_Advertiser;

import org.openqa.selenium.By;

public class Delete_Audience extends TestBase_Advertiser {

	@Test
	public void deleteAudience() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.get("https://qa-exchange.doceree.com/advertiser/audience");
		// Thread.sleep(5000);
		driver.findElement(By.xpath("(//span/a/i)[16]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
	}
}
