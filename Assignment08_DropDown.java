package mar14Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment08_DropDown 
{
	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/dropdown/");
		dr.findElement(By.xpath("(//div[@id='chat-bot-message-close'])"));
		WebElement choice1=dr.findElement(By.cssSelector("select#form-field-Demo"));
		Select s1=new Select(choice1);
		s1.selectByVisibleText("Demo2");
		WebElement choice9=dr.findElement(By.cssSelector("select#form-field-field_4abb599"));
		Select s2=new Select(choice9);
		s2.selectByValue("SQL5");
		WebElement choice6=dr.findElement(By.cssSelector("select#form-field-field_76043cf"));
		Select s3=new Select(choice6);
		s3.selectByIndex(10);
		
		WebElement choice8=dr.findElement(By.xpath("(//select[@id='form-field-field_bcb42c0'])"));
		Select s4=new Select(choice8);
		s4.selectByVisibleText("QTP10");
		WebElement choice4=dr.findElement(By.xpath("(//select[@id='form-field-field_062587e'])"));
		Select s5=new Select(choice4);
		s5.selectByVisibleText("Energy4");
		

	}

}
