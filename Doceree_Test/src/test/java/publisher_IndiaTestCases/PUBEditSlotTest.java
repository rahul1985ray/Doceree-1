package publisher_IndiaTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.TestBase_Publisher;
import india_Publisher.PUBEditSlot;
import india_Publisher.PUBHomePage;
import india_Publisher.PUBLoginPage;
import india_Publisher.PUBManageSlot;

public class PUBEditSlotTest extends TestBase_Publisher {

	PUBLoginPage login;
	PUBHomePage sections;
	PUBManageSlot options;
	PUBEditSlot edit;

	@BeforeTest
	public void setup() {
		initialise();
		login = new PUBLoginPage();
		sections = new PUBHomePage();
		options = new PUBManageSlot();
		edit = new PUBEditSlot();

	}

	@Test
	public void editSlot() throws InterruptedException {
		login.loginmethod();
		Thread.sleep(10000);
		sections.manageslot();
		Thread.sleep(6000);
		options.manageslot();
		Thread.sleep(3000);
		options.editslot();
		Thread.sleep(3000);
		edit.editslot();
	}
	
	@AfterTest
	public void teardown() {
		//driver.quit();
	}
}
