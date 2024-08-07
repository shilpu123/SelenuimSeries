package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class QuitVsClose {

	public static void main(String[] args) {
	
		
		//SID ---Session id 
		//Syroncise request
		
		WebDriver driver = new ChromeDriver();//123
		driver.get("https://www.amazon.com");//123
		String title =driver.getTitle();//123
		System.out.println(title);//google
		System.out.println(driver.getCurrentUrl());//123
		driver.close();//NoSuchSessionException: invalid session id and same session id 
		//driver.quit();
		
//		 driver = new ChromeDriver();//new session id will be assigned 
//		
		System.out.println(driver.getTitle());//null
		//NoSuchSessionException: session id is null  Session ID is null. Using WebDriver after calling quit()?
		
//CASE STUDY:
	//	WebDriver driver = new ChromeDriver();//123
		//ChromeDriver: chrome on windows (84cb6f93007365d319e968a3b4ac7a47)
	}//Solution : reintilaize the driver 

}
