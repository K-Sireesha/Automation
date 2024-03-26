package mar15HoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement postman=driver.findElement(By.id("drag7"));
		WebElement centerdroppost=driver.findElement(By.xpath("//div[@id='div2']"));
		act.dragAndDrop(postman, centerdroppost).perform();
		Thread.sleep(500);
		WebElement orgpostdrop=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		act.dragAndDrop(postman, orgpostdrop).perform();
		WebElement json=driver.findElement(By.id("drag11"));
		WebElement centerdrop=driver.findElement(By.xpath("//div[@id='div2']"));
		act.dragAndDrop(json, centerdrop).perform();
		Thread.sleep(500);
		WebElement orgjsondrop=driver.findElement(By.xpath("(//div[@id='div1'])[11]"));
		act.dragAndDrop(json, orgjsondrop).perform();
		Thread.sleep(500);
		}
	}


