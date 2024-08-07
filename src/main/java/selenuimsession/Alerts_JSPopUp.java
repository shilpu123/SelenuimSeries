package selenuimsession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_JSPopUp {

	public static void main(String[] args) throws InterruptedException {

		// js alert--- alert, prompt,confirm  ---no url,no xpath
		// auth pop
		// browser window pop up/adv pop
		// file upload pop up

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		Thread.sleep(3000);
//
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();
		// alert.dismiss(); //keyboard esc is calling dismiss
		// when no alert what expextion ---> NoAlertExpection: no such alert

//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//
//		Alert confirm = driver.switchTo().alert();
//		String confirmAlert = confirm.getText();
//		System.out.println(confirmAlert);
//		confirm.accept();//click on okay
//		//alert.dismiss();--> click on okay
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Shilpa");
		Thread.sleep(3000);
		prompt.accept();

	}

}
