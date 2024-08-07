package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement ele = driver.findElement(By.id("input-firstname"));
		ele.sendKeys("Shilpac");
		
		//String name = ele.getText();//will not work if text is not avaiable
		String name=ele.getAttribute("value");
		System.out.println(name);
		
		WebElement last = driver.findElement(By.id("input-lastname"));
		last.sendKeys(null); // java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence

	}

}
