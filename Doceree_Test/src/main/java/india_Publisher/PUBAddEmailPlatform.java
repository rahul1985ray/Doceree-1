package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBAddEmailPlatform extends TestBase_Publisher {

	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement emailgroupname;

	@FindBy(xpath = "//span[contains(text(),'Select Category')]")
	WebElement emailcategorydropdown;

	@FindBy(xpath = "//span[contains(text(),'Physician Networking Platform')]")
	WebElement emailcategoryoptions;

	@FindBy(xpath = "//span[contains(text(),'Select Market')]")
	WebElement emailtargetusers;

	@FindBy(xpath = "//span[@class='mat-option-text']")
	WebElement emailmarket;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement emailsave;

	public PUBAddEmailPlatform() {
		PageFactory.initElements(driver, this);
	}

	public void addemailplatform() {

	}

}
