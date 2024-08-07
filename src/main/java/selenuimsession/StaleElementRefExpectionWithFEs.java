package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExpectionWithFEs {
	//click,back,forward,refresh:only for this scenario we weill get staleElemenntExpection

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	List<WebElement> linkslist=	driver.findElements(By.xpath("//footer//a"));
	
	for(int i=0;i<linkslist.size();i++) {
		
		linkslist.get(i).click();
		driver.navigate().back();
		Thread.sleep(2000);
		linkslist=	driver.findElements(By.xpath("//footer//a"));
		
	}
		

	}

}
