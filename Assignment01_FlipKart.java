package mar05browserlaunch;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment01_FlipKart 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		String a[]=null;
		a= title.split(" ");	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}
}
