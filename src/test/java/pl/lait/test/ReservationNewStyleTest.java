package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {
	
	WebDriver driver;
	MainPage mp;

	@Before
	public void openPage() {
		System.out.println(" -- wewn before -- ");
		driver = Init.getDriver();
		mp = new MainPage(driver);
	}
	@Test
	public void loginTest() {
		System.out.println(" -- wewn logintest -- ");
		mp.goToLoginPage();
		mp.loginAs("Heniek", "1qa2ws#ed");		
	}
	@After
	public void tearDown() {
		Init.end();
	}

	
}
	
		

	
	
	

