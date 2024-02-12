package StepsDefintion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.LoginPagePOM;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POMLoginDefinitions
{
	
static WebDriver driver;

LoginPagePOM Login;
	
	@Given("User is on login page")
	public void user_is_on_login_page()
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	    
	
	}


	@When("User Enter valid {string}  and {string}")
	public void user_enter_valid_and(String UserName, String Password) throws InterruptedException 
	
	
	{
		Login=new LoginPagePOM(driver);
		Login.EnterUserName(UserName);
		Login.EnterPassword(Password);
	
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		Login.LoginButton();
	   
	}

	
	
	
	@Then("User Navigates to home page")
	public void user_navigates_to_home_page() 
	{
		Login.VERIFYLOGO();
	}

	

	@And("Close the browser")
	public void CloseBrowser()
	{
	  driver.quit();
	
	}



}
 

