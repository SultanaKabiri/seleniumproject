package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	
	public static void main(String[] args) {
		// Handling the list of the drop down
		
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the application
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement countries = driver.findElement(By.name("country_id"));
		
		// ignore
		//System.out.println("List of Countries: " +countries.getSize());
		
		// import Select class --> pass the args to match WebElement Argument
		Select country = new Select(countries);
		
		
		// select by index type
		//country.selectByIndex(15);
		
		// options
		List <WebElement> allOptions= country.getOptions(); // list of country --> countries
		
		//System.out.println(allOptions.size());
		
		// loop
		
		for(WebElement option : allOptions) {
			
			// condition
			if (option.getText().equals("Mexico")) {
				option.click();
				break;
			}
		}

	}

}
