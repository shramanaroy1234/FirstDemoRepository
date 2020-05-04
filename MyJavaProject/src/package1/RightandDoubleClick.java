
package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class RightandDoubleClick
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		System.out.println("demoqa webpage displayed");

		driver.manage().window().maximize();
		   Actions actions = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));

			 
		   //Right Click the button to display Context Menu&nbsp;
		   actions.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
			
			
			//Double Click the button 
		   WebElement btnElement1 = driver.findElement(By.id("doubleClickBtn")); 

			actions.doubleClick(btnElement1).perform(); 
			
			System.out.println("Button is double clicked"); 
			
			driver.switchTo().alert().accept();
			//driver.close();
			

				
		
				}
}

		




