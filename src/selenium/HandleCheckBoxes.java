package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		/*
		 Handle check boxes
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		// 1. Specifically you select the check box 
		 //driver.findElement(By.id("monday")).click();
		 
		
		// 2. Select all the check boxes 
		List <WebElement> daysCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id, 'day')]"));
		System.out.println("Days of the week - size: " +daysCheckBoxes.size());
		
		// for Loop
//		for(int i =0; i<daysCheckBoxes.size(); i++) {
//			daysCheckBoxes.get(i).click();
//		}
		
		// for each/ advanced loop
//		for(WebElement checkBox : daysCheckBoxes) {
//			checkBox.click();
//		}
		
		//Thread.sleep(4000);
		//un-check
//		for(WebElement checkBox : daysCheckBoxes) {
//			checkBox.click();
//		}
		
		//3. How to select last 2 check boxes? 
		int totalCheckBoxes = daysCheckBoxes.size(); // numbers --> int data type 
		
		// Start from 4th element
//		for(int i = totalCheckBoxes - 3; i < totalCheckBoxes; i++ ) {
//			daysCheckBoxes.get(i).click();
//		}
		
		// 4. How to select the first 2 check boxes? 
//		for(int i = 0; i < totalCheckBoxes; i++) {
//			if (i < 2) {
//				daysCheckBoxes.get(i).click();
//			}
//		}
//		
		// 5. How to select randomly the check boxes?
		
		for(WebElement checkBox : daysCheckBoxes) {
			String day = checkBox.getAttribute("id");
			
			// condition 
			if(day.equals("monday") || day.equals("sunday") || day.equals("tuesday") || day.equals("saturday")) {
				checkBox.click();
			}
		}
		 
	}
}
