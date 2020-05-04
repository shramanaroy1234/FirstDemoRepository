package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class KeyboardEvents 
{
	public static void main(String[] args) throws InterruptedException {
		 
	 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String baseUrl = "http://www.facebook.com/"; 

		 driver.get(baseUrl);
		 WebElement txtUsername = driver.findElement(By.id("email"));

		 Actions builder = new Actions(driver);
		 Action seriesOfActions = builder
		 	.moveToElement(txtUsername)
		 	.click()
		 	.keyDown(txtUsername, Keys.SHIFT)
		 	.sendKeys(txtUsername, "hello")
		 	.keyUp(txtUsername, Keys.SHIFT)
		 	.doubleClick(txtUsername)
		 	.contextClick()
		 	.build();
		 	
		 seriesOfActions.perform() ;

	    
}
}
