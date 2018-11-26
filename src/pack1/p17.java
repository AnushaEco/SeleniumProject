package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p17 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com");
	WebElement element = driver.findElement(By.xpath("//li[@id='menu-item-381']"));
		Actions A = new Actions(driver);
		A.moveToElement(element).perform();
		
	}

}
