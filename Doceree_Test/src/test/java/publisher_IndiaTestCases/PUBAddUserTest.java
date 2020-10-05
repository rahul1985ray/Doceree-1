package publisher_IndiaTestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.TestBase_Publisher;
import india_Publisher.PUBHomePage;
import india_Publisher.PUBLoginPage;
import india_Publisher.PUBManagePlatform;

public class PUBAddUserTest extends TestBase_Publisher {

	PUBLoginPage login;
	PUBHomePage sections;
	PUBManagePlatform manage;

	@BeforeTest
	public void setup() {
		initialise();

		login = new PUBLoginPage();
		sections = new PUBHomePage();
		manage = new PUBManagePlatform();

	}
	
	@Test
	public void adduser() {
		login.loginmethod();
		sections.manageplatform();
		manage.adduser();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
