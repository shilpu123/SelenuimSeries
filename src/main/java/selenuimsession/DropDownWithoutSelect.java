package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();

		

//		List<WebElement> optionList = driver.findElements(options);
//		System.out.println(optionList.size() - 1);
//
//		for (WebElement e : optionList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		//By country = By.id("Form_getForm_Country");
		By options = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		dropDownWithoutSelect(options, "India");

	}

	public static  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void dropDownWithoutSelect(By locator, String expvalue) {

		List<WebElement> optionList = getElements(locator);
		for (WebElement e : optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(expvalue)) {
				e.click();
				break;
			}

		}
	}

}
