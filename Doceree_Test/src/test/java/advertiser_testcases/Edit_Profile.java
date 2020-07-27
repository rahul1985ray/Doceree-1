package advertiser_testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Edit_Profile {

	WebDriver driver = null;

	@BeforeMethod
	public void set_up() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

	}

	@Test
	public void advertisereditprofile() throws InterruptedException {

		
		driver.get("https://qa-exchange.doceree.com/login");
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
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

}
