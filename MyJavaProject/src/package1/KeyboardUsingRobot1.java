package package1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;		

public class KeyboardUsingRobot1 {				
    		
    public static void main(String[] args) throws InterruptedException, AWTException,IOException
    {									
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");

        System.out.println("Webpage opened successfully");
        //maximize browser
      	driver.manage().window().maximize();
      	Thread.sleep(2000);
      		
      	driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
      	driver.findElement(By.id("pass")).sendKeys("mukesh");
      	
      	Robot r=new Robot();
      	r.keyPress(KeyEvent.VK_ENTER);
      	r.keyRelease(KeyEvent.VK_ENTER);
      	
      	System.out.println("Hello");
    }
    }		
