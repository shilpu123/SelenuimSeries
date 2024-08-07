package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollIntoViewConcept {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
	WebElement ele=	driver.findElement(By.xpath("//div[@class='css-76zvg2 r-c20mna r-yy2aun r-1kfrs79' and text()='Recommended Add-Ons']"));
	
	
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
	jsUtil.scrollIntoView(ele);
	
	//click/
	//actionsclick()
	//jsclick()
	
//	WebElement Medicare = driver.findElement(By.linkText("Medical Care"));
//	jsUtil.clickElementByJS(Medicare);
//	

	}

}
