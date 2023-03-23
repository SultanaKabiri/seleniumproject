package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2CompleteWebForm {
	
	public static void main(String[] args) throws InterruptedException {
		// Complete Web Form -- Assignment 2
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the Formy Project
		driver.get("https://formy-project.herokuapp.com/");
		
		// Maximize the window
		driver.manage().window().maximize();
		
		// Wait time 
		Thread.sleep(2000);
		
		// Click on Complete Web Form
		driver.findElement(By.linkText("Complete Web Form")).click();
		
		// first-name
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstName.sendKeys("Rainbow");
		
		// last-name
		driver.findElement(By.id("last-name")).sendKeys("TEK Dojo"); 
		
		// job-title
		driver.findElement(By.cssSelector("#job-title")).sendKeys("Instructor"); 
		
		// Highest level of education
		driver.findElement(By.xpath("//input[@id='radio-button-3']")).click();
		
		// Gender
		driver.findElement(By.id("checkbox-1")).click();
		
		// years
		driver.findElement(By.cssSelector("option[value='1']")).click();
		
		// datepicker
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.sendKeys("02/20/2023");
		datepicker.sendKeys(Keys.RETURN);
		
		// Wait time 
				Thread.sleep(4000);
		
		// submit 
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
		

	}

}
