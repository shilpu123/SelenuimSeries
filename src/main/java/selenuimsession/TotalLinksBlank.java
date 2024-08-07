package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksBlank {
	static WebDriver driver;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.navigate().refresh();
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		
		int blankcount=0;
		for(WebElement e:linklist) {
			if(linklist.isEmpty()) {
				blankcount++;
			}
			System.out.println(blankcount);
		}

	}

}
