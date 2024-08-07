package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegPageHW {

	public static void main(String[] args) {

		String BrowserName = "chrome";
		BrowserUtil brutil = new BrowserUtil();

		WebDriver driver = brutil.initDriver(BrowserName);

		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String pageTitle = brutil.getpageTitle();
		System.out.println("the name of pageTitle" + " " + pageTitle);

		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By Telephine = By.id("input-telephone");
		By password = By.id("input-password");
		By passConfirm = By.id("input-confirm");
		By clickPrivacyPolicy = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By Continue = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By accountSucessMsg = By.xpath("//*[@id=\"content\"]/h1");
		// System.out.println(accountSucessMsg);

		ElementUtil util = new ElementUtil(driver);
		util.dosendKeys(FirstName, "janaki");
		util.dosendKeys(LastName, "swamy");
		util.dosendKeys(emailId, "janaki.c@gmail.com");
		util.dosendKeys(Telephine, "907543287");
		util.dosendKeys(password, "janaki@123");
		util.dosendKeys(passConfirm, "janaki@123");
		util.doClick(clickPrivacyPolicy);
		util.doClick(Continue);
		String getText = util.doElementGetText(accountSucessMsg);
		System.out.println(getText);
		//Validation of the text 
		if(getText.contains("Your Account Has Been Created!")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
