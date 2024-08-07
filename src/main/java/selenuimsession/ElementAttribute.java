package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//	String firstName =	driver.findElement(By.name("firstname")).getAttribute("placeholder");
//	System.out.println(firstName);
//	
//String src=	driver.findElement(By.className("img-responsive")).getAttribute("src");
//String title=	driver.findElement(By.className("img-responsive")).getAttribute("title");
//System.out.println(src+"---->"+title);
		
		
		By firstName = By.name("firstname");
		By logo = By.className("img-responsive");
		By title = By.className("responsive");
		
		
		String placeholder	=	getElementAttribute(firstName,"placeholder");
	String srcvalue=	getElementAttribute(logo, "src");
	String titleVal = getElementAttribute(title, "src");
		System.out.println(placeholder);
		System.out.println(srcvalue);
		System.out.println(titleVal);
		
		//IQ:
		//HOW TO capture the HREF 
	
	
		

		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator , String attrName) {
	return 	getElement(locator).getAttribute(attrName);
	}

}
