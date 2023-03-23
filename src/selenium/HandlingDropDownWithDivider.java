package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownWithDivider {

	
	public static void main(String[] args) {
		/*
		  Drop down with divider which needs to be fixed by developer as the UI is returning 5 elements instead of 4 in DOM
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to automate the Drop down with divider line
		driver.get("http://uitestpractice.com/Students/Select");
		
		// Click on the drop-down
		WebElement countriesDropDown = driver.findElement(By.id("dropdownMenu1")); 
		countriesDropDown.click();
		
		// Store WebElements in a List
		List <WebElement> countries = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		// Size: shows 4 countries in DOM but printing 5 in size
		System.out.println("Number of countries: " +countries.size());
		
		// print all countries
//		for(WebElement country : countries) {
//			System.out.println("Country: " +country.getText());
//		}
		
		// for loop
		
		try {
			for(int i = 0; i<=countries.size(); i++) {
				System.out.println("Country: " +countries.get(i).getText());
			}
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		// click on the country
		for(WebElement country : countries) {
			if(country.getText().equals("China")) {
				country.click();
				break; 
			}
		}
		
		driver.close();
	}
}
