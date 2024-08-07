package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromSection {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		List<WebElement> panelLinkList = driver.findElements(By.xpath("//aside[@id=\"column-right\"]//a"));
//		System.out.println(panelLinkList.size());
//
//		for (WebElement e : panelLinkList) {
//			String Text = e.getText();
//			System.out.println(Text);
//		}
		
	By rightPanelList =	By.xpath("//aside[@id=\"column-right\"]//a");
	List<String> rightEleList=getElementsTextList(rightPanelList);
	System.out.println(rightEleList);
	System.out.println(rightEleList.contains("Login"));
	System.out.println(rightEleList.contains("Wish List"));
	System.out.println(rightEleList.contains("Newsletter"));

	}

	public static List<String> getElementsTextList(By locator) {

		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
