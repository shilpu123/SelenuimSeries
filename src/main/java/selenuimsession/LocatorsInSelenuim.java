package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenuim {
	static WebDriver driver;

	public static void main(String[] args) {

		// 8 locators
		// id, name, classname----these 3 are attribute , xpath, cssselector, linktext,
		// partiallinktext, tagname
		// if id is avaiable i will go with that beacuse its unique

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// id ---will be always be unique

		// 2. name ---can be unique
//		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
//
//		By email = By.name("email");

		// 3.classname--- can be duplicate most of the time---not recommended if its
		// duplicate
		// use class name only if its unique
		// driver.findElement(By.className("form-control")).sendKeys("ship@gmail.com");

		// 4.Xpath: its not an attribute, its the address of the element in the HTML DOM
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

//		By emaild = By.xpath("//*[@id=\"input-email\"]");
//		By password = By.xpath("//*[@id=\"input-password\"]");
//		By login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendKeys(emaild,"shilpac@gmail.com");
//		doSendKeys(password,"sgilp123");
//		doClick(login);

		// 5. CSS sELECTOR : its not an attribute
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
//		By emaild = By.cssSelector("#input-email");
//		By password = By.cssSelector("#input-password");
//		By login = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		
//		doSendKeys(emaild, "test@gmail.com");
//		doSendKeys(password, "test123");
//		doClick(login);

		// 6.linkText:only applicable for links --->the htmltag = a ----> linktext can
		// be duplicate
		// its not attribute ---its the text of the link
//		driver.findElement(By.linkText("Register")).click();
//		By register = By.linkText("Register");
//		doClick(register);

		// 7.partialLinkText : only for links
		// forgotten password
		// forgotten userid
//	driver.findElement(By.partialLinkText("Forgotten")).click();

		// 8.tagName:html tag
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

		// use case of getText: links, headers, paragraph,footer, header

		By payment = By.linkText("Recurring payments");
		String val = doElementGetText(payment);
		System.out.println(val);
		//click: button,checkboxes,radiobutton,images,links
		// sendkeys:textbox/textfiels, dropdown, fileupload
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
}
