package selenuimsession;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// WebDriverWait---->FluetWait ------>Wait

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By cutomerService = By.xpath("//input[@value='Login']");

//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class)
//				.pollingEvery(Duration.ofSeconds(2))
//				.withMessage("...............********element is not found on the page");

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("...element is not found on the page....");
		
	WebElement freeTrail =	wait.until(ExpectedConditions.presenceOfElementLocated(cutomerService));
	freeTrail.click();
		//waitForElementPresenceWithFluentWait(10, 2, cutomerService);

		// Please use different appkication to test

	}

//	public static WebElement waitForElementPresenceWithFluentWait(int timeOut, int pollingTime, By locator) {
//
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
//				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class)
//				.pollingEvery(Duration.ofSeconds(pollingTime)).withMessage("...element is not found on the page....");
//
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//
//	}

	public static void waitForAlertWithFluentWait(int timeOut, int pollingTime, By locator) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoAlertPresentException.class).pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("...element is not found on the page....");

		wait.until(ExpectedConditions.alertIsPresent());

	}

}
