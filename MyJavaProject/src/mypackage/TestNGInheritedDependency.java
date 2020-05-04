package mypackage;

import org.testng.annotations.Test;

public class TestNGInheritedDependency 
{
	@Test(dependsOnMethods = { "testTwo" })
    public void testOne() {
        System.out.println("Test method one");
    }
 
    @Test
    public void testTwo() 
    {
        System.out.println("Test method two");
    }
}
 
class ChildClass extends TestNGInheritedDependency 

{
    @Test(dependsOnMethods = { "testOne" })
    public void testThree() {
        System.out.println("Test three method in Inherited test");
    }
 
    @Test
    public void testFour() {
        System.out.println("Test four method in Inherited test");
    }
}
