package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBEditSlot extends TestBase_Publisher {

	@FindBy(xpath = "(//input[@formcontrolname='name'])")
	WebElement slotname;

	@FindBy(xpath = "//input[@type='text']")
	WebElement pageurl;

	@FindBy(xpath = "(//button[contains(.,'Next')])[1]")
	WebElement nextbasics;

	@FindBy(xpath = "(//div[@class='ng-star-inserted'])[5]")
	WebElement creative;

	@FindBy(xpath = "(//button[contains(.,'Next')])[2]")
	WebElement nextdetails;

	@FindBy(xpath = "//input[@type='number']")
	WebElement bidrange;

	@FindBy(xpath = "(//button[contains(.,'Next')])[3]")
	WebElement nextbidrange;

	@FindBy(xpath = "//div[contains(text(),' I have added the code on my platform. ')]")
	WebElement platformradio;

	@FindBy(xpath = "//button[contains(.,'Save')]")
	WebElement saveslot;

	public PUBEditSlot() {
		PageFactory.initElements(driver, this);
	}
	
	public void editslot() throws InterruptedException {
		slotname.clear();
		Thread.sleep(1000);
		slotname.sendKeys("Edit Ad Slot");
		Thread.sleep(1000);
		//pageurl.sendKeys("test page");
		//Thread.sleep(1000);
		nextbasics.click();
		Thread.sleep(3000);
		//creative.click();
		//Thread.sleep(2000);
		nextdetails.click();
		Thread.sleep(2000);
		bidrange.sendKeys("1");
		Thread.sleep(1000);
		nextbidrange.click();
		Thread.sleep(2000);
		platformradio.click();
		Thread.sleep(2000);
		saveslot.click();
	}
}
