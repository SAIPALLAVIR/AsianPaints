package StoresTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class storestestNG {
  @Test
  public void verify() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.asianpaints.com/");
	  driver.manage().window().maximize();
//	  Thread.sleep(10000);
//	  StoresPageFactory spf = new StoresPageFactory(driver); 
//      spf.Storee();
//	  Thread.sleep(2000);
//	  spf.Paintt();
//	  Thread.sleep(5000);
//	  spf.Decorr();
//	  Thread.sleep(2000);
//	  spf.Furnishingg();
//	  Thread.sleep(2000);
//	  spf.Signaturee();
//	  Thread.sleep(2000);
	  
  }
}
