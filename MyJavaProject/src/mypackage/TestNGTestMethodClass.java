//Here TestNG @DataProvider and @Test in the different classes//

package mypackage;
import org.testng.annotations.Test;
 
public class TestNGTestMethodClass 
{
    @Test(dataProvider = "data-provider", dataProviderClass = TestNGDataProviderClass.class)
    public void testMethod(String data) 
    {
        System.out.println("Data is: " + data);
    }
}