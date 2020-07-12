package suitecrm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;
	
	 @BeforeClass
	    public void beforeClass() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        
	        //Open browser
	        driver.get("http://alchemy.hguy.co/crm");
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 }
	 @Test
	  public void Login() {
		  driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		  driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
		  driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			 
  
	  }
	 @Test
	 public void afterclass()
	 {
        driver.findElement(By.linkText("ACTIVITIES")).click();
       String e = (driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]")).getText());
       System.out.println(e);
       if(e.contentEquals("ACTIVITIES"))
		  {
		  System.out.println("ACTIVITIES menu found"); 
		  
		  }
       else {
    	   System.out.println("Activities menu not found");
       }

	 
	 }
	 @AfterClass 
	 public void aferclass() { 
		  driver.close();
		  }

}
	 

