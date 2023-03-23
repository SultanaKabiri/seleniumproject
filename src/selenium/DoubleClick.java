package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	public static void main(String[] args) {
		/*
		  How to handle the double click on application?: Answer --> Via Actions class with .doubleClick(); method
		  
		  iframe: right container --> iframeResult
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to application
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.manage().window().maximize();
		
		// to navigate to frame --> switchTo().frame("iframeResult"); 
		driver.switchTo().frame("iframeResult"); 
		
		// field1
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();// clear the field1 data
		field1.sendKeys("Rainbow"); 
		
		// Copy Text
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		// Import Action class
		Actions action = new Actions(driver);
		action.doubleClick(button).perform(); 
		
		
		driver.close();
	}


}
