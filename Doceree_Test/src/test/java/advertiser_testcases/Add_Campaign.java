package advertiser_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_Campaign {
	WebDriver driver = null;
	String baseURL = null;

	@BeforeMethod
	public void set_up() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://qa-exchange.doceree.com/login";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@Test
	public void newCampaign() throws InterruptedException {
		driver.get(baseURL);
		driver.findElement(By.id("email")).sendKeys("rahul1985@yopmail.com");
		driver.findElement(By.id("pwd")).sendKeys("Qwerty@2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("New Campaign")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(.,'selenium')]")).click();
		/*
		 * driver.findElement(By.linkText("Add new campaign")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//input[@type='text'])[2]")).
		 * sendKeys("India Capbff333btttbaffffig3");
		 * driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		 */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("India14sff56a73d325156848");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Drive more traffic to site')]")).click();
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

		driver.findElement(By.xpath("//tr[4]/td[4]/div")).click();
		Thread.sleep(2000);		
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		driver.findElement(By.xpath("//tr[4]/td[7]/div")).click();
		
		
		
		
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
		                            
		
		
		
		
		

	}
}
