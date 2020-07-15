package advertiser_testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Send_Invitations {

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
	public void sendInvite() throws InterruptedException {
		driver.get("https://qa-exchange.doceree.com/login");
		driver.findElement(By.id("email")).sendKeys("rahuladvbrand@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty2@");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Invitation Code")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email3")).sendKeys("rayrahul85@gmail.com");
		driver.findElement(By.xpath("//button[contains(.,'Send')]")).click();
		Thread.sleep(2000);
		assertTrue(driver.findElement(By.xpath("//i[@class='icon-18 fs16 text-success']")).isDisplayed());
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
