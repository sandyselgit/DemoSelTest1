package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	
		
		
		public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
		
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle().length());
	}
}
