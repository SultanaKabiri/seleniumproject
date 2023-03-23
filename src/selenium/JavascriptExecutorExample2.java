package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorExample2 {
	
	public static void main(String[] args) {
		// already made Methods 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		// interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		// read the title 
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		
		// Google : String 
		String title = (String)jse.executeScript("return document.title;"); 
		System.out.println("Title: " + title);
		
		// Selenium methods 
		System.out.println("Selenium Method: Title: " +driver.getTitle());
		
		// How to throw some alert 
		
		jse.executeScript("alert('Hello World, this is my first Alert pop up on Google page')");
		
		driver.close();

	}

}
