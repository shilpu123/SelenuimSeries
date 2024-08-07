package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		Thread.sleep(5000);
		
//		driver.switchTo().
//		
//		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Honda City");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		//driver.findElement(By.id("RESULT_TextField-7")).sendKeys("India-9090");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Honda City");
		
		driver.switchTo().defaultContent();
		
		

	}

}
