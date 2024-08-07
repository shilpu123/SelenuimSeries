package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
			
		
		WebElement drag=	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=	driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
//		act
//		.clickAndHold(drag)
//				.moveToElement(drop)
//							.release()
//									.build()
//										.perform();

		act.dragAndDrop(drag, drop).build().perform();
	}

}
