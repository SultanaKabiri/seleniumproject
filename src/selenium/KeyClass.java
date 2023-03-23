package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClass {
	
	public static void main(String[] args) {
		/*
		    Invoke the Keys class to interact with the element whenever you press the Enter
		 */
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		// search bar 
		WebElement search = driver.findElement(By.cssSelector("input[name='q']"));
		search.sendKeys("Selenium"); 
		
		// Keys.ENTER
		//search.sendKeys(Keys.ENTER);
		
		//Keys.RETURN
		search.sendKeys(Keys.RETURN);
		
		// LinkText
		WebElement seleniumLink = driver.findElement(By.xpath("//h3[normalize-space()='Selenium']"));
		seleniumLink.click();
		
		driver.close();
	}

}
