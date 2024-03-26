package mar15HoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovering 
{
	public static void main(String[] args)
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com");
		WebElement fashion=dr.findElement(By.xpath("//span[.='Fashion'][1]"));
		Actions a1=new Actions(dr);
		a1.moveToElement(fashion).perform();
		WebElement Tshirt=dr.findElement(By.linkText("Men's T-Shirts"));
		Tshirt.click();
	}
}
