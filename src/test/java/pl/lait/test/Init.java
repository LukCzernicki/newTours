package pl.lait.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Init {
	
	static WebDriver driver = null;
	
	public static WebDriver getDriver() {
		if (driver ==null) {
			System.out.println(" -- wewn getDriver null ");
			System.setProperty("webdriver.chrome.driver", "/Users/Aleksandra.geo/Desktop/Tester Oprogramowania/chromedriver.exe"); 
			System.out.println("Odpalamy Driver");
			//driver = new ChromeDriver();
			URL remoteAddress = null;
			try {
				remoteAddress = new URL("http://localhost:4444/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();		
			driver = new RemoteWebDriver(remoteAddress, capabilities);
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			driver.get("http://newtours.demoaut.com/");
			return driver;
	}
			else {
			return driver;
		}
	}
}
