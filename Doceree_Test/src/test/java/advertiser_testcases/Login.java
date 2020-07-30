package advertiser_testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import baseClass.TestBase;
import india_Advertiser.LoginPage;

public class Login extends TestBase {

	@Test
	public void advertiserlogin() {

		homepage = PageFactory.initElements(driver, LoginPage.class);

		driver.get(baseURL);

		homepage.login();

	}

}
