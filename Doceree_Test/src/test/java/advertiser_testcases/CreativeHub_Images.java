package advertiser_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreativeHub_Images {
	
	WebDriver driver = null;
	String baseURL = null ;

	@BeforeMethod
	public void set_up() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://qa-exchange.doceree.com/login" ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

	}
	
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
		driver.switchTo().activeElement().sendKeys("C:\\Users\\User\\git\\Doceree\\Doceree_Test\\Files\\Creative\\300x600 - Copy.png");
		WebElement creative = driver.findElement(By.xpath("//input[@type='file']"));
		creative.sendKeys("C:\\Users\\User\\git\\Doceree\\Doceree_Test\\Files\\Creative\\300x600 - Copy.png");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(.,'Upload')]")).click();
		driver.switchTo().parentFrame();
		//creative.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		driver.findElement(By.name("creativeName")).sendKeys("Test Image");
		//driver.findElement(By.xpath("//mat-dialog-actions/button")).click();
		//Runtime.getRuntime().exec("C:\\Selenium\\AutoIT\\UploadCreativeImage.exe");
		//Thread.sleep(3000);
		
		
		
		
	}

}
