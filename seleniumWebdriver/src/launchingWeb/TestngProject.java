package launchingWeb;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestngProject {
	@Test
	public void f()
	{
		System.out.println("this is test1");
	}
	@Test
public void f1()
	{
		System.out.println("this is test2");
	}
@Test
public void f2()
{
	System.out.println("this is test3");
	
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("this is before method");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("this is after method");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("this is before class");
}
@AfterClass
public void afterclass()
{
	System.out.println("this is after class");
}
@BeforeTest
public void beforetest()
{

	System.out.println("this is before test");
}
@AfterTest
public void aftertest()
{
	System.out.println("this is after test");
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("this is before suite");
	
}
@AfterSuite
public void aftersuite()
{

	System.out.println("this is after suite");
}
}