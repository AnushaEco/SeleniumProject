package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFacebook {
	@FindBy(id="email")
	public WebElement username;
	@FindBy(id="pass")
	public WebElement password;
	@FindBy(id="loginbutton")
	public WebElement login;
	public LoginFacebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
