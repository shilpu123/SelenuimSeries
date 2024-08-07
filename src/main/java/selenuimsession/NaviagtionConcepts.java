package selenuimsession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviagtionConcepts {
	//get and navigateto we can maintian the history 
	//to() method is internally calling get()method
	//no difference at all
	//only difference : 

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//to method is overloaded 
		
		//driver.navigate().to(new URL("https://www.amazon.com/"));
		//driver.navigate().toString();

		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		

	}

}
