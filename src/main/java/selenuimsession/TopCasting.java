package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.remote.*;

public class TopCasting {

	public static void main(String[] args) {
		
		
		//1.browser specific ---create the oobject of class ----cannot used to cross browsers
//		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver driver1= new EdgeDriver();
//		
		
		//2.topcasting with Webdriver and chrome valid -recommended----local execution 
		
		//WebDriver driver = new ChromeDriver();
		
		
		//3.SC = new CD()- valid --not recommended 
		
		//SearchContext driver = new ChromeDriver();
		
		//4. RWD = New CD()//RWD has implementation of all methods ---valid ---recommended 
		
		
		//RemoteWebDriver driver =new ChromeDriver();
		
		//5. WD = new RWD---valid topcasting ---recommended ---GRID---used for remote execution 
		//When we want to run on remote machine 
		//WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities)
		
		//6.SD = NEW RWD
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
	
		
		
		
		
	}

}
