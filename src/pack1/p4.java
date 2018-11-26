package pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) 
	{

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com");
		 Set<String> awh = driver.getWindowHandles();
		 for(String b:awh)
		 {
			 driver.switchTo().window(b);
			 String title = driver.getTitle();
			 System.out.println(title);
			 if(title.equals("Reliance Industries Limited "))
			 driver.close();
		 }
		
	
	

	}

}
