package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewTab {
	
	public static void main(String[] args) {
		// Switch to active window: new tab
		
		System.setProperty("webdriver.driver.chrome", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// navigate to formy-project to switch window
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		// new-tab-button
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		
		// .switchTo();
		// .getWindowHandle (); 
		String originalWindow = driver.getWindowHandle(); 
		
		
		for(String  handle1 :  driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		driver.switchTo().window(originalWindow);
		
		driver.quit();

	}

}
