package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFooterSectionHW {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class='col-sm-3']//a"));
//		System.out.println(footerlinks.size());
//
//		for (WebElement e : footerlinks) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		//By footerLinks = By.xpath("//div[@class='col-sm-3']//a ");
		By footerLinks = By.xpath("//footer//div[@class='row']/div");
		//By footerLinks = By.xpath("//footer//a");
	
//		System.out.println("the size of footer links");
//		List<String> list = getElementsFooter(footerLinks);
//		System.out.println(list.size());
//		if(list.contains("About Us")) {
//			System.out.println("Pass");
//		}
	List<String> footerSection=	getElementsFooter(footerLinks);
	System.out.println(footerSection);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> getElementsFooter(By locator) {

		List<String> listOfFooter = new ArrayList<String>();
		List<WebElement> footerList = getElements(locator);
		for (WebElement e : footerList) {
			String text = e.getText();
			listOfFooter.add(text);
		}
		return listOfFooter;
	}

}
