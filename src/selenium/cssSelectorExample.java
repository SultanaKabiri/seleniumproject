package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelectorExample {
	
	public static void main(String[] args) {
		// CSS Selector Example 
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		//WebDriver driver = new ChromeDriver();
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		
		// email
		WebElement email = driver.findElement(By.cssSelector("input[id='email']")); 
		email.sendKeys("test@tekdojo.us");
		
		// password
		WebElement password = driver.findElement(By.cssSelector("input[name='pass']")); 
		password.sendKeys("TEKDojo@1234"); 
		
		driver.close();

	}

}
