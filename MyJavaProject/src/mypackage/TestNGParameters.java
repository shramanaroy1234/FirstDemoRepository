package mypackage;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;  

public class TestNGParameters 
{
	
	@Test
	@Parameters("browser")
	public void parameterizedTest(String browser){
		if(browser.equals("firefox")){
			System.out.println("Open Firefox Driver");
		}else if(browser.equals("chrome")){
			System.out.println("Open Chrome Driver");
		}
	}	
	
}