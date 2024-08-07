package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerSectionConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

//		List<WebElement> secList = driver
//				.findElements(By.xpath("//h5[text()='Information']//following-sibling::ul//a"));
////		
//		System.out.println(secList);
//		
//		for(WebElement e:secList) {
//			System.out.println(e.getText());
//		}

		List<String> infoList = getFooterSectionList("Information");
		System.out.println(infoList);
		
		List<String> myaccountList = getFooterSectionList("My Account");
		System.out.println(myaccountList);


	}

	public static List<String> getFooterSectionList(String sectionName) {
		List<WebElement> secList = driver
				.findElements(By.xpath("//h5[text()='" + sectionName + "']//following-sibling::ul//a"));

		System.out.println(secList.size());

		List<String> footerList = new ArrayList<String>();

		for (WebElement e : secList) {
			String text = e.getText();
			footerList.add(text);
		}
		return footerList;
	}

}
