package suitecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity4 {
	WebDriver driver ;
    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		//System.out.println(driver.getCurrentUrl().contentEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index"));
		if (driver.getCurrentUrl().contentEquals("https://alchemy.hguy.co/crm/index.php?module=Home&action=index") == true ) {
			System.out.println("user navigated to homepage");
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.close();
		}

}}
