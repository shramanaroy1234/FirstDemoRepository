package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//System.out.println("Successfully opened the google chrome browser");
		
		//String appUrl = "http://www.DemoQA.com";
		//driver.get(appUrl);
		
		//driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        driver.findElement(By.linkText("This is a link")).click();  


		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
		driver.close();
		
	

	}
}
