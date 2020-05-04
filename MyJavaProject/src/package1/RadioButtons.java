package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
//import java.util.concurrent.TimeUnit;//

public class RadioButtons 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//

			driver.get("https://www.testandquiz.com/selenium/testing.html");		//JavaTPoint sample website
			
			//Finding radio button with id//
			List<WebElement> radio_buttons=driver.findElements(By.id("male"));
			
			boolean enable=false;
			enable=radio_buttons.get(0).isEnabled();
			System.out.println(enable);
			
			boolean display=false;
			enable=radio_buttons.get(0).isDisplayed();
			System.out.println(display);
			
			
			//First we will check whether the button is already selected
			//boolean status=false;
			//status=radio_buttons.get(0).isSelected(); //Selecting with id, Whether the first radio button is already selected
			

			/*if(status==true)
			{
				radio_buttons.get(1).click();
				System.out.println("The second radio button is selected as first one is already selected");
			}
			else
			{
				radio_buttons.get(0).click();
			}*/
			
			//Selecting radio button with Value//
			/*String sValue = radio_buttons.get(0).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("male"))
			{
				 radio_buttons.get(0).click();

			}
			else
			{
				 radio_buttons.get(1).click();

			}*/
			
			//Finding radio button with cssSelector
			List<WebElement> radio_buttons_list=driver.findElements(By.cssSelector("input#male"));
			
			//First we will check whether the button is already selected
			boolean state=false;
			state=radio_buttons_list.get(0).isSelected(); //Selecting with id, Whether the first radio button is already selected
			
			if(state==true)
			{
				radio_buttons_list.get(1).click();
				System.out.println("The second radio button is selected as first one is already selected");
			}
			else
			{
				radio_buttons_list.get(0).click();
			}

			
			
			
			
	}

}
