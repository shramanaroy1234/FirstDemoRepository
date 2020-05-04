////This grouping is inside more than one Test Classes//

package loanpackage;  
import org.testng.annotations.Test;  
public class Personal_Loan  
{  
 @Test(groups= {"SmokeTest"})  
 public void WebLoginPersonalLoan()  
 {  
     System.out.println("Web Login Personal Loan");  
 }  
 @Test  
 public void MobileLoginPersonalLoan()  
 {  
     System.out.println("Mobile Login Personal Loan");  
 }  
 @Test  
 public void APILoginPersonalLoan()  
 {  
     System.out.println("API Login Personal Loan");  
 }  
}  
