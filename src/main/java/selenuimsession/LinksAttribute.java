package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Web Scrapping : scrap data through selenium 

public class LinksAttribute {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https:www.amazon.com");
		driver.navigate().refresh();

		By links = By.tagName("a");
		By Images = By.tagName("img");

		// getElements(Images);
//		List<WebElement> linklist = getElements(links);
//		System.out.println("total links"+linklist.size());
//		for (WebElement e : linklist) {
//			String hrefValue = e.getAttribute("href");
//			String linkText =e.getText();
//			
//			System.out.println(hrefValue+"---->"+linkText);
//
//	}
//		List<WebElement> imagesList = getElements(Images);
//		System.out.println("total images" + imagesList.size());
//		for (WebElement e : imagesList) {
//			String srcValue = e.getAttribute("src");
//			System.out.println(srcValue);
//		}

		getElementAttributes(Images, "src");
		getElementAttributes(links, "href");
	}
		

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void getElementAttributes(By locator, String Attrname) {
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String attrVal = e.getAttribute(Attrname);
			System.out.println(attrVal);

		}
	}

}
