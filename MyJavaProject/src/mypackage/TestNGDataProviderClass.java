//Here TestNG @DataProvider and @Test in the different classes//

package mypackage;
import org.testng.annotations.DataProvider;
 
public class TestNGDataProviderClass
{
    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() 
    {
        return new Object[][] { { "data one" }, { "data two" } };
    }
}