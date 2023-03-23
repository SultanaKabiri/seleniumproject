package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
	
	public static void main(String[] args) {
		// file upload --> .sendKeys(); 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to choose file to upload a file 
		driver.get("https://omayo.blogspot.com/");
		
		// navigating to project folders
		//String projectPath = System.getProperty("user.dir");
		
		// choose file 
		WebElement chooseFile = driver.findElement(By.id("uploadfile")); 
		chooseFile.sendKeys("/Users/azadani/Desktop/dont_quit.jpg");
		
		//chooseFile.sendKeys(projectPath + "dont_quit.jpg"); 
		
		System.out.println("Successfully uploaded a file in the applicaiton");
		
		//driver.close();

	}

}
