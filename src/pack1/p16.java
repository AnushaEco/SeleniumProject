package pack1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p16 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com");
		driver.findElement(By.id("menu-item-381")).click();
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		 WebElement phone = driver.findElement(By.xpath("(//div[@class='col-md-8 col-sm-8 col-xs-8 '])[2]"));
		System.out.println(phone.getText());

}
}
