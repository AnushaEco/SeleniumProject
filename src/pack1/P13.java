package pack1;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
	static 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) throws Throwable {
		Date d= new Date();
		String time = d.toString();
		String[] a = time.split(" ");
		String t1 = a[3];
		String[] t2 = t1.split(":");
		String sec = t2[2];
		System.out.println(a[4]);
		System.out.println(time);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		TakesScreenshot T= (TakesScreenshot)driver;
		File source = T.getScreenshotAs(OutputType.FILE);
		File dest = new File("./photo/PHOTO"+sec+".png");
		FileUtils.copyFile(source, dest);
	}

}
