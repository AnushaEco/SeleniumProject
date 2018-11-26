package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P14 {
	static 
	{
	System.setProperty("webdriver.gecko.driver", "./driver/Geckodriver.exe");
	}
	public static void main(String[] args) throws Throwable {
		 WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.seleniumhq.org/download/");
		//driver.findElement(By.xpath("(//a[text()='Download'])[2]")).click();
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ALT);
		//r.keyPress(KeyEvent.VK_S);
		//r.keyRelease(KeyEvent.VK_ALT);
		//r.keyRelease(KeyEvent.VK_S);
		//r.keyPress(KeyEvent.VK_ENTER);
		}
		
		

	}


