package mypackage;
import org.testng.annotations.Test;  
  
public class TestNGRegExpression   
{  
@Test  
    public void employeeid()  
 {  
     System.out.println("EmployeeID");  
 }  
 @Test  
 public void employee_name()  
 {  
     System.out.println("Employee Name");  
 }  
 @Test  
 public void employee_address()  
 {  
     System.out.println("Employee Address");  
 }  
 @Test  												//I will run only this method from xml file//
 public void owner_name()  
 {  
     System.out.println("Owner Name");  
 }  
}  

