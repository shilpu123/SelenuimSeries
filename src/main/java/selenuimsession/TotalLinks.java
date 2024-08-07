package selenuimsession;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		// use case : find the all links on page
		// print the total links count on page
		// print tye text of each link

		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");

		driver.navigate().refresh();

		// find all links on the page
		// link is interface

		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		int linkscount = linklist.size();
		System.out.println("total links count" + " " + linkscount);

		// print the text of each link
		// Always DOM will be loaded like css,elements , DOM APIS , then the page willbe
		// loaded
		// if 100 elements are there in DOM, ONLY 80 WILL be displayed in page becasuse
		// of hidden elemsts any
		// 2. some links can have blank links are also avaiavle in page

//		for (int i = 0; i < linkscount; i++) {
//			String text = linklist.get(i).getText();
//			if (text.length() > 0) {
//				System.out.println(i + ":" + text);
//
//			}
//
//		}

		// Assignment : get the total blank list count ???

		// avoid the blank text
		
		//int count =0;
		for (int i = 0; i < linkscount; i++) {
			String text = linklist.get(i).getText();
			//System.out.println(i +":"+text);
			if (text.isEmpty()) {
			System.out.println(i + ":" + text);
			
		
			}
			
			
			
	

			// for each
//		int count = 0;
//		for (WebElement e : linklist) {
//			String text = e.getText();
//			if (text.length() > 0) {
//				System.out.println(count + ":" + text);
//			}
//			count++;
//		}
			
			
			

		}
	}
}
