package mypackage;

import org.testng.annotations.Test;

public class TestNGTimeout 
{
	
//Example of Timeout Test at Suite Level//
//And only this part will be there in xml file//
    @Test
    public void timeTestOne() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Time test method one");
    }
 
    @Test
    public void timeTestTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Time test method two");
    }

//Example of Timeout Test at Method Level//

    @Test(timeOut=100)  
    public void testcase1() throws InterruptedException  
    {  
    	Thread.sleep(200);  
    	System.out.println("This is testcase1");  
    	}  
    @Test    
    public void testcase2()  
    {  
    		System.out.println("This is testcase2");  
     }  
    @Test  
    public void testcase3()  
    {  
    	System.out.println("This is testcase3");  
    }  

      
    }

