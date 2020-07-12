package suitecrm;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;


public class Activity8
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
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("moduleTab_9_Accounts")));
	  driver.findElement(By.id("moduleTab_9_Accounts")).click();
	  
	  //Fetching names of first 5 odd numbered rows of the table and printing
	  WebDriverWait wait = new WebDriverWait(driver,40);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']/tbody/tr")));
	 	   
	  System.out.println("The first 5 odd numbered rows are : ");
	  for(int i = 1; i < 10; i+=2)
	  {
		  System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i +" ]/td[3]")).getText());
 	  }
  }
  
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
	  System.out.println("Closing the Browser");
  }

}
