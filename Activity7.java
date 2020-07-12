package suitecrm;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;


public class Activity7
{
  WebDriver driver;
  
  @BeforeClass
  public void beforeClass()
  {
	  driver = new FirefoxDriver();
	  driver.get("https://alchemy.hguy.co/crm");
	  System.out.println("Browser has been launched");
  }
  
  @Test
  public void testcase8()
  {
	
	 driver.findElement(By.id("user_name")).sendKeys("admin");
     driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
     driver.findElement(By.id("bigbutton")).click();
     System.out.println("Title of the page : " + driver.getTitle());
  
      
	  driver.findElement(By.id("grouptab_0")).click();
	  WebDriverWait wait1 = new WebDriverWait(driver,20);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Leads")));
	  driver.findElement(By.id("moduleTab_9_Leads")).click();
	 // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href= ‘?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26offset%3D11%26stamp%3D1594284390010021800%26return_module%3DLeads%26action%3DDetailView%26record%3D510a117d-3a54-2745-e023-5f05df542512’]")));
	 // driver.findElement(By.xpath("//a[@href= '?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26offset%3D11%26stamp%3D1594284390010021800%26return_module%3DLeads%26action%3DDetailView%26record%3D510a117d-3a54-2745-e023-5f05df542512']")).click();
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[11]/td[10]/span/span")));
	WebElement informicon =  driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[11]/td[10]/span/span"));
		informicon.click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")));
	String number = driver.findElement(By.xpath("/html/body/div[4]/div/div[7]/div[2]/span")).getText();
	  
	  System.out.println(number);
	  
	  
	  
	  
	  
	 //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")));
	//WebElement informicon =  driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span"));
	//informicon.click();
  }
}