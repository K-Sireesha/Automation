package mar12Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment05_RegisterPage
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver dr=new ChromeDriver();
		//FirefoxDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/registration/");
		dr.findElement(By.xpath("//div[@id='chat-bot-message-close']")).click();
		dr.findElement(By.cssSelector("input#email")).sendKeys("siri@gmail.com");
		dr.findElement(By.cssSelector("input[name=password]")).sendKeys("siri");
		dr.findElement(By.cssSelector("input[value=Female]")).click();
		dr.findElement(By.id("skillsDropdown")).click();
		String skill="technical";
		if(skill=="Technical")
		{
		WebElement skill1=dr.findElement(By.xpath("//ul/li[text()='Technical Skills']"));
		skill1.click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("(//div[@id='tfDropdown'])")).click();
		dr.findElement(By.xpath("(//ul/li[text()='SQL'])")).click();
		}
		else
		{
			WebElement skill1=dr.findElement(By.xpath("//ul/li[text()='Non-Technical Skills']"));
			skill1.click();
			Thread.sleep(1000);
			dr.findElement(By.xpath("(//div[@id='ntfDropdown'])")).click();
			dr.findElement(By.xpath("(//ul/li[text()='Home'])")).click();		
		}
		//dr.findElement(By.xpath("(//div[@id='skillsDropdown'])[2]")).click();
		dr.findElement(By.xpath("(//div[text()='Select Country'])")).click();
		dr.findElement(By.xpath("(//ul/li[text()='Bhutan'])")).click();
		dr.findElement(By.cssSelector("textarea[name=Present-Address]")).sendKeys("Bangalore");
		dr.findElement(By.cssSelector("textarea#Permanent-Address")).sendKeys("Kurnool");
		dr.findElement(By.id("Pincode")).sendKeys("560089");
		dr.findElement(By.xpath("(//div[@id='Country'])")).click();
		dr.findElement(By.xpath("(//ul/li[text()='Atheism'])")).click();
		dr.findElement(By.cssSelector("input#relocate")).click();
		WebElement file = dr.findElement(By.cssSelector("input.file[id=file]"));
		file.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Automation Course\\Interview\\sql chart.jpg");		
	    dr.findElement(By.cssSelector("(//button[@type='submit'])[2]")).click();
	}
}
