package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitsExample {
	
	public static void main(String[] args) {
		/*
		  waits: 1. Explicit waits --> amount of time for a certain condition to be true. 
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// search bar 
		driver.findElement(By.name("q")).sendKeys("facebook" + Keys.ENTER); 
		
		 WebElement result = new WebDriverWait (driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.elementToBeClickable
					(By.xpath("//a/h3")));
		 
		 System.out.println("Application: " +result.getText());
		 
		 driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();
		 
		// display the links (print the name of links) -- footer page of facebook
		 
		 List <WebElement> links =   driver.findElements(By.xpath("//div[@id='pageFooter']//a"));
			
			for(WebElement footerLink : links) {
				//.getText (); --> return/display the name value
				System.out.println("Footer WebElement: " +footerLink.getText());
				//System.out.println(footerLink.getAttribute(""));
			}

	}

}
