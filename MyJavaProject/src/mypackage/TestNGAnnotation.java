package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotation {
  @Test
  public void f() 
  {
	  System.out.println("Hi, I am learning TestNG");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Right now I am in BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Right now I am in AfterMethod");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Right now I am in BeforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Right now I am in AfterClass");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Right now I am in BeforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Right now I am in AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Right now I am in BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Right now I am in AfterSuite");
  }

}
