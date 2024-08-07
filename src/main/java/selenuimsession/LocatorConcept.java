package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		// create a webelement and perform some action (click,sendkeys, capture the text
		// ---gettext,
		// isDisplayed ....various methods )

		// create a WebElement : need a locator

	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.id
		// 1st
//		driver.findElement(By.id("input-email")).sendKeys("shilpac.11@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("shilpa123");

		// 2nd
//		WebElement emaild = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emaild.sendKeys("shilpa123@gmail.com");
//		password.sendKeys("shilpa123");

		// 3rd By Locator

//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement eId = driver.findElement(emailid);
//		WebElement pwd = driver.findElement(password);
//		
//		eId.sendKeys("shilp@gmail.com");
//		pwd.sendKeys("shilpa");
		
		//4rd By locator+ genreic method for webelement 
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(emailid).sendKeys("shilpa@gmail.com");
//		getElement(password).sendKeys("shilpa");
		
		//5th By locator+ genreic method for webelement 
//		By emailid = By.id("input-email");
//		By password = By.id("input-password");
//		dosendKeys(emailid,"shiloa@gmail.com");
//		dosendKeys(password, "shilpa");
		
		//6th By locator+ genreic method for webelement and actions in a ElementUtil
		By emailid = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.dosendKeys(emailid, "shilpa123");
		eleUtil.dosendKeys(password, "shil");
	}

//	
//	public static WebElement getElement(By locator) {
//	return	driver.findElement(locator);
//		
//		
//	}
//	public static void dosendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//		
//	}
}
