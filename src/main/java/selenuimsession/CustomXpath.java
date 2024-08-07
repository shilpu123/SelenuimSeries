package selenuimsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// xpath:addressof the element in html dom
		// absolute xpath : not perferred
		// relative xpath: custom xpath

		// tagname[@attribute='value']---1 attribute
		// tagname[@atttibute='value and @attribute='value']
		// tag
		// input
		// a----81 ----findElements : total number of links
		// img
		// tagname[@atttibute='value or @attribute='value']

		// xpath with text:
		// text is not an attribute,its the text content of the element
		// dont use @text ....we use text() function
		// tag[text()='value']
		// h2[text()='New Customer']
		//HW: do for forgot password 

		By newCus = By.xpath("h2[text()='New Customer']");

		// check my Account links is present on the page ---two times
		By myAcc = By.xpath("h2[text()='My Account']");
		int myAccCount = driver.findElements(myAcc).size();
		if (myAccCount == 2) {
			System.out.println("Pass");

		}
	
		
		//text() with attribute:
		//tag[@att='value' and text()='value]
		////span[@class="sc-b323b31-0 hBtsTr" and text()='FRESHWORKS PRODUCTS']
		//h2[@class="sc-4555ca6a-0 cXWnXL" and text()='All SaaS, no bloat.']
		//tag[@att1='value' and @att2='value' and  text()='value]
		
		//contains() with attribute
		
		//tag[contains(@attr,'value')]
		////input[contains(@name,'first')]
		
		//conatains() with attribute and use another attribute without conatins
		//tag[contains(@attr,'value') and @attr='value]
		
		//dynamic id/attribute :how to handle
		//<input id =firstname_123>:in this case we can use contains(in case 123 keeps changind)
		//input[contains(@id='firstname_')]---right
		
		//contains() with text()
		//tag[contains(text(),'value')]
		////p[contains(text(),'bloat')]
		
		//interview questions : in amazon page give me all the links  which conatians  amazon 
		////a[contains(text(),'Amazon')]
		
		//conatins() with text() and attribute
		//tag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Science') and contains(@href,'amazon.science')]
		
		//coantains()with text() and attribute wuth contains()
		
		//tag[contains(text(),'value') and @attr='value']
		////a[contains(text(),'Science') and @class='nav_a']
		
		//starts-with()
		//tag[starts-with(text(),'value')]
		////small[starts-with(text(),'Our reporting features allow you to gauge the effectiveness')]
		
		//with attrbute
		//tag[starts-with(@attr,'value) and @attr='value']
		//a[starts-with(@id,'nav-link-') and @data-nav-ref='nav_ya_signin']
		
		//position/indexpath/capturegroup:
		// (//input[@class='form-control'])[1]  ----indexpath
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class="form-control"])[3] --using naveen reg page
		// (//input[@class="form-control"])[last()]  ---if we want to capture the last element 
		// (//input[@class="form-control"])[last()-1]  
		//Interview Question :
		//
		
		//Amazon to visit footer section --hElp
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()]
		//((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		
		//class in locator :className, xpath, css
		
		////input[@class='form-control private-form__control login-email']---valid
		////input[@class='login-email']  ---invalid
		//By.className("form-control private-form__control login-email");---not valid one class is allowed
		//By.className("login-email") //valid
		//By.Xpath(input[contains(@class,'login-email')]); //Valid
		
		
		//  parent/child---direct
		// parent//child  ---direct+indirect
		
		//backward traversing in xpath 
		
		// child/parent --//input[@id='input-email']/../../../../../..
		//siblings ---preceding////input[@id='input-email']/preceding-sibling::label
		
		driver.findElement(By.xpath("//input[@id='input-email']/preceding-sibling::label")).getText();
		
		//Siblings ---following 
		//label[@for='input-email']/following-sibling::input[@name='email']
		
		//Crmpro
		//this for go to left checbox
		//a[contains(text(),'Ali khan')]/../preceding-sibling::td/input[@type='checkbox']
		//a[text(),'Romi Singh']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//right hand side
		
		//(a[text(),'Ali khan]/parent::td/following-sibling::td)[position()=1]/a
		
		driver.findElement(By.xpath("//(a[text(),'Ali khan']/parent::td/following-sibling::td)[position()=1]/a")).getText();
		
		//[a[text(),'Ali Khan']/parent::td/folloeing-sibling::td/span
		
		//span[contains(text(),'Smriti Mandhana')]/../../../../following-sibling::td//span//span
		
		////span[contains(text(),'Smriti Mandhana')]/ancestor::td/following-sibling::td//span
		
		//span[contains(text(),'Smriti Mandhana')]/ancestor::td/following-sibling::td//span)[2]
		
		//using * ---> //*[@id='input-firstname']
		
		//
		
		
		//*********************************************************************************************
		
		//	Naveen Automation Labs OpenCart : https://naveenautomationlabs.com/opencart/
			//
//						Automation Book Store: https://automationbookstore.dev/
			//
//						Automation Test Store: https://automationteststore.com/
			//
//						DemoBlaze: https://www.demoblaze.com/
			//
//						DemoQA: https://demoqa.com/
			//
//						ParaBank: https://parabank.parasoft.com/parabank/index.htm
			//
//						SelectorsHub: https://selectorshub.com/xpath-practice-page/
			//
//						Selenium Test Pages: https://testpages.herokuapp.com/styled/index.html
			//
//						Swag Labs: https://www.saucedemo.com/
			//
//						The Internet: https://the-internet.herokuapp.com/
			//
//						UI Test Automation Playground: http://uitestingplayground.com/
			//
//						XYZ Bank: https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
					
					//groupautomation/Selenium@12345
					//newautomation/Selenium@12345
					
		
		
		
		

	}

}
