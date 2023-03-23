package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		// header 
		List <WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th")); 
		System.out.println("Header size: " +headers.size());
		
		// for each loop
		for(WebElement column: headers) {
			System.out.println("Column Name: " +column.getText());
		}
		
		driver.quit();

	}

}
