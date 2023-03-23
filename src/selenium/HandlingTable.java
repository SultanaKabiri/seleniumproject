package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {
	
	public static void main(String[] args) {
		/*
		  
		  //table ---> list all table in application
		    tbody --> body of the table
		    th   --> table header/ column name
		    tr   --> table row
		    td  --> table definition/data/: values/ cell/ field/ tuple/record
		  
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//  Navigate to application for automating table's data 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// rows in a table --> attribute of table, navigate to tbody, & table row (tr)
		List <WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")); // web elements --> store in a list 
		int rowCount = row.size(); // size --> int 
		System.out.println("Total rows: " +rowCount);
		
		// //*[@id='customers']/tbody/tr/td[1]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		//The company name:
		for(int i = 2; i <= rowCount; i++) {
			// concatenation 
			String actualXpath = beforeXpath + i + afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println("Company: " + element.getText());
			
			// conditional statement 
			if(element.getText().equals("Island Trading")) {
				System.out.println("The company name: " +element.getText() + " is at position: " + (i -1));
				break;
			}
		}
		System.out.println("\n ************************ ");
		// Print the contacts 
		// //*[@id='customers']/tbody/tr[2]/td[2]
		String contactXpath = "]/td[2]";
		for(int i = 2; i <= rowCount; i++){
			String actualContacts= beforeXpath + i +contactXpath; 
			WebElement contact = driver.findElement(By.xpath(actualContacts));
			System.out.println("Contact: " +contact.getText());
		}
		
		System.out.println("\n ************************ ");
		// Print the contacts 
		// //*[@id='customers']/tbody/tr[2]/td[3]
		
		String countryXpath = "]/td[3]";
		for(int i = 2; i<=rowCount; i++) {
			String country = beforeXpath + i + countryXpath; 
			WebElement c = driver.findElement(By.xpath(country));
			System.out.println("Country: " +c.getText());
		}

	}


}
