package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();
		
		
		
//		//dropdown ----html tag----<select>
//		//use select class in selenium 
//		
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(country_ele);
//		
//		//select.selectByIndex(5);
//		//select.selectByValue("Belgium");//value attribute
//		select.selectByVisibleText("India");//text of the option 
		
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country, 5);
		Thread.sleep(3000);
		doSelectDropDownByValue(country, "Belgium");
		Thread.sleep(3000);
		doSelectDropDownByVisibleText(country, "India");
		
		
	}
	
	public static WebElement getElement(By locator) {
	return	driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select= new Select(getElement(locator));
		select.selectByValue(value);
	}
	public static void doSelectDropDownByVisibleText(By locator,String text) {
		Select select= new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
