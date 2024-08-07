package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1.open the browser ;chrome,ff

		//ChromeDriver driver = new ChromeDriver();
		// 2.enter the url
		
		//cross browser logic 
		
		String browser ="chrome";
		WebDriver driver = null;
		
		
		
		if(browser.equals("chrome")){
			driver = new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver= new EdgeDriver();
		}
		else if(browser.equals("safari")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("please pass the right browser ");
		}
		
		//WebDriver driver = new EdgeDriver();

		driver.get("https://www.google.com/");

		// get the title
		String actTile = driver.getTitle();
		System.out.println("My page title" +" :"+ actTile);

		// 4. verify the title :VALIDATION or checkpoint means my validation is correct or ot 
		if(actTile.equals("Google")) {
			System.out.println("PASS");
			
		}
		else {
			System.out.println("Fail");
		}
		
		//Automation steps+validation is also called Asserstion  = Autoamtion test 
		
		//Quit the driver 
		
		
		driver.close();
		
		

	}

}
