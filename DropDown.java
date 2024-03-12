package mar12Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement drop=dr.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(drop);
        s1.selectByValue("search-alias=stripbooks");
        Thread.sleep(1000);
        s1.selectByVisibleText("Amazon Devices");
        Thread.sleep(1000);
        s1.selectByIndex(20);
        WebElement text=dr.findElement(By.xpath("(//input[@placeholder='Search Amazon.in'])"));
        text.sendKeys("India");
        text.sendKeys(Keys.ENTER);
	}
}
