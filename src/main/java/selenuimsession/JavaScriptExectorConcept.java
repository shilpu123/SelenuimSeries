package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExectorConcept {

	public static void main(String[] args) throws InterruptedException {
		// Selenium cannot give everything
		// browser understands only the Javascript
		// some features need
		// its interface helps execute your Java

		WebDriver driver = new ChromeDriver();

		driver.get("https://crmpro.com/");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		js.executeAsyncScript("alert('hi this alert');");

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		jsUtil.generateAlert("Hi this is the Alert page");

		// jsUtil.generateConfirmPopUp("are you sure");

		// jsUtil.refreshBrowserByJS();

//	String text=	jsUtil.getPageInnerText();
//	System.out.println(text);
//	if(text.contains("point-and-click")) {
//		System.out.println("pass");
//	}

		WebElement border = driver.findElement(By.name("username"));
//	jsUtil.drawBorder(border);
//	
//	WebElement border1 =driver.findElement(By.id("hs-login"));
//	jsUtil.drawBorder(border1);

//		jsUtil.flash(border);
//		border.sendKeys("shilpa@gmail.com");

		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		Thread.sleep(2000);
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		Thread.sleep(2000);
		jsUtil.scrollPageDownMiddlepage();
		

	}

}
