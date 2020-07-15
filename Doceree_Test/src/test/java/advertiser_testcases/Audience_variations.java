package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Audience_variations {

	WebDriver driver = null;

	@BeforeMethod
	public void set_up() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void createAudienceVariation() throws InterruptedException {
		driver.get("https://qa-exchange.doceree.com/login");
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.get("https://qa-exchange.doceree.com/advertiser/audience");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='audience'])[2]")).click();
		driver.findElement(By.id("mat-input-0")).sendKeys("India Audience");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-0']/div/div[2]/div")).click();
		driver.findElement(By.xpath("//span[contains(.,'Exclude')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'All')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-2']/label/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//mat-checkbox[@id='mat-checkbox-3']/label/div")).click();
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td[contains(text(),'India Audience')]")).isDisplayed());
		

	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

}
