package mar18findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment10_AmazonKeysFunctionality {

	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement search=dr.findElement(By.id("searchDropdownBox"));
		search.click();
		for(int i=0;i<4;i++)
		{
		search.sendKeys(Keys.ARROW_DOWN);
		}
	}

}
