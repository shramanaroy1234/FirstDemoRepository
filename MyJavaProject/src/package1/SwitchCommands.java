//Here checking Tooltip both with Actions Class and without Actions Class//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SwitchCommands
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html"); //configureselenium website
        System.out.println("Webpage opened successfully");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

       // Get all the details of the current window
       String ParentHandle = driver.getWindowHandle();
       System.out.println("Parent Window :"+ParentHandle);
       
       //Click on "Follow on Twitter" button//
       driver.findElement(By.xpath("//a[@class='btn btn-primary followeasy']")).click();
       	
       // Store and Print the name of all the windows open   
       Set<String> AllHandles = driver.getWindowHandles();
       System.out.println("All Windows :"+ AllHandles);
      
    // Pass a window handle to the other window
       for (String handle1 : driver.getWindowHandles()) 
        {
              System.out.println(handle1);
              driver.switchTo().window(handle1);       
       }
       Thread.sleep(1000);
       System.out.println("Child_Title :"+driver.getTitle());

        	}
}

		



