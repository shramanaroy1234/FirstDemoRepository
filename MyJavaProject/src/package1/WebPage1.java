package package1;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class WebPage1
{
	public static void main(String[] args) throws InterruptedException {
	 
	 //Set system properties for geckodriver This is required since Selenium 3.0
	 //System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
     
    //Launch Google
    driver.get("http://www.google.com");
                 
    //Maximize the webpage//
    driver.manage().window().maximize();
    System.out.println("Webpage maximized successfully");
    
    //Minimize the webpage//
    //There is no explicit method like maximize to minimize//
    Thread.sleep(7000);		//It will wait for 7 seconds before minimizing from maximized//
    driver.manage().window().setPosition(new Point(0, -2000));
    System.out.println("Webpage minimized successfully");
    
    //Resize the browser//
    //int width = 600;
    //int height = 400;
    //Dimension dimension = new Dimension(width, height);
    //driver.manage().window().setSize(dimension);
    
}
}