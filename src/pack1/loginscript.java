package pack1;

import org.openqa.selenium.chrome.ChromeDriver;

import Pom.LoginActiTIme;

public class loginscript {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=CEC3B96A82ADEE0EEEC74894C9AFBFA4");
		LoginActiTIme ob = new LoginActiTIme(driver);
		//ob.username.sendKeys("admin");
		//ob.password.sendKeys("manager");
		//ob.login.click();
		ob.setusername("admin");
		ob.setpassword("manager");
ob.clicklogin();



	}

}
