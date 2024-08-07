package selenuimsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	//What if we make public : if someone access they will be getting nullpointer exception ,because 
	//public will give full access since Webdriver default value is null since String is non primitive 
//public WebDriver driver;
	private WebDriver driver;

	/**
	 * this method is used to intiliaze the driver on basis of given browser name
	 * 
	 * @param browserName
	 * @return this returns the driver or specific browser
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("Your browser name is :" + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();

			break;
		case "edge":
			driver = new EdgeDriver();

			break;
		case "safari":
			driver = new SafariDriver();

			break;
		case "firefox":
			driver = new FirefoxDriver();

			break;

		default:
			System.out.println("please pass right browser" + browserName);
			
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
	}


	// https://www.amazon.com
	public void launchUrl(String url) {
		if (url == null) {
			System.out.println("url cannot be null");

		}
		if (url.indexOf("https") == 0) {
			driver.get(url);
		}

	}

	public String getpageTitle() {

		String title = driver.getTitle();
		System.out.println("page titel" + title);
		return title;

	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("page current " + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

}
