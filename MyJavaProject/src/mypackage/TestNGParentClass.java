//Here I will create dependency between the methods of two classes having parent-child relationship using groups//

package mypackage;

import org.testng.annotations.Test;

public class TestNGParentClass 
{
  @Test(groups= {"group1"}, dependsOnGroups= {"group2"})
  public void method1() 
  {
	  System.out.println("Right now I am in method1");
  }
  @Test(groups= {"group2"})
  public void method2() 
  {
	  System.out.println("Right now I am in method2");
  }
  
}

class TestNGChildClass extends TestNGParentClass
{
	@Test(groups= {"group3"}, dependsOnGroups= {"group1"})
	public void method3() 
	{
	  System.out.println("Right now I am in method3 of child class");
	}
	@Test
	  public void method4() 
	  {
		  System.out.println("Right now I am in method4 of child class");
	  }
}