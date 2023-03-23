package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) {
		/*
		 	Date picker: send the date as of the String values 
		 */
		
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// Navigate to Formy Project
		driver.get("https://formy-project.herokuapp.com/");
		
		// Navigate to Date Picker
		WebElement datePicker = driver.findElement(By.linkText("Datepicker"));
		datePicker.click();
		
		// date field (box)
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("09/25/2020");
		// avoid click on these field
		//dateField.click(); 
		
		// Keys.ENTER
		//dateField.sendKeys(Keys.ENTER);
		
		//Keys.RETURN
		dateField.sendKeys(Keys.RETURN);
		
		driver.close();
	}


}
