package WebDriver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.openChromeBrowser;

import org.openqa.selenium.WebDriver;

import utils.openChromeBrowser;

public class advantageOnline {
	
	static WebDriver driver;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		
		driver.get("https://advantageonlineshopping.com/#/register");
		
		//id="hrefUserIcon"
				//driver.findElement(By.id("hrefUserIcon")).click();
	boolean isChecked;
  WebElement e;
		

				driver.findElement(By.name("allowOffersPromotion")).click();
				isChecked = driver.findElement(By.tagName("input")).isSelected();
			

	}
	
				
				//driver.close();
					
				
				//(By.id("username")).sendKeys("tomsmith");
		
		

	}


