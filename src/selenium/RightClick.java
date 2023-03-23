package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
	public static void main(String[] args) {
		/*
		  How to handle the right click?  | Answer: Via Actions class with contextClick(); method & use the perform(); method
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		// right click
		WebElement rightClick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
		
		// Import Actions class
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		
		driver.close();

	}

}
