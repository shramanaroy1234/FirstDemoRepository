package mypackage;  
  
import org.testng.annotations.Test;  
  
public class TestNGIncludeExclude
{  
 @Test  
 public void method1()  
 {  
     System.out.println("Hi, I am method1");  
 }  
 @Test												//I will disable this test case from xml file//
 public void method2()  
 {  
     System.out.println("Hi, I am method2");  
 }  
 @Test(enabled=false)								//It will not run as it is disabled//
 public void method3()  
 {  
     System.out.println("Hi, I am method3");  
 }
 @Test												// I will run only this method from xml file//
 public void method4()
 {
	 System.out.println("Hi, I am method4");
 }
}
