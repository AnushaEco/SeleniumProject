package pack1;
// to rightclick using the action operator and opening the page in new window

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p18 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
driver.get("https://demo.actitime.com");
WebElement element = driver.findElement(By.xpath("//a[text()='actiTIME Inc.']"));
Actions A = new Actions(driver);
A.contextClick(element).perform();
Robot r = new Robot();
r.keyPress(KeyEvent.VK_W);
r.keyRelease(KeyEvent.VK_W);
	}
	

}
