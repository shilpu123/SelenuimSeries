package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		// driver.manage().window().fullscreen();

		driver.manage().deleteAllCookies();

		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon.com"))
		{
			System.out.println("pass");
		}
	String pgsrc=	driver.getPageSource();
	System.out.println(pgsrc);
	if(pgsrc.contains("Gateway")) {
		System.out.println("pass");
	}
driver.quit();
	}

}
