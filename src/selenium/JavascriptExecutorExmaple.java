package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExmaple {
	
	public static void main(String[] args) {
		/*
		  JavascriptExecutor is an interface that helps to execute the elements if we want to get a better intractable with elements
		  
		  --> read the title 
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/modal");
		
		// modal button 
		WebElement modalButton = driver.findElement(By.id("modal-button")); 
		modalButton.click();
		
		// close button --> arguments[0]
		WebElement closeButton = driver.findElement(By.id("close-button"));
		//closeButton.click();
		
		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		// Pre-made methods for JavascriptExecutor 
		js.executeScript("arguments[0].click();", closeButton);
		
		//System.out.println("title: " + driver.getTitle());
		
		// JavascriptExecutor Methods
		// How to read the title? 
		// document.title = Formy
		String title = (String) js.executeScript("return document.title;");
		//System.out.println("Title via JavascriptExecutor: " +title);
		
		driver.close();
	}

}
