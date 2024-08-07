package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExpectionConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//DOM v1

		WebElement fn = driver.findElement(By.id("input-email"));//v1
		fn.sendKeys("shilpa@gmail.com");//v1

		Thread.sleep(3000);

		driver.navigate().refresh();//StaleElementReferenceException: stale element reference: stale element not found //Domv2
        fn=driver.findElement(By.id("input-email"));//v2
		fn.sendKeys("guru@gmail.com");

	}

}
