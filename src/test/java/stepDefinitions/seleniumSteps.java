package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class seleniumSteps {
	
	private WebDriver driver;
	
	@Given("I am on home page")
	public void goToHomePage() {    
		System.out.println(System.getProperty("user.dir"));
    	System.setProperty("webdriver.gecko.driver","/home/local/CONDUCTOR/achiles.luciano/dev/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
    }
	
	@When("I insert User Information")
	public void insertUserInfo() {
		String username = "user@phptravels.com";
		String password = "demouser";
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	
	@Then("I see the welcome message {string}")
	public void iAmLoggedIn(String welcome_msg) {
		WebElement element = driver.findElement(By.xpath("//*[contains(.,.)]"));       
		assertTrue(element.getText().contains(welcome_msg));
        driver.quit();  
	}
}
