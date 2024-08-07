package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	driver.findElement(By.xpath("/////input[@@@@id=@'name']")).sendKeys("testing");//"Unable to locate an element with the xpath expression
		//InvalidSelectorExpection
		
		driver.findElement(By.xpath("//input[@id='naveen']")).sendKeys("testing");//.NoSuchElementException: 
		
		//NoAlertExpection if alert is not there 
		
		//SuperClass of all the wxpection is Expection Class
		//SuperClass of Throwbale is Object
		
		//WebDriverExpection is parent of all the expection

		

	}

}
