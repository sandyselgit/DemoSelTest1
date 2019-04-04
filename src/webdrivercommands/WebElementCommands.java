package webdrivercommands;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class WebElementCommands {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.toolsqa.com");
		/*driver.findElement(By.id("lst-ib")).sendKeys("google");
		element.sendKeys("sai prabhu");
		driver.findElement(By.name("q")).submit();*/
		
		WebElement element = driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span[1]/span/span"));
		String link = element.getText();
		System.out.println(link);
		
		String tagName = element.getTagName();
		System.out.println(tagName);
		
		String getAtt = element.getAttribute("xpath");
		System.out.println(getAtt);
		
		org.openqa.selenium.Dimension dim = element.getSize();
		System.out.println("Height :"+dim.height+"  Width :"+dim.width);
		
		Point pnt = element.getLocation();
		System.out.println("X co-ordinate is : "+pnt.x+"Y co-ordinate is : "+pnt.y);
		
		
		
		/*driver.findElement(By.id("UserName")).sendKeys("google");*/
		
		/*System.out.println(element);*/
		
		/*driver.close();*/
		
		
		
		

	}

}
