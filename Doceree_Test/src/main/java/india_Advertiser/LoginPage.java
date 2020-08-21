package india_Advertiser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.ADV_POM;

public class LoginPage extends ADV_POM {

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pwd")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginmethod() {

		username.sendKeys("rahul1985@yopmail.com");
		password.sendKeys("Test@123");
		submit.click();

	}

}
