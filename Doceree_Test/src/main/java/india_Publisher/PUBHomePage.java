package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBHomePage extends TestBase_Publisher {

	@FindBy(linkText = "New Slot")
	WebElement newslot;

	@FindBy(linkText = "Manage Slot")
	WebElement manageslot;

	@FindBy(linkText = "Add Platform")
	WebElement addplatform;

	@FindBy(linkText = "Accounts")
	WebElement accounts;

	@FindBy(xpath = "//button[contains(text(),'Manage platform')]")
	WebElement manageplatform;

	public PUBHomePage() {
		PageFactory.initElements(driver, this);

	}

	public void newslot() {
		newslot.click();
	}

	public void manageslot() {
		manageslot.click();
	}

	public void addplatform() {
		addplatform.click();
	}

	public void accounts() {
		accounts.click();
	}

	public void manageplatform() {
		manageplatform.click();
	}

}