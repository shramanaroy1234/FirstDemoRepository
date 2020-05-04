package package1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;
//import java.util.concurrent.TimeUnit;

public class CheckBoxes
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRAMANA\\Desktop\\Self Learning\\Selenium\\Drivers for selenium Project\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//

			driver.get("https://www.testandquiz.com/selenium/testing.html");		//JavaTPoint sample website
			
			//Finding check boxes with className as there is no id//
			List<WebElement> check_boxes=driver.findElements(By.className("Automation"));
			
			boolean enable=false;
			enable=check_boxes.get(0).isEnabled(); 
			System.out.println(enable);
			
			boolean display=false;
			enable=check_boxes.get(0).isDisplayed(); 
			System.out.println(display);
			
			
			//First we will check whether the checkbox is already selected
			/*boolean status=false;
			status=check_boxes.get(0).isSelected(); //Selecting with id, Whether the first check box is already selected
			if(status==true)
			{
				check_boxes.get(1).click();
				System.out.println("The second radio button is selected as first one is already selected");
			}
			else
			{
				check_boxes.get(0).click();
			}*/
			
			//Selecting check box with Value//
			/*String sValue = check_boxes.get(0).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("Automation"))
			{
				check_boxes.get(0).click();

			}
			else
			{
				check_boxes.get(1).click();

			}*/
			
			//Finding radio button with cssSelector
			List<WebElement>check_boxes_list=driver.findElements(By.cssSelector("input.Automation"));
			
			//First we will check whether the button is already selected
			boolean state=false;
			state=check_boxes_list.get(0).isSelected(); //Selecting with id, Whether the first radio button is already selected
			
			if(state==true)
			{
				check_boxes_list.get(1).click();
				System.out.println("The second radio button is selected as first one is already selected");
			}
			else
			{
				check_boxes_list.get(0).click();
			}

		}
}