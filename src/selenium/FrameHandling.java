package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		/*
		  frame: is used to divide a page into multiple sections with new contents on each sections
		  iframe: is used to embed the content actual / of external application in to the web page 
		  
		  Application: https://www.selenium.dev/selenium/docs/api/java/?overview-summary.html
		  			1st frame: packageListFrame
		  			2nd frame: packageFrame
		  			3rd frame: classFrame
		 */
		

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/?overview-summary.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//1st frame:
		// switch to frame contains list frame --> top right frame
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		
		// default page
		driver.switchTo().defaultContent();
		
		/*
		   2nd frame
		 */
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();
		
		/*
		  3rd frame
		 */
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.
				xpath("//div[@class='topNav']//a[normalize-space()='Index']")).click();
		
		driver.close();

	}


}
