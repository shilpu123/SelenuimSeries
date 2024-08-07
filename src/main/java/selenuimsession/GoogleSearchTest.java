package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("naveen automation labs");

		Thread.sleep(3000);

//		List<WebElement> suggList = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
//				////li[@role='presentation']//div[@class='wM6W7d']/span
//		
//		System.out.println(suggList.size());
//		
//		for(WebElement e:suggList) {
//		String text=	e.getText();
//		System.out.println(text);
//		if(text.contains("aveen automation labs github")) {
//			//System.out.println(text);
//			e.click();
//			break;
//			
//		}
//		}

		By googleSearch = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doSearch(googleSearch,"naveen automation labs training");

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void doSearch(By locator, String suggName) {
		List<WebElement> suggList = getElements(locator);
		System.out.println(suggList.size());
		for (WebElement e : suggList) {
			String text = e.getText();
			if(text.length()>0) {
				System.out.println(text);
			}
			//System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}

		}
	}

}
