//Here checking Tooltip both with Actions Class and without Actions Class//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class IFrames1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	    
	    driver.switchTo().frame(1); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");

	    }
	    }
	}
		



