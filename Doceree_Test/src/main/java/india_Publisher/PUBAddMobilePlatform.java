package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBAddMobilePlatform extends TestBase_Publisher {

	@FindBy(xpath = "//span[contains(text(),'Mobile')]")
	WebElement mobileapp;

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement mobileappname;

	@FindBy(xpath = "//input[@placeholder='www.example.com']")
	WebElement mobileapplink;

	@FindBy(xpath = "//span[contains(text(),'Select type')]")
	WebElement mobileapptypedropdown;

	@FindBy(xpath = "//span[contains(.,'iOS')]")
	WebElement mobileapptypeoptions;

	@FindBy(xpath = "//span[contains(text(),'Select Category')]")
	WebElement mobileappcategorydropdown;

	@FindBy(xpath = "//span[contains(text(),'Physician Networking Platform')]")
	WebElement mobilecategoryoptions;

	@FindBy(xpath = "//span[contains(text(),'Select Market')]")
	WebElement mobiletargetusers;

	@FindBy(xpath = "//span[@class='mat-option-text']")
	WebElement mobilemarket;

	@FindBy(xpath = "//input[@type='radio' and @value='yes']")
	WebElement mobilelogin;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement mobilebasicsnext;

	@FindBy(xpath = "(//button[contains(text(),'Next')])[2]")
	WebElement mobileexclusionsnext;

	@FindBy(xpath = "//input[@type='radio' and @value='I have added the code on my platform.']")
	WebElement mobileplatformintegration;

	@FindBy(xpath = "(//button[contains(text(),'Next')])[3]")
	WebElement mobileplatformintegrationnext;

	@FindBy(xpath = "(//input[@type='radio' and @value='I have added the code on my platform.'])[2]")
	WebElement mobileaudienceidentification;

	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement mobileaudienceidentificationdone;

	public PUBAddMobilePlatform() {
		PageFactory.initElements(driver, this);
	}

	public void addmobileplatform() {

	}

}
