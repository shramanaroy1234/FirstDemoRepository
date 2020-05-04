//Here checking Tooltip both with Actions Class and without Actions Class//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class IFrames
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
        driver.get("http://demo.guru99.com/test/guru99home/");
        System.out.println("Webpage opened successfully");
        driver.manage().window().maximize();
        
        //Counting the number of iFrames present//
        int size = driver.findElements(By.tagName("iframe")).size();
        //System.out.println("The total number of iFrames are:" + size);
        
		//By executing a java script
		JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("Number of iframes on the page are " + numberOfFrames);
		
		//By finding all the web elements using iframe tag
		List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are " + iframeElements.size());

        
        //Switching to iFrames//
		//By index/number, By id,and By webelement
        //driver.switchTo().frame(0);		//With the help of iFrame number
        driver.switchTo().frame("a077aa5e"); //With the help of iFrame id
        //driver.switchTo().frame("iframe1");

        System.out.println("Switched to first iFrame successfully");
        
 		driver.findElement(By.xpath("html/body/a/img")).click(); //Clicks the iframe
 		System.out.println("Clicked first iFrame successfully");

		//Switch back to the main window
		//driver.switchTo().defaultContent();
	    driver.switchTo().parentFrame();

 		System.out.println("Came back to main window successfully");

        
	}
}

		



