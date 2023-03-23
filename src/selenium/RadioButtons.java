package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	
	public static void main(String[] args) {
		// Radio Buttons (circle boxes) 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		// Radio Button 1 
//		WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
//		radioButton1.click();
		
		// Radio Button 2
//		WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
//		radioButton2.click();
		
		// Radio Button 3
		WebElement radioButton3 = driver.findElement(By.xpath("//input[@value='option3']"));
		radioButton3.click();
		
		driver.close();

	}



}
