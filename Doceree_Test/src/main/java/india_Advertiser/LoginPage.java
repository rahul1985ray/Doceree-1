package india_Advertiser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pwd")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void login() {
		username.sendKeys("rahul1985@yopmail.com");
		password.sendKeys("Test@123");
		submit.click();

	}
}
