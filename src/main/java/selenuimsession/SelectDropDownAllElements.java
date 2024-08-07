package selenuimsession;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.systeminfo.SystemInfo;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;

public class SelectDropDownAllElements {
	//Interview question is your not allowed to use the Select() class
	//

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();

//		Select select = new Select(driver.findElement(country));
//		List<WebElement> countryList = select.getOptions();// capture all these options
//		System.out.println(countryList.size()-1);
//		
//		//your not allowed to use 3 methods 
//
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Brazil")) {
//				e.click();
//				break;
//			}
//		}
		By country = By.id("Form_getForm_Country");
//		if (getTotalDropDownoptions(country) - 1 == 232) {
//			System.out.println("country dropdown count is correct");
//		}
//		if (getDropDownOptionsTextList(country).contains("India")) {
//			System.out.println("india is present");
//		}
//		List<String> expCountryList = Arrays.asList("India", "Brazil", "Belgium");
//
//		if (getDropDownOptionsTextList(country).containsAll(expCountryList)) {
//			System.out.println("Pass");
//
//		}
		selectDropDownValue(country, "North Korea");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();

	}

	public static List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionList = getDropDownOptionsList(locator);
		List<String> optiontextList = new ArrayList<String>();

		for (WebElement e : optionList) {
			String text = e.getText();
			optiontextList.add(text);
		}
		return optiontextList;
	}
	
	public static void selectDropDownValue(By locator, String expValue) {
	List<WebElement> optionList=getDropDownOptionsList(locator);
	for(WebElement e :optionList) {
		String text= e.getText();
		System.out.println(text);
		if(text.equals(expValue)) {
			e.click();
			break;
		}
		
	}
	}

	public static int getTotalDropDownoptions(By locator) {
		int optionsCount = getDropDownOptionsList(locator).size();
		System.out.println("total options=====>" + optionsCount);
		return optionsCount;

	}

}
