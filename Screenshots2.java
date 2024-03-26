package mar23Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots2 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Shoes");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		TakesScreenshot ts=driver;//step 1
		File source= ts.getScreenshotAs(OutputType.FILE);//step 2
	    File destination= new File("C:\\Users\\User\\OneDrive\\Desktop\\Automation Course\\Selenium\\Screenshot\\program"+driver.getClass()+".png");//step 3
		//File destination= new File("C:\\Users\\User\\OneDrive\\Desktop\\Automation Course\\Selenium\\Screenshot\\program"+new Screenshots2().getClass()+".png");//step 3 object class
		//FileHandler.copy(source,destination);//step 4
		FileUtils.copyFile(source, destination);
		
	}

}
