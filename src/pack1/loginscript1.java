package pack1;

import org.openqa.selenium.chrome.ChromeDriver;

import Pom.LoginFacebook;

public class loginscript1 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		LoginFacebook ob = new LoginFacebook(driver);
		ob.username.sendKeys("anusha");
		ob.password.sendKeys("anusha anand");
		ob.login.click();
	}
}
