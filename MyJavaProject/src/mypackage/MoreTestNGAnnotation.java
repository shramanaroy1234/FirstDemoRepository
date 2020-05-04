package mypackage;

import org.testng.annotations.Test;

public class MoreTestNGAnnotation {
	
/*When all the methods has same priority, then chronological order it will follow*/
  @Test
  public void d_method() 
  {
	  System.out.println("My name is Shramana Roy");
	  
  }
  @Test
  public void b_method() 
  {
	  System.out.println("I live in Bangalore");
	  
  }
  @Test
  public void a_method() 
  {
	  System.out.println("Good morning");
	  
  }
  
/* Checking with priority wise, Less priority, First execution*/
  
  @Test(priority=4) 
  public void method1()
  {
	  System.out.println("I am in method 1");
	  
  }
  @Test(priority=0)
  public void method2() 
  {
	  System.out.println("I am in method 2");
	  
  }
  @Test(priority=8)
  public void method3() 
  {
	  System.out.println("I am in method 3");
	  
  }
  @Test(alwaysRun=true)
  public void method4()
  {
	  System.out.println("I am always running");
	  
  }
}