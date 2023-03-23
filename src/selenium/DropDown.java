package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		/*
		  How to handle drop-down? 
		 */

		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// Navigate to Formy Project
		driver.get("https://formy-project.herokuapp.com/");
		
		//Drop-down Link
		WebElement dropDown = driver.findElement(By.linkText("Dropdown"));
		dropDown.click();
		
		// wait
		Thread.sleep(1000);
		
		//Drop-down menu
		WebElement dropDownButton = driver.findElement(By.cssSelector("button[id='dropdownMenuButton']"));
		dropDownButton.click();
		
		//autocomplete
//		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
//		autocomplete.click();
		
//		// Radio Buttons
//		WebElement radioButtons = driver.findElement(By.linkText("Radio Button"));
//		radioButtons.click();
		
		// Complete Web Form
//		WebElement completeWebForm = driver.findElement(By.partialLinkText("Web")); 
//		completeWebForm.click();
		
		// Switch Window
		WebElement switchWindow = driver.findElement(By.linkText("Switch Window"));
		switchWindow.click();
		
		// Navigation methods
//		driver.navigate().back(); 
//		driver.navigate().back(); 
		
		driver.close();
	}


}
