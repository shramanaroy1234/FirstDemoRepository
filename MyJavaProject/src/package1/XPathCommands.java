//This code explains various way of Writing Complex & Dynamic XPath In Selenium Through Various Methods//
//And this is the most important one//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathCommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	WebDriver driver1=new ChromeDriver();
		
		driver.get("https://accounts.lambdatest.com/register");//Lambdatest website
		
		//1.Basic/Relative xPath//
		//Relative xpath for full name field
		// driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Shramana Roy");
        //driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Shramana Roy");
        driver.findElement(By.xpath("//input[@name='name'][@placeholder='Full Name*']")).sendKeys("Shramana Roy");
        System.out.println("Basic Relative xPath Test Passed");
        
       //2.Using ‘OR’ & ‘AND’//
       //In case of OR if any of the attribute value matches, the element will be located
        //Whereas in case of AND both the attribute value should match and met//
        //then only the element will be located.// 

       //Relative xpath for email field
       driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email*']")).sendKeys("shramanaroy7@gmail.com");
       driver.findElement(By.xpath("//input[@type='email' or @id='email']")).sendKeys("shramanaroy7@gmail.com");
       System.out.println("OR & AND Test Passed");

       //3.Using 'Contains'//
       //Relative xpath for Company Name field
       driver.findElement(By.xpath("//input[contains(@placeholder,'Company Name')]")).sendKeys("ALTRAN");
       driver.findElement(By.xpath("//*[contains(@name,'organization_name')]")).sendKeys("ALTRAN");
       System.out.println("Contains Test Passed");
       
       //4.Using 'Starts-with'//
       //driver.findElement(By.xpath("//a[starts-with(text(), 'Sign')]")).click();
       System.out.println("Starts with Test Passed");
       
       //5.Using 'text()'//
       //driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
       //driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
       //System.out.println("text() Test Passed");
       
       //6.Using Index//
       driver.findElement(By.xpath("//div[@class='form-group']/input[1]")).sendKeys("Shramana Roy");
       System.out.println("Index Test Passed");
       
       //7.Using Chained XPath In Selenium//
       driver.findElement(By.xpath("//div[@class='form-group']//input[@name='phone']")).sendKeys("9434085989");
       System.out.println("Chained xPath Test Passed");

       
       //driver.close();
       
       //Trying number 7 with another website//
       //driver1.get("https://www.lambdatest.com/");		
       //driver1.findElement(By.xpath("//ul[@class='navbar-nav']//li[@class='nav-item']")).click();
       
    		   

	}

}
