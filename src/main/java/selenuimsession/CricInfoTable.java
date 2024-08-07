package selenuimsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/bangladesh-women-vs-india-women-2024-1429390/bangladesh-women-vs-india-women-5th-t20i-1429397/full-scorecard");
		Thread.sleep(4000);

		String wicket = getWicketTakerName("Shafali Verma");
		System.out.println(wicket);

		wicket = getWicketTakerName("Harmanpreet Kaur");
		System.out.println(wicket);

		List<String> vermascore = getScoreCard("Shafali Verma");
		System.out.println(vermascore);

	}

	// span[text()='Shafali Verma']/ancestor::td//following-sibling::td//span/span
	public static String getWicketTakerName(String batsMenName) {
		return driver
				.findElement(
						By.xpath("//span[text()='" + batsMenName + "']/ancestor::td//following-sibling::td//span/span"))
				.getText();

	}

	// span[text()='Shafali
	// Verma']/ancestor::td/following-sibling::td/following-sibling::td[contains(@class,'ds-text-right')]
	public static List<String> getScoreCard(String playerName) {

		List<WebElement> scoreList = driver.findElements(By.xpath(
				"// span[text()='Shafali Verma']/ancestor::td/following-sibling::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> playerScoreList = new ArrayList<String>();
		for (WebElement e : scoreList) {
			String text = e.getText();
			playerScoreList.add(text);

		}
		return playerScoreList;
	}
}
