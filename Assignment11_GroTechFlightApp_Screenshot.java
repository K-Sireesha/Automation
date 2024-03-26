package mar23Screenshots;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment11_GroTechFlightApp_Screenshot 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://grotechminds.com/flights/");
		WebElement oneway=dr.findElement(By.xpath("//input[@value='One way']"));
		//oneway.click();
		WebElement roundtrip=dr.findElement(By.xpath("//input[@value='Round trip']"));
		roundtrip.click();
		WebDriverWait wait=new WebDriverWait(dr,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(roundtrip));
		
		WebElement dropFrom=dr.findElement(By.xpath("//select[@name='From']"));
		Select s1=new Select(dropFrom);
		s1.selectByValue("BOM - Mumbai, IN");
		WebElement dropTo=dr.findElement(By.xpath("//select[@name='To']"));
		Select s2=new Select(dropTo);
		s2.selectByIndex(7);
		WebElement depart=dr.findElement(By.xpath("//input[@name='Departon']"));
		depart.sendKeys("03/30/2024");
		WebElement return1=dr.findElement(By.xpath("//input[@name='Returnon']"));
		return1.sendKeys("03/31/2024");
		WebElement Adult=dr.findElement(By.xpath("//select[@name='Adults']"));
		Select s3=new Select(Adult);
		s3.selectByVisibleText("2");
		WebElement Child=dr.findElement(By.xpath("//select[@name='Children']"));
		Select s4=new Select(Child);
		s4.selectByIndex(2);
		WebElement Infant=dr.findElement(By.xpath("//select[@name='Infants']"));
		Select s5=new Select(Infant);
		s5.selectByValue("1");
		Date d1=new Date();
		d1.getTime();
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String time=d2.toString();
		String month=time.substring(4, 7);
		//System.out.println(month);
		String date=time.substring(8, 10);
		//System.out.println(date);
		String year=time.substring(24);
		//System.out.println(year);
		String time1=time.substring(11,19);
		String time2=time1.replaceAll(":","");
		//System.out.println(time2);
		//String filename=(month.concat(date).concat(year).concat(time2));
		String filename=(month.concat("_").concat(date).concat("_").concat(year).concat("_").concat(time2));
		System.out.println(filename);
		TakesScreenshot ts=dr;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\User\\OneDrive\\Desktop\\Automation Course\\Selenium\\Screenshot\\program"+filename+".png");//step 3
		FileUtils.copyFile(source, destination);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//implicitwait
		WebElement Submit=dr.findElement(By.xpath("//input[@value='Search flights']"));
		Submit.click();
		if(roundtrip.isSelected()==true)
		{
			System.out.println("Round Trip is choosen");
		}
		else
		{
			System.out.println("One Way Trip is choosen");
		}
	}
}
