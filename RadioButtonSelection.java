package mar12Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButtonSelection 
{
	public static void main(String[] args) 
	{
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://grotechminds.com/registration/");
		WebElement radio=dr.findElement(By.xpath("(//input[@class='Female form-check-input'])"));
        radio.click();
        if(radio.isSelected()==true)
        {
        	System.out.println("Selected radio button is Female");
        }
        else
        {
        	System.out.println("Selected radio button is Male");
        }
	}

}
