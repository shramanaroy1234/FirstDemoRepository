//This code is both for Include/Exclude groups and Groups with Regular Expressions//

package mypackage;  
import org.testng.annotations.Test;  
public class TestNGIncludeExcludeGroups   
{  
@Test(groups= {"Include Group"})  
public void method1()   
{  
System.out.println("This is method1");  
}  

@Test(groups= {"Include Group"})  
public void method2()   
{  
System.out.println("This is method2");  
}  

@Test(groups= {"Exclude Group"})  
public void method3()   
{  
System.out.println("This is method3");  
}  

@Test(groups= {"Unknown Group"})
public void method4()
{
	System.out.println("This is method4");
}
@Test(groups= {"This is another Group"})			//This method i will run with Regular Expression with group//
public void method5()
{
	System.out.println("This is method 5");
}
}