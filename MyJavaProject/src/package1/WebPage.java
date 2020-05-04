package package1;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class WebPage
{
	
	
	public static void main(String[] args) throws InterruptedException {
	 
	 //Set system properties for geckodriver This is required since Selenium 3.0
	 //System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Toolsqa\\lib\\geckodriver.exe");
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
     
    //Launch Google
    driver.get("http://www.google.com");
                 
    //Write the search term - Buddha in search box
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("Shah Rukh Khan");
             
    //Click on searchButton
    WebElement searchButton = driver.findElement(By.name("btnK"));
    searchButton.click();
     
    //Inserting an optional wait of 3 seconds just to notice scroll down event
    Thread.sleep(3000);
     
    //Scroll down the webpage by 2500 pixels
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("scrollBy(0, 2500)"); 
    
    System.out.println("WebPage scrolled successfully");
    
    //I didn't try this part in google page//
    //Waiting till page:2 text is visible
    //WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
      //    (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));
     
    //Verifying that page got scrolled  and "page-2" text is visible now 
    //and more products become visible
    //Assert.assertEquals(pageNumberdisplayer.getText(), "Page: 2");

}
}