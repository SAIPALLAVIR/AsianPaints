package StoresPageFac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoresPageFactory {
   WebDriver driver=null;
   
   @FindBy(xpath="(//span[@class=\'iconTextLinks__text visible-in-Desktop\'])[3]")
   WebElement stores;
   @FindBy(xpath=("//a[@href='https://www.asianpaints.com/store-locator.html']"))
   WebElement Paint;
   @FindBy(xpath=("//*[@id=\"headerNav\"]/div[1]/ul/li[3]/a[2]/span[1]"))
   WebElement decor;
   @FindBy(xpath=("//a[@href='/furnishing/sabyasachi']"))
   WebElement Furnishing;
   @FindBy(xpath=("//a[@href='https://www.asianpaints.com/store-locator/signature-store.html']"))
   WebElement Signature;
  
   
   public StoresPageFactory(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
  
   public void Store()
   {
	   stores.click();
   }
   public void Paint()
   {
	   Paint.click();
   }
   public void Decor()
   {
	   decor.click();
   }
   public void Furnishing()
   {
	   Furnishing.click();
   }
   public void Signature()
   {
	   Signature.click();
   }
	
}



