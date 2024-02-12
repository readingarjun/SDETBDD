package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
	WebDriver driver;

	By txt_UserName = By.id("user-name");
	By txt_Password = By.id("password");
	By button_LoginButton = By.id("login-button");
	By text_Logo = By.xpath("//div[@class='app_logo']");

	
	public LoginPagePOM(WebDriver driver) {
		this.driver = driver;

	}

	public void EnterUserName(String UserName) {
		driver.findElement(txt_UserName).sendKeys(UserName);

	}

	public void EnterPassword(String Password) {
		driver.findElement(txt_Password).sendKeys(Password);

	}

	public void LoginButton() {
		driver.findElement(button_LoginButton).click();

	}

	public void USERLOGIN(String UserName, String Password) {
		driver.findElement(txt_UserName).sendKeys(UserName);
		driver.findElement(txt_Password).sendKeys(Password);
		driver.findElement(button_LoginButton).click();

	}

	public void VERIFYLOGO() {
		driver.findElement(text_Logo).isDisplayed();
	}

}
