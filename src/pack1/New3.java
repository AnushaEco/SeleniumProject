package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New3 {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do;jsessionid=CEC3B96A82ADEE0EEEC74894C9AFBFA4");
		WebElement username = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	

}
