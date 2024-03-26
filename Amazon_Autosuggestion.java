package mar18findElements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement search=dr.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> shoelist=dr.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		shoelist.get(9).click();
}
}