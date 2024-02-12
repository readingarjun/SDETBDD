/*


package StepsDefintion;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepsDefinitions
{
	
	 
	public static WebDriver driver;
	LoginPageFactory Login;
	
	@Given("User is on login page")
	public void user_is_on_login_page()
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
	    
	
	}

	

	@When("User Enter valid {string}  and {string}")
	public void user_enter_valid_and(String UserName, String Password)throws InterruptedException 
	{
		driver.findElement(By.id("user-name")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);	
	
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("User Navigates to home page")
	public void user_navigates_to_home_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User navigated to home page");
	
	}

	@And("Close the browser")
	public void close_the_browser()
	{
	  driver.close();
	
	}


	
	
}
*/