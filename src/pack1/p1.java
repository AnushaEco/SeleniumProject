package pack1;

import java.awt.Robot; 
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
                 Robot r = new Robot();
                 r.keyPress(KeyEvent.VK_SHIFT);
                 r.keyRelease(KeyEvent.VK_SHIFT);
	}

}
