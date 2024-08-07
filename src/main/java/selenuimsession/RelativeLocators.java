package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		// above
		// near
		// left . right
		// below .....these are 5 relativeLocatoe //sel 4.x

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.linkText("Dorval, Canada"));

		String rightIndexValue = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndexValue);

		String leftIndexValue = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndexValue);

		String AboveValue = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(AboveValue);

		String BelowValue = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(BelowValue);

		String nearValue = driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(nearValue);
	}

}
