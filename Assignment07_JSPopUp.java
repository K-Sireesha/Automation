package mar14Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment07_JSPopUp 
{
	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/javascript-popup/");
		dr.findElement(By.xpath("//div[@id='chat-bot-message-close']")).click();
		dr.findElement(By.cssSelector("button.btnjs")).click();
		//dr.findElement(By.cssSelector("button[class=btnjs]")).click();
		dr.switchTo().alert().accept();

	}

}
