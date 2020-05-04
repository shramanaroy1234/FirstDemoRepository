package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementCommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.toolsqa.com/automation-practice-form/"); TOOLSQA website
		
		driver.get("https://www.testandquiz.com/selenium/testing.html"); //Javatpoint website
		
		//WebElement firstname=driver.findElement(By.name("firstName"));
		//firstname.sendKeys("Shramana");
		
		//WebElement lastname=driver.findElement(By.id("lastname"));
		//lastname.sendKeys("Roy");
		
	//	WebElement button=driver.findElement(By.id("idOfButton"));		//Javatpoint Website
		//button.click();
		
		//driver.findElement(By.partialLinkText("Partial")).click(); // not working for TOOLSQA
		//System.out.println("Partial link test pass");
		
		//driver.findElement(By.partialLinkText("This is")).click();		//Javatpoint website
		//System.out.println("Partial Link Test Pass");
		
		//driver.findElement(By.linkText("This is a link")).click();		//Javatpoint website
		//System.out.println("Link Test Pass");
		
		//WebElement link=driver.findElement(By.linkText("This is a link")); //This syntax is also correct
		//link.click();
				
		
		//driver.navigate().back();                           //This will bring back to main page
		
		//driver.findElement(By.tagName("input")).sendKeys("Learning Selenium"); //Value will be in the text box

		
		//driver.findElement(By.className("Automation")).click();
		
		//firstname.clear();                                        //This will first clear the previous text i.e Shramana
		//driver.findElement(By.tagName("input")).sendKeys("Learning Selenium");//Value will be in the text box
				
		//Locating by CSSSelector
		
		//driver.findElement(By.cssSelector("input#fname")).sendKeys("Shramana");			// With Tag and ID(First TextBox)
		//driver.findElement(By.cssSelector("input.Automation")).click();             	//With Tag and Classname(Automation Checkbox)
		//driver.findElement(By.cssSelector("input[id=fname]")).sendKeys("Shramana"); 	//With Tag and Attribute(First TextBox)
		//driver.findElement(By.cssSelector("input[id^='fna']")).sendKeys("Roy");
		
		
		
		//Pending is By.xPath
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Learning Selenium");//Value will be in the text box
		//driver.findElement(By.xpath("/html/body/div/div[6]/div/p/button")).click();		//Here it is Absolute xPath
		driver.findElement(By.xpath("//*[@id=\"idOfButton\"]")).click();					//Here it is Relative xPath
		
		System.out.println("Hello");
		
		

	}

}
