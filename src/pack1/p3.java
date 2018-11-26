package pack1; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	String title = driver.getTitle();
if (title.equals("Facebook – log in or sign up"))
System.out.println("pass");
  else
System.out.println("fail");
driver.close();

		

	}

}
