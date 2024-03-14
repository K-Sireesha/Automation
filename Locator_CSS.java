package mar14Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CSS 
{
	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().minimize();
		dr.get("https://www.facebook.com");
		WebElement uname=dr.findElement(By.cssSelector("input#email"));//TN#id
		uname.sendKeys("sireesha12.k@gmail.com");
		WebElement pass=dr.findElement(By.cssSelector("input#pass"));
		pass.sendKeys("sireesha");
		WebElement btn=dr.findElement(By.cssSelector("button[name=login]"));//TN[AN=AV]
		btn.sendKeys(Keys.ENTER);
		dr.manage().window().maximize();
		dr.switchTo().newWindow(WindowType.TAB);
		dr.get("https://www.google.com");
		WebElement text=dr.findElement(By.cssSelector("textarea.gLFyf[id=APjFqb]"));//TN.CN[AN=AV]
		text.sendKeys("India");
		text.sendKeys(Keys.ENTER);
		

	}

}
