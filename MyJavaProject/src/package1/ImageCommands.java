package package1;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class ImageCommands {				
    		
    public static void main(String[] args) 
    {									
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
//        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        //Click on the "Facebook" logo on the upper left portion	
        //Accessing image link is done using By.cssSelector()
        
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();					
        //Verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		
				driver.close();		

    }		
}
