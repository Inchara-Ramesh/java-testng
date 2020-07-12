package suitecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	 WebDriver driver ;
     public static void main(String[] args) {
 		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
 		WebDriver driver =new FirefoxDriver();
 		driver.get("http://alchemy.hguy.co/crm");
 		driver.findElement(By.id("admin_options")).getText();
 		System.out.println(driver.findElement(By.id("admin_options")).getText());
 		driver.close();

}}
