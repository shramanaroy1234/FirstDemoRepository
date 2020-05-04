//Here checking Tooltip both with Actions Class and without Actions Class//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ToolTip
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//CASE 1: Using getAttribute, not Action class 
		
		//driver.get("http://demoqa.com/tooltip/");
		//System.out.println("Tooltip web Page Displayed");

		//Maximise browser window 
		//driver.manage().window().maximize();

		// Get element for which we need to find tooltip 
		//WebElement ageTextBox = driver.findElement(By.id("age"));

		//Get title attribute value 
		//String tooltipText = ageTextBox.getAttribute("title"); 
		
		//System.out.println("Retrieved tooltip text as :"+tooltipText); 
		
		
		//CASE 2:- Using Actions class and another website
		driver.get("http://demoqa.com/tooltip-and-double-click/");
		System.out.println("Another webpage for ToolTip Displayed");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver); 
		//Retrieve WebElement 
		WebElement element = driver.findElement(By.id("tooltipDemo")); 
		
		// Use action class to mouse hover 
		actions.moveToElement(element).perform(); 
		
		WebElement toolTip = driver.findElement(By.cssSelector(".tooltiptext")); 
		
		// To get the tool tip text and assert 
		String toolTipText = toolTip.getText();
		System.out.println("toolTipText-->"+toolTipText); 
		
		
		//Verification if tooltip text is matching expected value 
		if(toolTipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){ 
			System.out.println("Pass : Tooltip matching expected value");
			}
		else{ 
			System.out.println("Fail : Tooltip NOT matching expected value"); 
		} 
		

		 

				}
}

		



