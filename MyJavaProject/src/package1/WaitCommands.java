//Still needs a lots of practice

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class WaitCommands {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		driver.get("http://demo.guru99.com/test/guru99home/" );	// Launch Chrome and redirect it to the Base URL
		driver.manage().window().maximize() ;	//Maximizes the browser window
		aTitle = driver.getTitle();			//Get the actual value of the title
		if (aTitle.equals(eTitle))					//Compare the actual title with the expected title
		{
			System.out.println( "Test Passed") ;
		}
		else 
		{
			System.out.println( "Test Failed" );
		}
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS) ;

			
			driver.close();						//Close browser
		}
		}

	

