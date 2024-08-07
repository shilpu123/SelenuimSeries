package selenuimsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		// which property we need open the new domain ANS: target=_blank

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);

		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twEle.click();
		//get the window IDs

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
