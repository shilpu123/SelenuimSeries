package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By button = By.cssSelector("input[type='submit']");

//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(fn), "shilpa").build().perform();
//		act.sendKeys(driver.findElement(ln), "chid").build().perform();
//		act.click(driver.findElement(button)).build().perform();
		
		//ElementNotInteractableExpection
		//ElementNotInterceptedExpection
		doSendKeys(fn, "shilpa");
		doSendKeys(ln, "C");
		doClick(button);

	}
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value) {
		Actions act= new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
    public static void doClick(By locator) {
    	Actions act= new Actions(driver);
    	act.click(getElement(locator)).build().perform();;
    	
    }
}
