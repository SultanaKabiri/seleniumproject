package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	
	public static void main(String[] args) throws InterruptedException   {
		// Creating automation test case to automate the check box
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		//check box 1
		WebElement checkBox1 = driver.findElement(By.id("checkbox-1"));
		checkBox1.click();
		
		//check box 2
				WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
				checkBox2.click();
		
		// check box 3 
		// cssSelector 
		WebElement checkBox3 = driver.findElement(By.cssSelector("input[id='checkbox-3']"));
		checkBox3.click();
		
		// wait 
		Thread.sleep(4000);
		
		// de-select/un-check  
		checkBox1.click();
		//checkBox2.click();
		checkBox3.click(); 
		
		driver.close();

	}


}
