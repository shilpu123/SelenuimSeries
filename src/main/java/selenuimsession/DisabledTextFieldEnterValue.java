package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextFieldEnterValue {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

//		driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//	WebElement ele=	driver.findElement(By.id("pass"));
//	ele.sendKeys("test@123");//ElementNotInteractableException: element not interactable

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		Thread.sleep(5000);

		WebElement submit_bn = driver.findElement(By.id("submitButton"));
		String disableText = submit_bn.getAttribute("disabled");
		System.out.println(disableText);
		submit_bn.click();//when you try to click on disabled button
		//ElementClickInterceptedException: element click intercepted:

	}

}
