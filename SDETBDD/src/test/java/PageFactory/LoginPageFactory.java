package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	@FindBy(id = "user-name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_Password;

	@FindBy(id = "login-button")
	WebElement button_LoginButton;

	public void EnterUserName(String UserName) {
		txt_username.sendKeys(UserName);

	}

	public void EnterPassword(String Password) {
		txt_Password.sendKeys(Password);
	}

	public void LoginButton() {
		button_LoginButton.click();

	}

	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}



