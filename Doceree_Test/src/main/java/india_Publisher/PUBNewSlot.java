package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBNewSlot extends TestBase_Publisher {

	@FindBy(linkText = "New Slot")
	WebElement newslot;

	@FindBy(xpath = "(//input[@formcontrolname='name'])")
	WebElement slotname;

	@FindBy(xpath = "//input[@type='text']")
	WebElement pageurl;

	@FindBy(xpath = "(//button[contains(.,'Next')])[1]")
	WebElement nextbasics;

	@FindBy(xpath = "(//div[@class='ng-star-inserted'])[4]")
	WebElement creative;

	@FindBy(xpath = "(//button[contains(.,'Next')])[2]")
	WebElement nextdetails;

	@FindBy(xpath = "//input[@type='number']")
	WebElement bidrange;

	@FindBy(xpath = "(//button[contains(.,'Next')])[3]")
	WebElement nextbidrange;

	@FindBy(xpath = "(//div[@class='mat-radio-label-content'])[2]")
	WebElement platformradio;

	@FindBy(xpath = "//button[contains(.,'Save')]")
	WebElement saveslot;

	public PUBNewSlot() {
		PageFactory.initElements(driver, this);

	}
	
	public void createnewslot() throws InterruptedException {
		newslot.click();
		Thread.sleep(5000);
		slotname.sendKeys("Test Ad Slot");
		Thread.sleep(1000);
		pageurl.sendKeys("about-us");
		Thread.sleep(1000);
		nextbasics.click();
		Thread.sleep(4000);
		creative.click();
		Thread.sleep(2000);
		nextdetails.click();
		Thread.sleep(4000);
		bidrange.sendKeys("0");
		Thread.sleep(1000);
		nextbidrange.click();
		Thread.sleep(3000);
		platformradio.click();
		Thread.sleep(1000);
		saveslot.click();
	}
}
