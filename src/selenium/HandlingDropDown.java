package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	
	public static void main(String[] args) {
		/*
		  Handling the drop down with Select Class
		 */
		
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// Navigate to the application 
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		// Opening the list of Countries
		WebElement countries = driver.findElement(By.id("input-country"));
		
		// Select Class  --> import and pass the argument element 
		Select country = new Select (countries); 
		
		// Select methods
		// to select by passing visible text name of the country
		//country.selectByVisibleText("Mongolia"); 
		
		// to select by value method option
		//country.selectByValue("1");
		
		// index integer
		country.selectByIndex(15);
		
		

	}


}
