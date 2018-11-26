package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p10 
{
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement copyr=driver.findElement(By.xpath("//span[contains(text(),' Facebook © 2018')]"));
int y=copyr.getLocation().getY();
		int x=copyr.getLocation().getX();
		System.out.println(y);
		System.out.println(x);
JavascriptExecutor j1 = (JavascriptExecutor) driver;
j1.executeScript("window.scrollBy("+x+","+y+")");
	}

}
