package mar12Locators;
//Handling javascript pop ups
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Popup
{
	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.get("file:///C:/Users/User/OneDrive/Desktop/Automation%20Course/learningHTML1.html");
		dr.switchTo().alert().accept();
		dr.manage().window().maximize();
		WebElement link1= dr.findElement(By.tagName("input"));
		link1.click();
		link1.sendKeys("Siri");
		link1.sendKeys(Keys.ENTER);
	}

}
