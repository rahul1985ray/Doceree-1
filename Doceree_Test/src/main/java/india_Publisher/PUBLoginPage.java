package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBLoginPage extends TestBase_Publisher {
	
	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "pwd")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public PUBLoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void loginmethod() {

		username.sendKeys("rahulpubqaus2020@gmail.com");
		password.sendKeys("Test@123");
		submit.click();

	}

}
