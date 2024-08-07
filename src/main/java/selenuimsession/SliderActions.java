package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

		WebElement slider = driver.findElement(By.id("slider"));

		slider.click();

		int width = slider.getSize().getWidth();
		System.out.println(width);

		Actions act = new Actions(driver);
		act.moveToElement(slider, -((width/2)-30), 0).click().build().perform();

	}

}
