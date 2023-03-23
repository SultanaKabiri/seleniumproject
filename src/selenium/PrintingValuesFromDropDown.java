package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintingValuesFromDropDown {
	
	public static void main(String[] args) {
		// Handling drop down
		
		System.setProperty("webdriver.chorome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		// Navigate to the application 
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		//countries
		WebElement countries = driver.findElement(By.cssSelector("select[id='input-country']")); 
		
		Select country = new Select(countries); 
		
		//List WebElement
		List <WebElement> allOption = country.getOptions();
		System.out.println("Number of countries: " +allOption.size());
		
		// for each loop
//		for (WebElement option : allOption) {
//			
//			//.getText(); --> display values
//			System.out.println("Country: " + option.getText());
//		}
		
		
		
		// try catch --> Exception 
		
		try {
			
			// for loop
			for (int i =0; i <= allOption.size(); i++) {
				System.out.println("Country: " + allOption.get(i).getText());
			}
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		// click on a country --> India
		for(WebElement option : allOption) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}
		
		driver.close();

	}


}
