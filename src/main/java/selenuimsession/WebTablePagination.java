package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);

		// single selection
		while (true) {

			if (driver.findElements(By.xpath("//td[text()='naveen']")).size() > 0) {
				getSelectCountry("naveen");
				break;

			} 
			else {
				// pagonation logic
				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over....country is not found");
					break;
				}
				next.click();
				//Thread.sleep(2000);
			}
		}
	}

	public static void getSelectCountry(String country) {
			driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
			
			
		
	
	}

}
