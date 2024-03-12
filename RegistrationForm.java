package mar12Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm 
{
	public static void main(String[] args) 
	{
	 ChromeDriver dr=new ChromeDriver();
	 dr.manage().window().maximize();
	 dr.get("https://grotechminds.com/registeration-form/");
	 WebElement fname=dr.findElement(By.name("firstName"));
	 fname.sendKeys("Siri");
	 WebElement lname=dr.findElement(By.name("lastName"));
	 lname.sendKeys("Esha");
	 WebElement email=dr.findElement(By.name("email"));
	 email.sendKeys("siri@gmail.com");
	 WebElement number=dr.findElement(By.name("phone"));
	 number.sendKeys("8766753421");
	 WebElement gender=dr.findElement(By.id("gender"));
	 Select s1=new Select(gender);
	 s1.selectByVisibleText("Female");
	 WebElement state=dr.findElement(By.id("state"));
	 Select s2=new Select(state);
	 s2.selectByVisibleText("Karnataka");
	 WebElement proof=dr.findElement(By.id("aadhaar"));
	 proof.sendKeys("635309876542");
	 WebElement proof1=dr.findElement(By.id("pan"));
	 proof1.sendKeys("ABCGD7462E");
	 WebElement term=dr.findElement(By.id("terms"));
	 term.click();
	 WebElement submit=dr.findElement(By.xpath("(//input[@value='Register'])"));
	 //submit.click();
	}
}
