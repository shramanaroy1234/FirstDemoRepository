package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;


import java.io.File;

import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	public static void main(String[] args) throws Exception
	{
		String baseUrl ="https://www.facebook.com/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        System.out.println("Webpage opened successfully");
        
        //TakesScreenshot is an interface, So we are type casting it as we can't create object of interface//
        TakesScreenshot ts=(TakesScreenshot)driver;
        
        //Storing as a file format
        File source=ts.getScreenshotAs(OutputType.FILE);
        
        //Now copying the  screenshot to desired location using copyFile //method
        //FileUtils.copyFile(src, new File("C:/selenium/error.png"));

        FileUtils.copyFile(source,new File("./Screenshots/facebook.png"));//It will store in Screenshots folder under my project

        System.out.println("Screenshot captured");

     }
	}        


