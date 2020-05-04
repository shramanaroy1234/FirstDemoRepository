package mypackage;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import org.testng.annotations.Test;

public class TestNGAsserts {


	private static WebDriver driver;

  @Test

  public void method1() {

	  driver = new ChromeDriver();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://www.store.demoqa.com");

      // Here driver will try to find out My Account link on the application

      WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));

      //Test will only continue, if the below statement is true

      //This is to check whether the link is displayed or not

      Assert.assertTrue(myAccount.isDisplayed());

      //My Account will be clicked only if the above condition is true

      myAccount.click();
  }
     
    @Test
    public void method2()
    {
      
	  String sValue = "Shramana Roy";

	  System.out.println(" What is your full name");

	  //Assert.assertEquals("Lakshay Sharma", sValue);
	  Assert.assertEquals("Roy", sValue,"String didn't match");

	  System.out.println(sValue);
    }

	 @Test
	 public void softAssert()
	 {
		 String methodName="softAssert";
		 SoftAssert softassert= new SoftAssert();
		 
	     softassert.assertTrue(true == true);
	     softassert.assertEquals("SoftAssert", "SoftAssertion");
	     softassert.assertEquals(methodName, "SoftAssertion");
	     System.out.println("Last statement gets executed!");
	     softassert.assertAll();
	 
	 }


  }

