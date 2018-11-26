package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		}

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
List<WebElement> li = driver.findElements(By.xpath("//div[contains(text(),'From')]"));
  System.out.println(li.size());
  driver.close();
	}

}
