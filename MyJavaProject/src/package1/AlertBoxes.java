package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class AlertBoxes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.testandquiz.com/selenium/testing.html");
		//driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.get("http://demo.guru99.com/test/delete_customer.php");		//
		
		//Different Types of Alerts
		//1. Simple Alert
		
		driver.manage().window().maximize();	
///		driver.findElement(By.linkText("Generate Alert Box")).click();
		//driver.findElement(By.xpath("//*[@id='content']/p[4]/button")).click();
		
		//Not working
		//Alert simpleAlert = driver.switchTo().alert();
		//String alertText = simpleAlert.getText();
		//System.out.println("Alert text is " + alertText);
		//simpleAlert.accept();
		driver.findElement(By.name("submit")).click();
		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        //alert.accept();	
        
        //Dismissing alert
        alert.dismiss();


	}

}
