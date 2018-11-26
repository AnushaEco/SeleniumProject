 package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p19 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/sel2.html");
WebElement element = driver.findElement(By.id("demo"));	
Actions A = new Actions(driver);
A.doubleClick(element).perform();

	}

}
