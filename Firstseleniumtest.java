import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstseleniumtest {
	WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\IncharaRamesh\\java installers\\drivers\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
	}
	

	public static void main(String[] args) {
		Firstseleniumtest obj = new Firstseleniumtest();
		obj.launchbrowser();
		
	}

}
