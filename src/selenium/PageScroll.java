package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageScroll {
	
	public static void main(String[] args) {
		// Writing a test case to scroll in a page with the help Actions class
		
		System.setProperty("webdriver.driver.chrome", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// navigate to formy-project to scroll the page
		driver.get("https://formy-project.herokuapp.com/scroll");
		
		// Full Name element
		WebElement fullName = driver.findElement(By.id("name"));
		
		// Actions is a class
		Actions action = new Actions (driver); 
		
		// .moveToElement(); 
		action.moveToElement(fullName); 
		
		// pass some full name
		fullName.sendKeys("TEK Dojo"); 
		
		// date 
		WebElement date = driver.findElement(By.id("date"));
		date.sendKeys("02/07/2023");
		
		driver.close();

	}

}
