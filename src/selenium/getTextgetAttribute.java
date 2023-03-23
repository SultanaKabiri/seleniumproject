package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextgetAttribute {
	
public static void main(String[] args) {
		
		// getText(); 

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/");
		
		// Email
		WebElement email = driver.findElement(By.id("Email")); 
		// .clear(); 
		email.clear();
		email.sendKeys("admin@yourstore.com");
		// .getAttribute();
		System.out.println("Attribute value: " +email.getAttribute("value"));
		
		// .getText
		// System.out.println("Email Text: " +email.getText());
		
			
		// Password
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
		
		// Login
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		login.click();
		
		// close
		driver.close();

	}



}
