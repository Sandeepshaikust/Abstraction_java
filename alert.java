package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import utils.openChromeBrowser;

public class alert {

	
static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
				  
				openChromeBrowser ob = new openChromeBrowser();
				
				driver = ob.openChrome();
				
				driver.get("file://C:/Users/Administrator//Downloads//alerts.html");
				//driver.findElement(By.id("btnConfirm")).click();
				
				//driver.switchTo().alert().accept();
				
				
				//driver.findElement(By.("button"));
				driver.findElement(By.id("btnPrompt")).click();
				//Thread.sleep(5000);
		        driver.switchTo().alert().sendKeys("Automation");
				//driver.findElement(By.id("btnPrompt")).getText();
				//String text=driver.switchTo().alert().getText();
				//System.out.println(text);
				driver.switchTo().alert().accept();
				String txt1=driver.findElement(By.id("output")).getText();
				System.out.println(txt1);
				
				
				
				
				
				//driver.findElement(By.id("btnConfirm")).click();
				//driver.switchTo().alert().dismiss();
				
				

				//Wait for the alert to be displayed and store it in a variable
				//Alert alert = wait.until(ExpectedConditions.alertIsPresent());

				//Store the alert text in a variable
				//String text = alert.getText();

				//Press the OK button
				//alert.accept();
		// TODO Auto-generated method stub*/

	//}

		}
}
