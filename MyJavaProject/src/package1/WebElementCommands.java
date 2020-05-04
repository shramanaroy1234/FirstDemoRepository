package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class WebElementCommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
        WebElement textbox=driver.findElement(By.id("fname"));
        textbox.sendKeys("Shramana Roy");
        //textbox.clear();//
       //String text=textbox.getText();//
      // System.out.println("The text typed in the text box is :" + text);  //Not working
       System.out.println("The text typed in the text box is :" + textbox.getAttribute("value"));
       
       System.out.println("The tagname of the textbox is :" +textbox.getTagName());
        
       System.out.println("The cSSValue of the textbox is :" + textbox.getCssValue("font-size"));
       
       System.out.println("The size of the textbox is :" + textbox.getSize());
       
       System.out.println("The location of the textbox is :" + textbox.getLocation());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

       
       
        
        
        
        

	}

}
