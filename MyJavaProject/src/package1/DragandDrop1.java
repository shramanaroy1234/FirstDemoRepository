package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DragandDrop1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/\";\r\n");
		
		driver.manage().window().maximize();	//Advisable to perform before drag and drop
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//First, get x and y offset for source object
		int xOffset1 = source.getLocation().getX();
		int yOffset1 = source.getLocation().getY();
		System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);

		//Now, get x and y offset for destination object
		int xOffset =destination.getLocation().getX();
		int yOffset =destination.getLocation().getY();
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
		xOffset =(xOffset-xOffset1)+10;
		yOffset=(yOffset-yOffset1)+20;
		

		//Perform dragAndDropBy 
		action.dragAndDropBy(source, xOffset,yOffset).perform();

		//verify text changed in to 'Drop here' box 
		//Get text value of 'destination' element
		String textTo = destination.getText(); 

		if(textTo.equals("Dropped!")) 
		{
			System.out.println("PASS: Source is dropped at location as expected");
		}
		else 
		{
			System.out.println("FAIL: Source couldn't be dropped at location as expected");
		}

		
				
		
		
				}
}

		



