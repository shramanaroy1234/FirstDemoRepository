package package1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseUsingRobot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


		String URL = "https://demoqa.com/keyboard-events/";
		// maximize browser
		driver.manage().window().maximize();

		driver.get(URL);
		Thread.sleep(2000);

		// This will click on Browse button
		WebElement webElement = driver.findElement(By.id("browseFile"));
		//webElement.sendKeys("ENTER");
		webElement.click();

		//Create object of Robot class
		Robot robot = new Robot();
         
		//Find x and y coordinates to pass to mouseMove method 
		//1. Get the size of the current window. 
		//2. Dimension class is similar to java Point class which represents a location in a two-dimensional (x, y) coordinate space. 
		//But here Point point = element.getLocation() method can't be used to find the position 
		//as this is Windows Popup and its locator is not identifiable using browser developer tool 
		Dimension i = driver.manage().window().getSize(); 
		System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
		//3. Get the height and width of the screen 
		int x = (i.getWidth()/4)+20; 
		int y = (i.getHeight()/10)+50; 
		//4. Now, adjust the x and y coordinates with reference to the Windows popup size on the screen 
		//e.g. On current screen , Windows popup displays on almost 1/4th of the screen . So with reference to the same, file name x and y position is specified. 
		//Note : Please note that coordinates calculated in this sample i.e. x and y may vary as per the screen resolution settings
		robot.mouseMove(x,y); 

		//Clicks Left mouse button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("Browse button clicked");
		Thread.sleep(2000);

		//Closes the Desktop Windows popup
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Closed the windows popup");
		Thread.sleep(1000);
	}
}
