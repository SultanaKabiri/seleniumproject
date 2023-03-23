package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample1 {
	
	public static void main(String[] args) {
		/*
		  A web table is a way of representing the data in a rows and columns. It is part of the html DOM. 
		  Web table has different html tags that need to be undestand for the automation. 
		  
		  <table> : it defines a table --> starting point for a table   </table>
		  <tbody> : it includes all the data of the table including the th, tr, & td 
		  <th> : it defines the header cell, which means it also defines the heading/ columns inside the web table
		  <tr> : it modifies a row in a table
		  <td> : it is part of a cell. It also give us the actual definition of the record or value
		  
		  1. Static table --> data not change on reloading --> rows & columns
		  2. Dynamic table  --> the data dynamically change on reloading --> example airline tickets: price is keep changing 
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize(); 
		
		/*
		 
		     2nd row:    //*[@id='customers']/tbody/tr[2]/td[1]
		  	 3rd row:    //*[@id='customers']/tbody/tr[3]/td[1]
		  	 4th row:    //*[@id='customers']/tbody/tr[4]/td[1]
		  */
		
		// size 
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println("HTML Table: " +rows.size() + " rows are available!");
		
		String startXpath = "//*[@id='customers']/tbody/tr["; 
		String endXpath = "]/td[1]";
		
		System.out.println("\n************************");
		for (int i=2; i <=rows.size(); i++) {
			//Concatenation strings with index
			String actualXapth = startXpath + i + endXpath; 
			WebElement value = driver.findElement(By.xpath(actualXapth)); 
			System.out.println("Company: " +value.getText());
		}
		
		System.out.println("\n************************");
		// Contacts   --> end xpath   /td[2]
		
		String contactXpath = "]/td[2]"; 
		
		for (int i=2; i <= rows.size(); i++) {
			//Concatenation strings with index
			String contacts = startXpath + i + contactXpath; 
			WebElement contact = driver.findElement(By.xpath(contacts)); 
			System.out.println("Contact: " +contact.getText());
		}
		
		
		System.out.println("\n************************");
		// Company   --> end xpath   /td[3]
		
		String countryXpath = "]/td[3]"; 
		
		for (int i=2; i <= rows.size(); i++) {
			//Concatenation strings with index
			String countries = startXpath + i + countryXpath; 
			WebElement country = driver.findElement(By.xpath(countries)); 
			System.out.println("Country: " +country.getText());
		}
		
		System.out.println("\n*************************");
		// Header/columns -->    //*[@id='customers']/tbody/tr[1]/th[ index ]
		
		List <WebElement> columns= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")); 
		System.out.println("Column Sizes: " + columns.size());
		
		
		String cStart = "//*[@id='customers']/tbody/tr[1]/th[";
		String cEnd = "]"; 
		for(int i =1; i <= columns.size(); i++) {
			WebElement column = driver.findElement(By.xpath(cStart + i + cEnd)); 
			System.out.println("Column: " + column.getText());
		} 
		
		driver.quit();

	}


}
