package mar20Wait;
import java.time.Duration;

import org.openqa.selenium.By;
//Chrome Browser
import org.openqa.selenium.chrome.ChromeDriver;
public class implicitWait 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.findElement(By.id("email")).sendKeys("kalle.sireesha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sireesha");
		driver.findElement(By.name("login")).click();
	}
}
