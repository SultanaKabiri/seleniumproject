package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) throws InterruptedException {
		/*
		   File Upload: --> .sendKeys(); 
		   
		   0 < Positive amount of time --> implicit wait 
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		//file-upload-field
		WebElement fileUpload = driver.findElement(By.id("file-upload-field")); 
		fileUpload.sendKeys("dont_quit.jpg"); 
		
		// wait to see the action
		Thread.sleep(2000);
		
		// Reset the file path
		WebElement reset = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-reset']")); 
		reset.click();
		
		driver.close();

	}



}
