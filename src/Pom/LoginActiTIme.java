package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginActiTIme {
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement login;
	public LoginActiTIme(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	
		public void setpassword(String pd)
		{
		this.password.sendKeys(pd);
	}
		public void clicklogin()
	{
		this.login.click();
	}
	
	

}
