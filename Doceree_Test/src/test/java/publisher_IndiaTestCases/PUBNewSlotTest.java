package publisher_IndiaTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.TestBase_Publisher;
import india_Publisher.PUBHomePage;
import india_Publisher.PUBLoginPage;
import india_Publisher.PUBNewSlot;

public class PUBNewSlotTest extends TestBase_Publisher {

	PUBLoginPage login;
	PUBNewSlot createslot;
	PUBHomePage sections;

	@BeforeTest
	public void setup() {
		initialise();
		createslot = new PUBNewSlot();
		login = new PUBLoginPage();
		sections = new PUBHomePage();

	}

	@Test
	public void createNewSlot() throws InterruptedException {
		login.loginmethod();
		Thread.sleep(10000);
		sections.newslot();
		Thread.sleep(5000);
		createslot.createnewslot();
		Thread.sleep(4000);
		sections.manageslot();

	}

	@AfterMethod
	public void teardown() {
		// driver.quit();
	}
}
