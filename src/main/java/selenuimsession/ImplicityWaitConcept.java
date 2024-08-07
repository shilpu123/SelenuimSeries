package selenuimsession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitConcept {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//SEL 3.X 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
	
		
		//global wait : implicit wait is always the global time:10secs
		//it will be applied for all the elements by default
		//FE: IMPLICIT WAIT will be applied automatically --only for elements
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("shilpa@gmail.com");//10-5=5
		driver.findElement(By.id("input-password")).sendKeys("shilpa123");//10-2=8
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();//10-6=4
		
		//home page:20 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Sel 4.x
		//global wait :20 sec
		//e7 e8 e9---20 secs
		
		//login paage:20 sec --->10 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		//register page:5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //Sel 4.x
		
		
		//login:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		//forgot pwd:0 secs - nullify of impwait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		//only for web element :svg, iframe, Wes
		//it does not support non web elements : title,url,alert-js
		
		//cy/pw: autowait 
		//cy vs sel
		//1. sel is faster than cypress
		//2. 
		
		
		
		

	}

}
