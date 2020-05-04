package loanpackage;  
import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;  
public class Vegetables   
{  
@Test  
@Parameters("Cauliflower")  
public void c(String c)  
{  
System.out.println("The first vegetable is :" +c);  

}  
@Test  
@Parameters("Ladyfinger")  
public void orange(String l)  
{  
System.out.println("The second vegetable is :" +l);  
}  
}  
