//This code explains various Xpath axes methods//
//Need to go through a lots of time//

package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathCommands1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new ChromeDriver();
		
		//driver.get("https://www.lambdatest.com/");
        //driver1.get("https://accounts.lambdatest.com/register");
        driver2.get("https://accounts.lambdatest.com/login");
        
		driver2.manage().window().maximize();
		System.out.println("Webpage opened successfully");
		
		//1.Following//
		//driver.findElement(By.xpath("//*[@type='text']//following::input")).sendKeys("Shramana");
        //driver.findElement(By.xpath("//ul[@class='navbar-nav']//following::li[1]")).click();//Will click on Live
        //System.out.println("Following test passed");
        
        //2.Following-sibling//
		//driver.findElement(By.xpath("//li[@class='nav-item']//following-sibling::li")).click();//Will click on Automation
        //System.out.println("Following-Sibling test passed");
        
        //3.Preceding//
        //driver.findElement(By.xpath("//a[text()='Automation']//preceding::li[1]")).click();//Will click on Live
        //System.out.println("Preceding test passed");
        
        //4.Preceding-Sibling//
        //driver.findElement(By.xpath("//li[@class='nav-item']//preceding-sibling::li[1]")).click();//Will click on Live
        //System.out.println("Preceding sibling test passed");
        
        //5.Child(Checked with another website)//
        //driver1.findElement(By.xpath("//div[@class='form-group']//child::input[1]")).sendKeys("Shramana Roy");;
        System.out.println("Child test passed");
        
        //6.Parent//
        //WebElement parentDiv=driver1.findElement(By.xpath("//input[@name='password']//parent::div"));
        //System.out.print(parentDiv.getAttribute("class"));
        //System.out.println("Parent Test passed");

        //7.Descendant(Checked with another website)//
        //WebElement rememberMe=driver2.findElement(By.xpath("//div[@class='form-group']//descendant::label"));
        //rememberMe.click();
        //System.out.print(rememberMe.getText());
        //System.out.println("Descendant Test Passed");
        
        //Ancestor//
        //Finding the parent div using the password field of the login page.
        WebElement parentDiv=driver2.findElement(By.xpath("//input[@name='password']//ancestor::div[1]"));
        System.out.println(parentDiv.getAttribute("class"));
        System.out.println("Ancestor Test passed");
        
        WebElement parentForm=driver2.findElement(By.xpath("//input[@name='password']//ancestor::form"));
        System.out.println(parentForm.getAttribute("action"));
        System.out.println("Ancestor Test passed");
        
        

		
       
    		   

	}

}
