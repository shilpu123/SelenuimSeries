package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.linkText("Forgotten Password")).click();

		// System.out.println(driver.getTitle());//loading ......checking......for
		// slower application title is ntot avaiablewe need apply wait

//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("Password?"));
//		
//		System.out.println(driver.getTitle());

		String title = waitForTitleContainsAndFetch(10, "Password?");
		if (title.contains("Forgot Your Password?")) {
			System.out.println("Pass");
		}
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		if(waitForUrlContains(10,"mobile-phones")) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("URL is notcorrect");
		}
		

	}

	public static String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();

	}
	public static String waitForTitleIsAndFetch(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();

	}
	public static String waitForUrlContainsAndFetch(int timeOut, String UrlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(UrlFractionValue));
		return driver.getCurrentUrl();

	}
	public static String waitForUrlContainsIsFetch(int timeOut, String UrlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(UrlValue));
		return driver.getCurrentUrl();

	}
	public static boolean waitForUrlContains(int timeOut, String UrlFractionValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		 return wait.until(ExpectedConditions.urlContains(UrlFractionValue));
		

	}
}
