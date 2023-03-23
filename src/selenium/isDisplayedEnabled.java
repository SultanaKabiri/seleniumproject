package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedEnabled {
	
	public static void main(String[] args) {
		// isDisplayed(); isEnabled() --> return boolean true | true

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.name("q")); // return a WebElement

		System.out.println("Displayed search status: " + search.isDisplayed()); // true
		System.out.println("Enabled search status: " + search.isEnabled()); // true

		// close the single window
		driver.close();

	}


}
