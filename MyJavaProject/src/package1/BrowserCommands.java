package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class BrowserCommands 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Successfully opened the google chrome browser");
		
		String title=driver.getTitle();
		System.out.println("The title of the driver is :" +title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("The current url of the browser is :" +currentUrl);
		
		//String pageSource=driver.getPageSource();
		//System.out.println("The page source of the browser is :" +pageSource);
		
		//driver.close();//	
		driver.quit();
		}

}
