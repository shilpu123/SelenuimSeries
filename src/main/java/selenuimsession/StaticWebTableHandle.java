package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new EdgeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//	int header=	getTableHeaderCount();
//	System.out.println(header);
//	
//	int rowcount =getTableCount();
//	System.out.println(rowcount);
	
	 //table[@id="customers"]/tbody/tr[2]/td[1]
//table[@id="customers"]/tbody/tr[3]/td[1]
	//table[@id="customers"]/tbody/tr[4]/td[1]
	//table[@id="customers"]/tbody/tr[5]/td[1]
	//table[@id="customers"]/tbody/tr[6]/td[1]
	//table[@id="customers"]/tbody/tr[7]/td[1]
	
	for(int num=2;num<=7;num++) {
	String	beforexpath ="//table[@id=\"customers\"]/tbody/tr[";
	String afterXpath ="]/td[1]";
	String xpath = beforexpath+num+afterXpath;
	//System.out.println(xpath);
	String val=driver.findElement(By.xpath(xpath)).getText();
	System.out.println(val);
	}
	
	//table[@id="customers"]/tbody/tr[2]/td[2]
	
	
	
		for(int i=2;i<=7;i++) {
			String beforexpath1="//table[@id=\"customers\"]/tbody/tr[";
			
			String afterxpath1="]/td[2]";
			
			String contact =beforexpath1+i+afterxpath1;
			//System.out.println(contact);
			String val1= driver.findElement(By.xpath(contact)).getText();
			System.out.println(val1);
			
			
		
		}
		//table[@id="customers"]/tbody/tr[2]/td[3]
		//table[@id="customers"]/tbody/tr[2]/td[3]
		
		
		for(int i =2;i<=7;i++) {
			String beforexpath2= "//table[@id=\"customers\"]/tbody/tr[";
			String afterxpath2 = "]/td[3]";
			String country= beforexpath2+i+afterxpath2;
			//System.out.println(country);
			String countrypath = driver.findElement(By.xpath(country)).getText();
			System.out.println(countrypath);
		
		}
		
	
	}
	
	

	public static int  getTableHeaderCount() {
	return	driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	public static int getTableCount() {
	return	driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
	}
}
