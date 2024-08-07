package selenuimsession;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		
		ElementUtil util = new ElementUtil(driver);
		util.clickWhenReady(10, twitter);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> handles = driver.getWindowHandles();
		//Set doesnt maintain the order
		//it cannot handle duplicate value

	Iterator<String> it = handles.iterator();
	String parentWindowId = it.next();
	System.out.println("Parent window id :"+parentWindowId);

	String childWindowId = it.next();
	System.out.println("Child windowid :"+childWindowId);
	
	//Switching to window

	 driver.switchTo().window(childWindowId);
	 System.out.println("child window url:"+ driver.getCurrentUrl());
	 
	 driver.close();//close the child window
	 
	 driver.switchTo().window(parentWindowId);
	 System.out.println("parent window url:"+ driver.getCurrentUrl());
	 
	 driver.quit();//quit the main window 

}

		
		
	}


