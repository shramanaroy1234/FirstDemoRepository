//This grouping is inside only one Test Class//

package mypackage;
import org.testng.annotations.Test;

public class TestNGGrouping 
{
	@Test(groups = { "test-group" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }
 
    @Test
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to group.");
    }
 
    @Test(groups = { "test-group" })
    public void testMethodThree() {
        System.out.println("Test method three belonging to group.");
    }
    
    
}
