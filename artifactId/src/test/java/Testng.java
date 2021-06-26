import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {

	@BeforeTest
	public void beforeTest()
	{
	System.out.println("BeforeTest");
	}
	@AfterTest
	public void afterTest()
	{
	System.out.println("AfterTest");
	}
	@BeforeGroups
	public void beforeGroups()
	{
	System.out.println("BeforeGroups");
	}
	@AfterGroups
	public void afterGroups()
	{
	System.out.println("AfterGroups");
	}

	@BeforeSuite
	public void beforeSuite()
	{
	System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void afterSuite()
	{
	System.out.println("afterSuite");
	}

	@BeforeClass
	public void beforeClass()
	{
	System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass()
	{
	System.out.println("AfterClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterMethod()
	{
	System.out.println("AfterMethod");
	}
	@Test
	public void testCase1()
	{
	System.out.println("my first test case");
	}
	@Test
	public void testCase2()
	{
	System.out.println("my second test case");
	}
	@Test
	public void testCase3()
	{
	System.out.println("my third test case");
	}
	@Test
	public void testCase4()
	{
	System.out.println("my forth test case");
	}

}
