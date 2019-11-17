package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationTest {
	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();

	}

	@Test
	public void reserveFlight() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("Heniek");
		driver.findElement(By.name("password")).sendKeys("1qa2ws#ed");
		driver.findElement(By.name("login")).click();

		String oneWayRadioXpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]"
				+ "/td/table/tbody/tr/td[2]/table/tbody/tr[5]" 
				+ "/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";

		driver.findElement(By.xpath(oneWayRadioXpath)).click();
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("London");
		
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue("2");
		
		WebElement fromDay = driver.findElement(By.name("fromDay"));
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByValue("20");
		
		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByValue("12");
		
		WebElement toDay = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByValue("24");
		
		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByValue("12");
		
		String firstClass = "/html/body/div/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
				+ "td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
		
		driver.findElement(By.xpath(firstClass)).click();
		
		WebElement airline = driver.findElement(By.name("airline"));
		Select airlineSelect = new Select(airline);
		airlineSelect.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		
		
		
	}

	@After
	public void tearDown() {
		//driver.close();
	}

}
