package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		// driver.findElement(By.id("pizza")).sendKeys("veg pizza");

		// browser--->page--->shodowDom ---->shadowDom--->input element

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pizza = (WebElement) js.executeScript(
				"return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");

		pizza.sendKeys("veg pizza");

	}
}
