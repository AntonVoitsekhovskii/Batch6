import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOfEbay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	}

}
