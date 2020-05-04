//Not working don't know why//

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

public class KeyboardUsingRobot {				
    		
    public static void main(String[] args) throws InterruptedException, AWTException,IOException
    {									
		
        String baseUrl = "https://demoqa.com/keyboard-events/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        System.out.println("Webpage opened successfully");
        //maximize browser
      	driver.manage().window().maximize();
      	Thread.sleep(2000);
      		
      	// This will click on Browse button
      	WebElement browsebutton= driver.findElement(By.id("browseFile"));		
      	//click  Browse button 
      	//browsebutton.sendKeys(Keys.ENTER);// Not working 
      	browsebutton.click();
      		
      	//Create object of Robot class
      	Robot robot = new Robot();
      	
      	//Code to Enter D1.txt 
      	robot.keyPress(KeyEvent.VK_SHIFT);				//Press Shify key
      	robot.keyPress(KeyEvent.VK_D);				//Press d ,it gets typed as upper case D as Shift key is pressed
      	robot.keyRelease(KeyEvent.VK_SHIFT);		//Release SHIFT key to release upper case effect
      	robot.keyPress(KeyEvent.VK_1);
      	robot.keyPress(KeyEvent.VK_PERIOD);
      	robot.keyPress(KeyEvent.VK_T);
      	robot.keyPress(KeyEvent.VK_X);
      	robot.keyPress(KeyEvent.VK_T);
      		
      	robot.keyPress(KeyEvent.VK_ENTER);  //Press ENTER to close the popup
      	//Wait for 5 sec
        Thread.sleep(5000);
      	//This is just a verification part, accept alert
        browsebutton = driver.findElement(By.id("uploadButton"));
      	browsebutton.click();				 
      		
      	WebDriverWait wait = new WebDriverWait(driver, 10);		 
      	Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());	       	 
      	//Accept the Alert		 
      	myAlert.accept();
      	System.out.println("File uploaded successfully");
    }
    }		
