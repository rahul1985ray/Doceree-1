package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBManagePlatform extends TestBase_Publisher {

	@FindBy(xpath = "//input[@placeholder='Role']")
	WebElement role;

	@FindBy(xpath = "//span[contains(text(),'Analyst')]")
	WebElement analyst;

	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	WebElement admin;

	@FindBy(xpath = "//span[contains(text(),'Developer')]")
	WebElement developer;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Platform']")
	WebElement platform;
	
	@FindBy(xpath = "//span[contains(text(),'US QA Rahul')]")
	WebElement platformname;

	public PUBManagePlatform() {
		PageFactory.initElements(driver, this);
	}
	
	public void adduser() {
		role.click();
		analyst.click();
		email.sendKeys("rahulpubindia2020@gmail.com");
		platform.click();
		platformname.click();
	}

}
