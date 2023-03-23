package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAlert {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.driver.chrome", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// navigate to formy-project to switch window
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		// alert button
		WebElement alertButton = driver.findElement(By.id("alert-button"));
		alertButton.click();
		
		// switchTo(); 
		// alert(); 
		Alert alert = driver.switchTo().alert(); 
		
		// accepting alert/ pressing ok button
		alert.accept(); 
		
		driver.quit();

	}

}
