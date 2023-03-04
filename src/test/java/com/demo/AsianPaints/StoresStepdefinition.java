package com.demo.AsianPaints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoresStepdefinition {
	WebDriver driver;
	
	@Given("I am on the Asian Paints website")
	public void i_am_on_the_Asian_Paints_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	}
	
	@When("I click on the Stores tab")
	public void i_click_on_the_Stores_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[3]"))).perform();
		Thread.sleep(2000);
	  
	}
			
	@Then("I should see a list of available stores")
	public void i_should_see_a_list_of_available_stores() {
		System.out.println("I should see a list of available stores");
		
	}

	@When("I click on the Paint Stores")
	public void i_click_on_the_Paint_Stores() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 driver.navigate().refresh();
		 Actions actions = new Actions(driver);
		 actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[3]"))).perform();
		 actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/store-locator.html']"))).click().perform();
		 Thread.sleep(2000);
		 
	}

	@Then("I should be taken to the paint page")
	public void i_should_be_taken_to_the_paint_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be taken to the paint page");
	}

	@When("I click on the Decor Stores")
	public void i_click_on_the_Decor_Stores() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[3]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"headerNav\"]/div[1]/ul/li[3]/a[2]/span[1]"))).click().perform();
		Thread.sleep(2000);
	}

	@Then("I should be take to the Decor page")
	public void i_should_be_take_to_the_Decor_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be take to the Decor page");
	}
	
	@When("I click on the Furnishing Stores")
	public void i_click_on_the_Furnishing_Stores() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[3]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='/furnishing/sabyasachi']"))).click().perform();
		Thread.sleep(2000);
	}

	@Then("I should be take to the Furnishing Stores")
	public void i_should_be_take_to_the_Furnishing_Stores() {
		System.out.println("I should be take to the Furnishing Stores");
	}
	
	@When("I click on the {string}")
	public void i_click_on_the(String string) {
		// Write code here that turns the phrase above into concrete actions
		}
	
	@Then("I should be take to the Furnishing page")
	public void i_should_be_take_to_the_Furnishing_page() {
		// Write code here that turns the phrase above into concrete actions
		}

	@When("I click on the Signature Stores")
	public void i_click_on_the_Signature_Stores() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[3]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/store-locator/signature-store.html']"))).click().perform();
		Thread.sleep(2000);
	}

	@Then("I should be take to the Signature page")
	public void i_should_be_take_to_the_Signature_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I should be take to the Signature page");
	}
	
}
