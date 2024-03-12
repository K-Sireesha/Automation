package mar12Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Webelements_Components 
{
	public static void main(String[] args) 
	{	
		ChromeDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///C:/Users/User/OneDrive/Desktop/Automation%20Course/learningHTML1.html");
      //WebElement w=d.findElement(By.name("lname"));
        WebElement w=d.findElement(By.xpath("(//input[@id='121'])"));
		boolean b=w.isDisplayed();
		boolean b1=w.isSelected();
		boolean b2=w.isEnabled();
		System.out.println(b+"."+b1+"."+b2);//checking Your Last name is enabled
		
		WebElement z=d.findElement(By.xpath("(//input[@type='radio'])"));
		boolean z1=z.isDisplayed();
		boolean z2=z.isSelected();
		boolean z3=z.isEnabled();
		System.out.println(z1+"."+z2+"."+z3);
		
		/*
		WebElement c=d.findElement(By.name("name1"));
        boolean a1=c.isDisplayed();
        boolean a2=c.isEnabled();
        boolean a3=c.isSelected();
        System.out.println(a1+"."+a2+"."+a3);
      //WebElement c1=d.findElement(By.xpath("(//input[@value='baby'])"));
        WebElement c1=d.findElement(By.xpath("(//label[@for='vehicle2'])"));
        boolean d1=c1.isDisplayed();
        boolean d2=c1.isEnabled();
        boolean d3=c1.isSelected();
        System.out.println(d1+"."+d2+"."+d3);*/
        
	}

}
