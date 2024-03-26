package mar22Coordinates;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		WebElement signin=dr.findElement(By.id("nav-link-accountList-nav-line-1"));
		signin.click();
		dr.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		dr.navigate().back();
		Thread.sleep(2000);
		dr.navigate().forward();
		Thread.sleep(2000);
		dr.navigate().refresh();
	}
}
