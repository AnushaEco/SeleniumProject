package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://drive.google.com/drive/u/0/folders/1XbTqcM-lgXr7Qnspm6yYCpq_L-kSYQrP");
		WebElement element = driver.findElement(By.id("demo"));	
		Actions A = new Actions(driver);
		A.doubleClick(element).perform();

	}

}
 