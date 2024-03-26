package mar21windowsHandle;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement a1=dr.findElement(By.xpath("//span[.='Google']"));
		a1.click();
		String parentid=dr.getWindowHandle();
		System.out.println(parentid);
		Set<String>  parentchild = dr.getWindowHandles();
		System.out.println(parentchild);
		Thread.sleep(5000);
		dr.quit();
	}

}
