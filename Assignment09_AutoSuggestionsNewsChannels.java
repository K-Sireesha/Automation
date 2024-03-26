package mar18findElements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment09_AutoSuggestionNewsChannels 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		WebElement text=dr.findElement(By.name("q"));
		text.sendKeys("India News Channels");
		Thread.sleep(5000);
		
		List<WebElement> search=dr.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = search.size();
		System.out.println(count);
		search.get(count-1).click();
	}

}
