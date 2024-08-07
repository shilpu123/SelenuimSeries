package selenuimsession;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;


public class SignatureGenerator {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/#google_vignette");
		Thread.sleep(3000);
		
	WebElement canvas=	driver.findElement(By.id("signature-pad"));
	Actions act = new Actions(driver);
	
	Action signature = act.click(canvas)
			.moveToElement(canvas, 3, 3)
			.clickAndHold(canvas)
			.moveToElement(canvas, -200, -50)
			.moveByOffset(50, -50)
			.release(canvas)
			.build();
	signature.perform();
	
	//Freeze your application in order to inspect fnf8
	
	
			
	

	}

}
