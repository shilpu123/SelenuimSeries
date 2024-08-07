package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextCrmHW {
	static WebDriver driver;

	

		public static void main(String[] args) {
			driver = new ChromeDriver();

			driver.get("https://classic.freecrm.com/");

			List<WebElement> totaltext = driver.findElements(By.tagName("div"));
			int texttotal = totaltext.size();
			System.out.println(texttotal);
			
			for(int i=0;i<texttotal;i++) {
				String text = totaltext.get(i).getText();
				//System.out.println(text);
				if(text.length()>0) {
					System.out.println(i+ " "+text);
				}
			}

		}
	}


