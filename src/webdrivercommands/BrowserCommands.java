package webdrivercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	
	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver\\chromedriver.exe");*/
		WebDriver chdriver = new ChromeDriver();
		
		chdriver.get("http://www.google.com/");
		System.out.println(chdriver.getCurrentUrl());
		System.out.println(chdriver.getTitle());
		System.out.println(chdriver.getTitle().length());
		
		/*System.out.println(chdriver.getPageSource());*/
		
		chdriver.close();
		

	}

}
