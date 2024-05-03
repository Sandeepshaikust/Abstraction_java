package SmokeTest;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.OpenChromeBrowser;


public class HomePageCheckTitleandFooterPage {
	
	static WebDriver driver;
	@BeforeClass
		
		public static  void OpenBrowser()
		{
			driver=new ChromeDriver();
			//launch URL
			driver.get("https://www.redbus.com/");
		}
	@Test
	public void checkTitle() {
		
		String expected_Title= "Book Bus Tickets Online with redBus!";
		System.out.println("Expected Tilte is:" + expected_Title);
		String actual_Tilte=driver.getTitle();
		System.out.println(actual_Tilte);
	Assert.assertEquals(actual_Tilte, expected_Title);
	
	}
	@Test
	public void Footerpage() {
		
		//String footer_actual=driver.getTitle();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		String footer_expected="2024 ibibogroup All rights reserved";
		String footer_actual=driver.findElement(By.xpath("//*[@class=\"rdc-ibibo\"]//child::span")).getText();
		
		System.out.println("Exp:" + footer_expected + " actual:" + footer_actual + "**");
		Assert.assertEquals(footer_actual, footer_expected);
	}
	
}
