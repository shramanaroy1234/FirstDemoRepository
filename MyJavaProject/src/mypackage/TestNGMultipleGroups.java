package mypackage;  
import org.testng.annotations.Test;  

public class TestNGMultipleGroups 
{  
@Test(groups= {"Group A"})  
public void method1()   
{  
System.out.println("Method1 belonging to Group A");  
}  
@Test(groups= {"Group A","Group B"})  
public void method2()   
{  
System.out.println("Method2 belonging to both Group A and Group B");  
}  
@Test(groups= {"Group B"})  
public void method3()   
{  
System.out.println("Method3 belonging to Group B");  
}  
}  
