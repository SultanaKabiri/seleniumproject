package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	
	public static void main(String[] args) {
		/*
		  waits: 1. implicit waits --> amount of time  greater than the zero  0 < amount of the time 
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://facebook.com/");
		driver.navigate().back();
		
		// Maximize window 
		driver.manage().window().maximize();
		
		// Minimize window
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		//search bar
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("facebook"); 
		
		search.sendKeys(Keys.ENTER); 
		
		// click on facebook link 
		driver.findElement(By.xpath("//h3[normalize-space()='Facebook - log in or sign up']")).click();
		
		
		

	}

}
