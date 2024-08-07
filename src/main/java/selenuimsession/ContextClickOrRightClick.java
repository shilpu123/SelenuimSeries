package selenuimsession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickOrRightClick {


		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
			
			Actions act = new Actions(driver);
			act.contextClick(ele).build().perform();
			
	List<WebElement>	rightElements =	driver.findElements(By.cssSelector("ul.context-menu-list span"));
	System.out.println(rightElements.size());
	
	for(WebElement e: rightElements) {
	String text=	e.getText();
	System.out.println(text);
		
		if(text.equals("Copy")) {
		e.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		}
	}
			
			
		

	}

}
