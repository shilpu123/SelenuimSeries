package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUpHandle {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		driver.findElement(By.name("upfile")).sendKeys("C://Users//PC43//Desktop//test.png");
		
		//<tag type="file">this is mandatory attribute
		//type='file' is mand
		//autoID/Sikuli   ---not all recommended 
	}
	
//	public static void getfileUploadPath(String path) {
//		
//	}

}
