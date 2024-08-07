package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1").switchTo().frame("pact2").
		findElement(By.id("jex"))
				.sendKeys("shilpa");

//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("vikram");
//
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("shilpa");
//
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("vikram---new");
//
//		driver.switchTo().frame("pact2");
//
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("shilpa");
//
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
//		// driver.switchTo().defaultContent(); //cannnot jump to f1 frame
//		driver.findElement(By.id("inp_val")).sendKeys("vikram123456");
//
//		driver.switchTo().defaultContent();

	}

}
