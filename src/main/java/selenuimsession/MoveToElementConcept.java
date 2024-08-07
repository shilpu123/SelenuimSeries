package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static	WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		
			driver = new ChromeDriver();
			driver.get("http://mrbool.com/search/");

			WebElement menu =	driver.findElement(By.cssSelector("a.menulink"));
			
			Actions act = new Actions(driver);
			act.moveToElement(menu).build().perform();
			
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("COURSES")).click();
			
			//SpiceJet ////www.spicejet.com
			
			

	}

}
