package package1;
import java.io.IOException;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;		

public class FileCommands {				
    		
    public static void main(String[] args) 
    {									
		
        String baseUrl = "http://demo.guru99.com/test/upload/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        //driver.get(baseUrl);
        System.out.println("Webpage opened successfully");
        
        //File Upload
        //WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        //Enter the file path onto the file-selection input field
        //uploadElement.sendKeys("E:\\New Text Document.txt");

        //Check the "I accept the terms of service" check box
        //driver.findElement(By.id("terms")).click();

        //Click the "UploadFile" button
        //driver.findElement(By.name("send")).click();
        //System.out.println("File uploaded successfully");
        
        //File Download
        String baseUrl1 = "http://demo.guru99.com/test/yahoo.html";
        driver1.get(baseUrl1);
        System.out.println("Webpage opened successfully");
        
        WebElement downloadButton = driver1.findElement(By.id("messenger-download"));
        String sourceLocation = downloadButton.getAttribute("href");
        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

        try 
        {
        	Process exec = Runtime.getRuntime().exec(wget_command);
        	int exitVal = exec.waitFor();
        	System.out.println("Exit value: " + exitVal);
        } 
        catch (InterruptedException | IOException ex) 
        {
        	System.out.println(ex.toString());
        }
        System.out.println("File downloaded successfully");
    }


    }		
