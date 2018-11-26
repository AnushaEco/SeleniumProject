 package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class toselectmultipleoptions {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/sel3.html");
		WebElement element = driver.findElement(By.id("hotel"));
		Select s = new Select(element);
s.selectByValue("v");
s.selectByValue("a");
s.selectByIndex(0);
s.selectByVisibleText("abc");

	}

}
