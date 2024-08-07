package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwtichCaseWebDriver {

	public static void main(String[] args) {

		WebDriver driver = null;

		String browser = "edge";

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("launch chrome browser");
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("launch Edge browser");
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}

		driver.get("https://www.amazon.com/");

		String title = driver.getTitle();
		System.out.println("the title of amazon"+" "+title);
		//Validation 
		
		
		if(title.contains("Amazon")) {
			System.out.println("Pass");
			
		}
		else {
			System.out.println("fail");
		}
driver.close();
	}

}
