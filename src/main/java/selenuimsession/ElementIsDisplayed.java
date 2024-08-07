package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementIsDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean flgImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if (flgImg)
//			System.out.println("PASS");
//
//		boolean flgSearch = driver.findElement(By.name("search")).isDisplayed();
//		if (flgSearch) {
//			System.out.println("PASS");
//			driver.findElement(By.name("search")).sendKeys("macbook");
//		}
		// By locator
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		By searchIcon = By.cssSelector("#search > span > button");

		if (doElementIsDisplayed(logoImage)) {
			System.out.println("Image is present -----pass");
		}

		if (doElementIsDisplayed(search)) {
			System.out.println("Search is present");
			doSendKeys(search, "Macbook");
			doClick(searchIcon);

		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
		
	}

}
