package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialText {
	
	public static void main(String[] args) {
		// linkText and partialLinkText locators
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to that location address
		//driver.get("https://tekdojo.us/");
		
		// linkText
//		WebElement apply = driver.findElement(By.linkText("APPLY")); 
//		apply.click();
		
		
		driver.get("https://www.facebook.com/");
		// linkText
//		WebElement signUp = driver.findElement(By.linkText("Sign Up"));
//		signUp.click();
		
		// partialLinkText   | avoid 
		WebElement partialText = driver.findElement(By.partialLinkText("Up")); 
		partialText.click();
		
		driver.quit();
		

	}


}
