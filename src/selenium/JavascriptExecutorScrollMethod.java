package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorScrollMethod {
	
	public static void main(String[] args) {
		// JavascriptExecutor we want to scroll to the application 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		// interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tekdojo.us/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		// Scroll 
		js.executeScript("window.scrollBy (0, 800)"); 
		
		driver.close();

	}

}
