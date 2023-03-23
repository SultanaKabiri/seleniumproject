package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// element/ attribute : variable (locater) = value
		
		// .findElement (); 
		WebElement search = driver.findElement(By.name("q")); // WebElement 
		
		// .sendKeys(); -->  Enter something to search / type 
		search.sendKeys("Cheese");
		
		// .submit(); --> press enter
		search.submit();
		
		// .quit(); 
		driver.quit();
	}

}
