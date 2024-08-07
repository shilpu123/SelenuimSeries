package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("shilpac");
		driver.findElement(By.name("password")).sendKeys("pengear@223");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		selectUser("Avi M");
		selectUser("fahad fasil");
		
	String cName=	getUserCompanyName("fahad fasil");
	System.out.println(cName);
	
	cName=getUserCompanyName("Avi M");
	System.out.println(cName);
//		

	}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
	}
	//a[text()='fahad fasil']/parent::td/following-sibling::td/a[@context='company']
	
	public static String getUserCompanyName(String userName) {
	return	driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']"))
		.getText();
	}
	
	//Hw: to getemail,gethomenumber, get mobile number, 
	
	
	}


