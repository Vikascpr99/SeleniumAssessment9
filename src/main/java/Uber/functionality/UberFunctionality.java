package Uber.functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UberFunctionality {
	
	WebDriver driver;
	
	@Given("^The User is in home page$")
	public void the_user_is_in_home_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.uber.com/in/en/");
		 Thread.sleep(1000);
		 }
	@When("^The User enters valid \"(.*)\" details and select first sugestion$")
	public void the_user_enters_valid_pickup_details_and_select_first_sugestion(String pickup) throws InterruptedException {
		WebElement pickup_location = driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[1]/input"));
	    pickup_location.sendKeys(pickup);
	    Thread.sleep(2000);
	    pickup_location.sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    
	}
	
	@Then("^The User enters valid destination \"(.*)\" details and select first suggestion$")
	public void the_user_enters_valid_destination_details_and_select_first_seggestion(String destination) throws InterruptedException {
		WebElement dest_location = driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/input"));
		dest_location.sendKeys(destination);
		Thread.sleep(2000);
		dest_location.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	@And("^hits for request now$")
	public void hits_for_request_now() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/section[2]/div/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/div[3]/div[1]/a")).click();
		Thread.sleep(3000);
	}
	
	
	@Then("^The user should be able to enter valid \"(.*)\" and then click next for book ride$")
	public void the_user_should_be_able_to_enter_valid_mobilenumber_and_then_click_for_book_ride(String mobilenumber) {
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(mobilenumber);
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
	}
	@Then("^close the browser$")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
	
	
}
