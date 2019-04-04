package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	
		
		
		public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			
		
			driver.get("http://192.168.43.240:8080/docs/api/overview-summary.html");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle().length());
	}
}
