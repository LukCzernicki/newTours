package pl.lait.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		          
        System.setProperty("webdriver.chrome.driver", "/Users/Aleksandra.geo/Desktop/Tester Oprogramowania/chromedriver.exe"); 
        System.out.println("Odpalamy Driver");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
       
		
		return driver;
	}
}
