package mypackage;  
import org.testng.annotations.Test;  
public class TestNGMetaGroups   
{  
 @Test(groups= {"Smoke"})  
 public void test1()  
 {  
     System.out.println("This is test1");  
 }  
 @Test(groups= {"Regression"})  
 public void test2()  
 {  
     System.out.println("This is test2");  
 }  
 @Test  
 public void test3()  
 {  
     System.out.println("This is test3");  
 }}  
