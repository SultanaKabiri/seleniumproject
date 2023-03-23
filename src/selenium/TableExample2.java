package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample2 {
	
	public static void main(String[] args) {
		// 
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// rows
		int rows = driver.findElements(By.xpath("//*[@id='customers']//tr")).size();//6 
		// columns
		int columns = driver.findElements(By.xpath("//*[@id='customers']//th")).size(); // 3
		
		// nested for loop
		
		//outer loop
		for (int i=1; i<rows; i++) {
			
			// inner loop
			for(int j=1; j<=columns; j++) {
				
				// [ i ] 
				String values = driver.findElement(By.xpath("//*[@id='customers']//tr[" + (i+1) +"]/td[" +j+"]" )).getText(); 
				System.out.println(values);
//				if (values.equals("Germany")) {
//					System.out.println("row number: " + i + "   cell number: " + j); // true 
//					break; 
				//}
				
			}
			
		}
		driver.close();

	}


}
