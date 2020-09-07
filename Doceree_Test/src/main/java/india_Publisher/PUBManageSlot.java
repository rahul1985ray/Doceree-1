package india_Publisher;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase_Publisher;

public class PUBManageSlot extends TestBase_Publisher {

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement slotoptions;

	@FindBy(xpath = "//span[contains(text(), 'Edit')]")
	WebElement editslot;

	@FindBy(xpath = "//span[contains(text(), 'Delete')]")
	WebElement deleteslot;

	@FindBy(xpath = "//span[contains(text(), 'Analytics')]")
	WebElement slotanalytics;

	public PUBManageSlot() {
		PageFactory.initElements(driver, this);

	}

	public void manageslot() {
		slotoptions.click();
	}

	public void editslot() {
		editslot.click();
	}

	public void deleteslot() {
		deleteslot.click();
	}

	public void analytics() {
		slotanalytics.click();
	}
}
