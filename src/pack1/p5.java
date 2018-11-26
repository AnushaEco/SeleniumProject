package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.Facebook.com/");
            WebElement username = driver.findElement(By.id("email"));

        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginbutton = driver.findElement(By.id("loginbutton"));
        username.sendKeys("anusha");
        password.sendKeys("asdmsk");
        loginbutton.click();
	}

}
