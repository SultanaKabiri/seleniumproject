package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
	
	public static void main(String[] args) {
		// Set the properties and create the interface of WebDriver
		// key and value
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		/*
		   .get() is used to navigate to a particular web-site (application) and wait till the page load
		   .navigate() is used to navigate to a particular web-site (application) and it does not wait to load the page
		 */
		driver.get("https://www.google.com/");
		
		driver.get("https://wwww.facebook.com/");
		
		// .navigate().back();  --> chaining methods | more than one dot method
		driver.navigate().back(); // www.google.com
		
		driver.navigate().forward(); // www.facebook.com
		
		driver.navigate().refresh(); // refresh / re-load the current page
		
		System.out.println("Title of application: " +driver.getTitle());
		
		driver.close();
	}


}
