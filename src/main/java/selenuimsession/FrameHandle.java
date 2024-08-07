package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//frame
		//Iframe :Security of the WebElement

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);

		int totalFrames = driver.findElements(By.xpath("//frame")).size();
		System.out.println(totalFrames);

		// driver.switchTo().frame(2);
		// driver.switchTo().frame("main");

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));

		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		//hW :crm click on other 
		

	}

}
