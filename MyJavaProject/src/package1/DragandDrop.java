package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class DragandDrop
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
		
		action.dragAndDrop(source,destination).build().perform();
		//action.dragAndDropBy(source,10,7).perform();// Don't know why not working
		
		//verify text changed in to 'Drop here' box 
		String text= destination.getText();

		if(text.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	
		driver.close();

		
		
				}
}

		



