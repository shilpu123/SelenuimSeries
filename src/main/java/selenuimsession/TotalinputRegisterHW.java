package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.page.Page;

public class TotalinputRegisterHW {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> totalinput = driver.findElements(By.className("form-control"));
		//form//input[@placeholder]
		int inputcount = totalinput.size()-1;
		System.out.println(inputcount);
		
//		for(WebElement e: totalinput) {
//		String text=	e.getText();
//		System.out.println(text);
//		}
		
		
		
	}
	

}
