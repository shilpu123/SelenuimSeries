package selenuimsession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertPopUp {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();

	}

	public static Alert waitForAlertPresence(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public static String getAlertText(int timeout) {
	return	waitForAlertPresence(timeout).getText();
	}
	
	public static void acceptAlert(int timeout) {
		waitForAlertPresence(timeout).accept();
	}
	
	public static void acceptDismiss(int timeout) {
		waitForAlertPresence(timeout).dismiss();
	}
	

	public static void alertSendKeys(int timeout, String value ) {
		waitForAlertPresence(timeout).sendKeys(value);
	}
	
	
		
}
