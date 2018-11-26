package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p8 
{
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 
				 WebElement username = driver.findElement(By.id("email"));
	        WebElement password = driver.findElement(By.id("pass"));
		int h1=username.getSize().getHeight();
		int w1=username.getSize().getWidth();
		int h2=password.getSize().getHeight();
		int w2=password.getSize().getWidth();
		if((h1==h2)&&(w1==w2))
			System.out.println("Same dimension");
		else
			System.out.println("Different dimension");
		
		
		
	}

}
