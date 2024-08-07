package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationMultiple {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);

		// multislection pagination

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='India']")).size() > 0) {
				getSelectMultipleCountry("India");
				

			}
			//pagination ;ogic:
			WebElement next = driver.findElement(By.linkText("Next"));
			
			if(next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over....country is not found");
				break;
			}
			next.click();
			//Thread.sleep(2000);
		}	
		}


	public static void getSelectMultipleCountry(String country) {
		List<WebElement> checkboxList = driver.findElements(
				By.xpath("(//td[text()='" + country + "'])/preceding-sibling::td/input[@type='checkbox']"));
		for (WebElement e : checkboxList) {
			e.click();
		}

	}

	}
