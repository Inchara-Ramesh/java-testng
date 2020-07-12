package suitecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
         WebDriver driver ;
         public static void main(String[] args) {
     		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
     		WebDriver driver =new FirefoxDriver();
     		driver.get("http://alchemy.hguy.co/crm");
     		System.out.println(driver.getCurrentUrl());
     		driver.close();
     		
     		
     		
     		
     		
         }
}
