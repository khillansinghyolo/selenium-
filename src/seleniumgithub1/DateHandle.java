package seleniumgithub1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

public class DateHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://SELENIUM//chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://50.16.49.139:81/Default.aspx");
		WebElement element=driver.findElement(By.xpath("//select[@id='Client']"));
		Select dropdown=new Select(element);
	dropdown.selectByIndex(2);
		System.out.println("successfully select dropdown");
		
		WebElement username=driver.findElement(By.xpath("//input[@id='UserName']"));
	username.sendKeys("00100");
	WebElement password=	driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("password");
		driver.findElement(By.xpath("//div[@id='divCaptchImage']/following::a[1]")).click();

	}

}
