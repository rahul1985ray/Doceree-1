package publisher_IndiaTestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.TestBase_Publisher;
import india_Publisher.PUBLoginPage;
import india_Publisher.PUBNewSlot;

public class PUBNewSlotTest extends TestBase_Publisher {
	
	PUBLoginPage login;
	PUBNewSlot createslot;

	@BeforeTest
	public void setup() {
		initialise();
		createslot = new PUBNewSlot();
		login = new PUBLoginPage();

	}

	@Test
	public void createNewSlot() throws InterruptedException {
		login.loginmethod();
		Thread.sleep(10000);
		createslot.createnewslot();
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
