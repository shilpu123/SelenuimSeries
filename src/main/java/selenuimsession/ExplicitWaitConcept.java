package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn =By.xpath("//input[@class='btn btn-primary']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    WebElement email_el=	wait.until(ExpectedConditions.presenceOfElementLocated(email));
//	    email_el.sendKeys("test@gmail.com");
		;
		waitForElementPresence(email, 10).sendKeys("Test@gmail.com");
	    
	    getElement(password).sendKeys("test123");
	    getElement(loginBtn).click();

	}
		/** An expectation for checking that an element is present on the DOM of a page. 
		 * This does not necessarily mean that the element is visible.
		 * @param locator
		 * @param timeout
		 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	/**
		 * An expectation for checking that an element is present on the DOM of a page and 
		 * visible.Visibility means that the element 
		 * is not only displayed but also has a height and width that isgreater than 0.
		 * @param locator
		 * @param timeout
		 * @return
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	    return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
