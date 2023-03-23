package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAndMouse {
	
	public static void main(String[] args) {
		// Assignment 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/keypress?");
		
		// Full Name
		WebElement fullName = driver.findElement(By.id("name"));
		fullName.sendKeys("TEK Dojo"); 
		
		// Button
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		// close
		driver.close();

	}

}
