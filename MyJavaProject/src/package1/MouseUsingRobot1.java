package package1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;



public class MouseUsingRobot1 {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.stqatools.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		

		// Create object of Robot class
		Robot robot = new Robot();

		// Press Left button
		robot.mousePress(InputEvent.BUTTON1_MASK);

		// Release Left button
		robot.mouseRelease(InputEvent.BUTTON1_MASK);

		// Press Middle button
		robot.mousePress(InputEvent.BUTTON2_MASK);

		// Release Middle button
		robot.mouseRelease(InputEvent.BUTTON2_MASK);

		// Press Right button
		robot.mousePress(InputEvent.BUTTON3_MASK);

		// Release Right button
		robot.mouseRelease(InputEvent.BUTTON3_MASK);
		
		// Scroll MouseWheel
		robot.mouseWheel(5);
		


		System.out.println("Hello");

	}
}
