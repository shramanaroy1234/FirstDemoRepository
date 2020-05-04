package loanpackage;  
import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;  
public class Fruits   
{  
@Test  
@Parameters("Mango")  
public void mango(String m)  
{  
System.out.println("The first fruit is:  " +m);
}  
@Test  
@Parameters("Orange")  
public void orange(String o)  
{  
System.out.println("The second fruit is: "+o);  
}  
}  
