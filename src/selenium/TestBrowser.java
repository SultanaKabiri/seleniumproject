package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
	
	public static void main(String[] args) {
		// 1. System Property for web-driver
		// 2. create an object of our WebDriver Interface

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		// To open a web-page --> .get (); --> String URL address
		// .get() --> navigate to the platform and wait until the platform load
		driver.get("https://www.google.com/");

		// .getTitle() : print the application name
		System.out.println("Title of the application: " + driver.getTitle());

		// .getCurrentUrl ();
		System.out.println("URL of application: " + driver.getCurrentUrl());

		// .getClass
		System.out.println("Automation testing: : " + driver.getClass());

		// .getWindowHandle
		System.out.println("Window ID: " + driver.getWindowHandle());

		// .getPageSource();
		// System.out.println(driver.getPageSource())

		// .close ();
		driver.close();

	}

}
