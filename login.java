package tizag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	static WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	}
	public static void main(String[] args) {
	  login obj=new login();
	  obj.launchbrowser();
	  driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	 //driver alermessage =new alertmessage 
			 System.out.println(driver.switchTo().alert().getText());
			 driver.switchTo().alert().accept();
	  }

}
