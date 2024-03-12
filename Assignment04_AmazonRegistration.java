package mar11Locators;
//Using relative Xpath - Amazon.in registration
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment04_AmazonRegistration 
{
	public static void main(String[] args) 
	{
		//FirefoxDriver dr=new FirefoxDriver();
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&prevRID=86BZ627WS900QCQPWJ9H&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//"Your name" field - perform action using different locators
		//WebElement name=dr.findElement(By.name("customerName"));
		//WebElement name=dr.findElement(By.id("ap_customer_name"));
		//WebElement name=dr.findElement(By.xpath("(//input[@id='ap_customer_name'])"));
		WebElement name=dr.findElement(By.xpath("(//input[@name='customerName'])"));
		//WebElement name=dr.findElement(By.xpath("(//input)[6]"));
		name.sendKeys("Sireesha K");
		name.sendKeys(Keys.ENTER);
				
		//"Mobile number" field - perform action using different locators
		//WebElement mobile=dr.findElement(By.name("email"));
		//WebElement mobile=dr.findElement(By.id("ap_phone_number"));
		//WebElement mobile=dr.findElement(By.xpath("(//input[@id='ap_phone_number'])"));
		WebElement mobile=dr.findElement(By.xpath("(//input[@name='email'])"));
		//WebElement mobile=dr.findElement(By.xpath("(//input)[7]"));
		mobile.sendKeys("4759827429");
		mobile.sendKeys(Keys.ENTER);
						
		//"Password" field - perform action using different locators
		//WebElement pwd=dr.findElement(By.name("password"));
		//WebElement pwd=dr.findElement(By.id("ap_password"));
		//WebElement pwd=dr.findElement(By.xpath("(//input[@id='ap_password'])"));
		WebElement pwd=dr.findElement(By.xpath("(//input[@name='password'])"));
		//WebElement pwd=dr.findElement(By.xpath("(//input)[8]"));
		pwd.sendKeys("GroTech");
		//pwd.sendKeys(Keys.ENTER);
								
		//"Verify mobile number" - perform action using different locators
		//WebElement verify=dr.findElement(By.id("continue"));
		WebElement verify=dr.findElement(By.xpath("(//input[@id='continue'])"));
		//WebElement verify=dr.findElement(By.xpath("(//input)[9]"));
		verify.click();	
	}
}
