package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php");
WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
WebElement selectbox = driver.findElement(By.tagName("input"));
boolean c1 = checkbox.isSelected();
boolean c2 = selectbox.isEnabled();
checkbox.click();
boolean c3 =checkbox.isSelected();
boolean c4 = selectbox.isEnabled();
System.out.println("c1="+c1);
System.out.println("c2="+c2);
System.out.println("c3="+c3);
System.out.println("c4="+c4);

	}

}
