package pl.lait.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.lait.test.Init;

public class MainPage {
	
	WebDriver driver;
	public MainPage(WebDriver driver) {
		System.out.println(" -- wewn konstruktora -- ");
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
			
	}
	
	//main page part
	@FindBy(linkText = "SIGN-ON")
	WebElement signOnLink;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerLink;
	
	
	
	//login page part
	@FindBy(name = "userName")
	WebElement loginInput;
	@FindBy(name = "password")
	WebElement passwordInput;
	@FindBy(name = "login")
	WebElement loginBtn;
	
	//find flight page
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[4]/td/table/tbody/tr/td[2]"
			+ "/table/tbody/tr[5]/td/form/table/tbody/tr[2]"
			+ "/td[2]/b/font/input[2]" )
	
	WebElement oneWayRadio;
	@FindBy(name = "passCount")
	public WebElement passCount;
	@FindBy(name = "findFlights")
	public WebElement findFlights;
	

	public void goToReservationPage() {
		findFlights.click();
	}
	
	
	public void goToLoginPage() {
		signOnLink.click();
	}
	public void loginAs(String login, String password) {
		loginInput.sendKeys(login);
		passwordInput.sendKeys(password);
		loginBtn.click();
	}
	
}
