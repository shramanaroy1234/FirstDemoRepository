package mypackage;

import org.testng.annotations.Test;

public class TestNGDependency {

/* Even if APIStudentLogin()should execute first according to the alphabetical order, MobileStudentLogin() will execute 
 * first followed by WebStudentLogin() as APIStudentLogin is dependent on WebStudentLogin()*/

//Example of Single test method dependency//
@Test(groups= {"group2"}) 
public void WebStudentLogin()  
{  
System.out.println("Student login through web");  
}  
@Test  
public void MobileStudentLogin()  
{  
System.out.println("Student login through mobile");  
}  
@Test(dependsOnMethods= {"WebStudentLogin"})  
public void APIStudentLogin()  
{  
System.out.println("Student login through API");  
}  

/*Another example of multiple test methods dependencies*/

@Test(dependsOnMethods= {"Testcase3","Testcase2"})  
public void Testcase1()  
{  
    System.out.println("This is Test case1");  
}  
@Test  
public void Testcase2()  
{  
    System.out.println("This is Test case2");  
}  
@Test  
public void Testcase3()  
{  
    System.out.println("This is Test case3");  
}

//Example of dependency on groups//
//Only this part I will put in testng.xml file// 

@Test(dependsOnGroups = { "test-group" })
public void groupTestOne() 
{
    System.out.println("Group Test method one");
}

@Test(groups = { "test-group" })
public void groupTestTwo() 
{
    System.out.println("Group test method two");
}

@Test(groups = { "test-group" })
public void groupTestThree() 
{
    System.out.println("Group Test method three");
}
}