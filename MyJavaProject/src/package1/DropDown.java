package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		WebElement dropdown=driver.findElement(By.id("continents"));
		Select object=new Select(dropdown);
		
		//object.selectByVisibleText("Africa");
		object.selectByIndex(4);				//Index value starts from 0
		
		//Print all the options for the selected drop down and select one option of your choice
		
		List<WebElement> objectList= object.getOptions();			// Get the size of the Select element
		int iListSize = objectList.size();

		for(int i =0; i < iListSize ; i++)							// Setting up the loop to print all the options
		{									
			String sValue = ((Select) objectList).getOptions().get(i).getText();	// Storing the value of the option	

			System.out.println(sValue);									// Printing the stored value

			if(sValue.equals("Africa"))
			{
				object.selectByIndex(i);	// Putting a check on each option that if any of the option is equal to 'Africa" then select it 

				break;
				}
			}	    
		driver.quit();
		}
}

		



