package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A 
{
@BeforeSuite
public void beforesuite()
{
	System.out.println("before suite");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("after suite");
}
@BeforeTest
public void beforetest()
{
	System.out.println("before test");
}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("before class");
}
@AfterClass
public void afterclass()
{
System.out.println("after class");	
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("before method");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("after method");
}
@Test()
public void method1()
{
	//System.out.println("method1");
	Assert.assertFalse(true);
	Reporter.log("method1", true);
}
@Test(dependsOnMethods= {"method1"})
public void method2()
{
	//System.out.println("method2");
	Reporter.log("method2", true);
}
@Test(groups= {"adhoc"})
public void method3()
{
	//System.out.println("method3");
	Reporter.log("method3", false);
}
}

