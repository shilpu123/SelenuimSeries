package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");

		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id=SIvCob']/a"));
		System.out.println(langLinks);
		
		for(WebElement e :langLinks) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("---")) {
				e.click();
				break;
			}
					
		}
//1.click in specific langlink
//2. return the list of lanlink 
		//3.list of footer 
	}

}
