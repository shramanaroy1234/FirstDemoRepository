package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultiSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form");
		
		//WebElement multiSelect=driver.findElement(By.name("selenium_commands"));
		Select object=new Select(driver.findElement(By.name("selenium_commands")));
		
		object.selectByIndex(0);
		Thread.sleep(5000);
		object.deselectByIndex(0);
		
		object.selectByVisibleText("Navigation Commands");
		Thread.sleep(5000);
		object.deselectByVisibleText("Navigation Commands");
		


		
		
		
		
		
		

	}

}
