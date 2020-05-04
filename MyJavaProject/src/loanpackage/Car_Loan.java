////This grouping is inside more than one Test Classes//

package loanpackage;
import org.testng.annotations.Test;  
public class Car_Loan
{  
@Test  
public void WebLoginCarLoan()  
{  
System.out.println("Web Login Home Loan");  
}  
@Test  
public void MobileLoginCarLoan()  
{  
System.out.println("Mobile Login Home Loan");  
}  
@Test(groups= {"SmokeTest"})  
public void APILoginCarLoan()  
{  
System.out.println("API Login Home Loan");  
}  
}  
