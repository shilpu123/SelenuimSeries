package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		///browser is not visible
		//headless- testing is happenning behind the scene
		//fast than the noraml mode 
		
		//sanity test cases
		//for the complex html dom --it might work 
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless=new");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://naveenautomationlabs.com/opencart/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
