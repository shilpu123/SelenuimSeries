package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationTest {

	public static void main(String[] args) {

		String BrowserName = "edge";
		BrowserUtil brutil = new BrowserUtil();

		WebDriver driver = brutil.initDriver(BrowserName);
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String title = brutil.getpageTitle();
		System.out.println("title of page title" + title);

		// by locators
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpassword = By.id("input-confirm");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.dosendKeys(FirstName, "amrita");
		eutil.dosendKeys(LastName, "singh");
		eutil.dosendKeys(email, "amrita@gmail.com");
		eutil.dosendKeys(telephone, "1234");
		eutil.dosendKeys(password, "kioo");
		eutil.dosendKeys(confirmpassword, "kioo");
		

	}

}
