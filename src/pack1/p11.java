package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p11 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/sel1.html");
WebElement textbox = driver.findElement(By.id("t1"));
boolean c1 = textbox.isEnabled();
System.out.println("c1="+c1);
JavascriptExecutor j1 = (JavascriptExecutor) driver;
j1.executeScript("document.getElementById('t1').value='asdfg'");
boolean c2 = textbox.isEnabled();
System.out.println("c2="+c2);
	}

}
