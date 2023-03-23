package selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	static WebDriver driver; 
	// main method 
	public static void main(String[] args) throws IOException {
		//
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 driver = new ChromeDriver();
		
		// browsing the url 
		driver.get("https://www.tekdojo.us/");
		driver.manage().window().maximize();
		
		// call the take screenshot method 
		takeScreenshot("tekdojo");
		
		driver.close();
	}
	
	// Creating a method to take screenshot
	public static void takeScreenshot (String fileName) throws IOException {
		 
		// take screenshot and store it as file format --> .jpg | .png
		// TakesScreenshot is an interface --> api driver 
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		// copy the screenshot to desired location
		Files.copy(file, new File ("/Users/azadani/eclipse-workspace/RainbowAutomation/src/screenshots/" + fileName +".jpg"));
		
	 }
	


}
