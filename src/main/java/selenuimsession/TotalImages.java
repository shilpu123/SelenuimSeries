package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Image;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		

		driver.navigate().refresh();
		List<WebElement> ImageList = driver.findElements(By.tagName("img111")); ///list count 0 it wont  give any error , empty list where size is 0
		System.out.println(ImageList.size());
		
		//FindElement       								FindElements
		//WE												list<WebElement>
		//NSE(NO SUCH ELEMENT EXPEXTION)    				EMPTYLIST-->SIZE==0
		//ACTION CAN BE PEFORMED 							ACTION CANNOT BE PERFOMED 
		
		

	}

}
