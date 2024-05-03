package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenChromeBrowser {
	
WebDriver driver;
	
	public WebDriver openChrome() {
	System.setProperty("webdriver.chrome.driver","C:\\test\\Redbus\\chromedriver-win64.exe");
	////C:\test\Redbus\chromedriver-win64
	ChromeOptions options = new ChromeOptions();
    options.setBrowserVersion("124");
    driver = new ChromeDriver(options);
    return driver;
    
	}

}
