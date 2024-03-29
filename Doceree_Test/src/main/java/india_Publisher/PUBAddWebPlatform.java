package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBAddWebPlatform extends TestBase_Publisher {

	@FindBy(xpath = "//input[@placeholder='Enter Name']")
	WebElement sitename;

	@FindBy(xpath = "//input[@placeholder='www.example.com']")
	WebElement siteaddress;

	@FindBy(xpath = "//span[contains(text(),'Select Category')]")
	WebElement sitecategorydropdown;

	@FindBy(xpath = "//span[contains(text(),'Physician Networking Platform')]")
	WebElement sitecategoryoptions;

	@FindBy(xpath = "//span[contains(text(),'Select Market')]")
	WebElement sitetargetusers;

	@FindBy(xpath = "//span[@class='mat-option-text']")
	WebElement sitemarket;

	@FindBy(xpath = "//input[@type='radio' and @value='yes']")
	WebElement sitelogin;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement sitebasicsnext;

	@FindBy(xpath = "(//button[contains(text(),'Next')])[2]")
	WebElement siteexclusionsnext;

	@FindBy(xpath = "//input[@type='radio' and @value='I have added the code on my platform.']")
	WebElement siteplatformintegration;

	@FindBy(xpath = "(//button[contains(text(),'Next')])[3]")
	WebElement siteplatformintegrationnext;

	@FindBy(xpath = "(//input[@type='radio' and @value='I have added the code on my platform.'])[2]")
	WebElement siteaudienceidentification;

	@FindBy(xpath = "//button[contains(text(),'Done')]")
	WebElement siteaudienceidentificationdone;

	public PUBAddWebPlatform() {
		PageFactory.initElements(driver, this);
	}

	public void addwebplatform() {
		sitename.sendKeys("Web Platform");
		siteaddress.sendKeys("www.testng.com");
		sitecategorydropdown.click();
		sitecategoryoptions.click();
		sitetargetusers.click();
		sitetargetusers.click();
		sitemarket.click();
		sitelogin.click();
		sitebasicsnext.click();
		siteexclusionsnext.click();
		siteplatformintegration.click();
		siteplatformintegrationnext.click();
		siteaudienceidentification.click();
		siteaudienceidentificationdone.click();
	}

}
