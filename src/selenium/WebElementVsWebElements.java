package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVsWebElements {
	
	public static void main(String[] args) {
		// WebElement: returning a single element of the application
		// WebElements: return all the elements of the application in a list 
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// elements of the facebook application
		
		driver.get("https://www.facebook.com/");
		
		// .findElement
		// Email 
		WebElement email = driver.findElement(By.id("email"));// single element
		// type my user-name/email address
		email.sendKeys("test@tekdojo.us");
		
		// password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test@1234"); 
		
		// Login
		//WebElement login = driver.findElement(By.id("u_0_5_65"));
		
		// wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//login.click();
		
		//.findElements
		List <WebElement> links =   driver.findElements(By.xpath("//div[@id='pageFooter']//a")); // Return the list of elements size of 42 elements
		// size of all elements in the footer page of facebook 
		System.out.println("Number of WebElements: " +links.size());
		System.out.println("Index 35: " +links.get(35));
		
		// display the links (print the name of links)
		
		for(WebElement footerLink : links) {
			//.getText (); --> return/display the name value
			System.out.println("Footer WebElement: " +footerLink.getText());
			//System.out.println(footerLink.getAttribute(""));
		}
		
		// .close
		driver.close();
	}


}
