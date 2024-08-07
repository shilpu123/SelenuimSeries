package selenuimsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		// selectProductLevel4Handling("Beverages","Tea","Tea Bags");
		By L1Cat = By.xpath(
				"//button[@id='headlessui-menu-button-:R5bab6:']//span[@class='Label-sc-15v1nk5-0 CategoryMenu___StyledLabel-sc-d3svbp-1 gJxZPQ gYxTYh'][normalize-space()='Shop by']");
		selectProductLevel4Handling(L1Cat, "Snacks & Branded Foods", "Indian Mithai", "Fresh Sweets");

	}

	public static void selectProductLevel4Handling(By l1locator, String l2, String l3, String l4)
			throws InterruptedException {
		WebElement shopParentEle = driver.findElement(l1locator);

		Actions act = new Actions(driver);
		act.click(shopParentEle).build().perform();
		Thread.sleep(2000);

		WebElement L2Ele = driver.findElement(By.linkText(l2));
		act.moveToElement(L2Ele).build().perform();
		Thread.sleep(2000);

		WebElement L3Ele = driver.findElement(By.linkText(l3));
		act.moveToElement(L3Ele).build().perform();
		Thread.sleep(2000);

		WebElement L4Ele = driver.findElement(By.linkText(l4));
		L4Ele.click();

	}
}