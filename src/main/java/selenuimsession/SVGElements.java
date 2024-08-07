package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		// Scalar Vector Graphs :Nees to create special path //*[local-name()='svg']
		// child //*[name -

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");

		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";

		List<WebElement> states = driver.findElements(By.xpath(svgXpath));

		System.out.println(states.size());
		Actions act = new Actions(driver);

		for (WebElement e : states) {

			String stateName = e.getAttribute("name");
			System.out.println(stateName);

			if (stateName.equals("Florida")) {
//				e.click();
//				break;
				Thread.sleep(2000);

				int x = e.getSize().getWidth();
				int y = e.getSize().getHeight();
				
				System.out.println(x +":"+ y );
				
				act.moveToElement(e, (x/2)-40, 0).click().build().perform();
				break;

				//// *[local-name()='svg' and @id='map-svg' ]//*[name()='g' and
				//// @id='regions']//*[name()='g'and @id='texas']
				// correct path to find the regions in Texas
				//// *[local-name()='svg' and @id='map-svg' ]//*[name()='g'and
				//// @id='texas']//*[name()='path']
			}
		}

	}

}
