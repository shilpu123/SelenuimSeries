package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//either element is not availble or script issue

public class ElementnotDisplyed {
static	WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive");
		By search = By.name("search");
		
		
		//we+action
		//exception is coming from WE because of wrong locator findelement throws this error nosuchelementexpection 
		boolean flagImg = driver.findElement(logoImage).isDisplayed();
		System.out.println(flagImg);
		//Interview question :Throws:NoSuchElementException - If no matching elements are found
		
		
	}

}
