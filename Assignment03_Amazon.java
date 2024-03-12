package mar07Locators;
//Firefox browser with ID locator
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment03_Amazon 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D676742245123%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5680203939004614045%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062041%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2367553%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//WebElement account=driver.findElement(By.id("createAccountSubmit"));
		WebElement account=driver.findElement(By.linkText("Create your Amazon account"));
		account.click();
		WebElement field =driver.findElement(By.id("ap_customer_name"));
		field.sendKeys("Siri Esha");
		field.sendKeys(Keys.ENTER);
		WebElement field1 =driver.findElement(By.id("ap_phone_number"));
		field1.sendKeys("70934227");
		field1.sendKeys(Keys.ENTER);
		WebElement field2 =driver.findElement(By.id("ap_password"));
		field2.sendKeys("SiriEsha");
		field2.sendKeys(Keys.ENTER);
		WebElement field3 =driver.findElement(By.id("continue"));
		field3.sendKeys("SiriEsha");
		field3.click();
		driver.close();
		

	}

}
