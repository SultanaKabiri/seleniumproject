package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Navigate to that location address
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		// image 
		// id locator  --> passed
		// WebElement image = driver.findElement(By.id("image")); 
		
		// class locator --> failed 
		//WebElement image = driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle")); 
		
		// CSS Selector --> passed
		//WebElement image = driver.findElement(By.cssSelector("div[id='image']"));

		// xpath locator
		WebElement image = driver.findElement(By.xpath("//div[@id='image']"));
		
		// box
		WebElement box = driver.findElement(By.id("box"));
		
		// Actions class
		Actions action = new Actions (driver); 
		
		// .dragAndDrop();   |    .build();    | .perform(); 
		action.dragAndDrop(image, box).build().perform(); 
		
		driver.close();

	}


}
