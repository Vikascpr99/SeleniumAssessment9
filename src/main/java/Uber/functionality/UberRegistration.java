package Uber.functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UberRegistration {
	WebDriver driver;
	@Given("^The User is in singup page$")
	public void the_user_is_in_registration_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.uber.com/in/en/");
		 
		 
		 driver.findElement(By.xpath("//*[@id=\"main\"]/nav/div/ul[4]/li[5]")).click();
		 Thread.sleep(3000);
		 
		 
		 // Create Account by Rider Account
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[3]/section/div/div/div/div/div[3]/a/div[2]")).click();
		 Thread.sleep(3000);
	}

	@When("^The User enters valid \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" details$")
	public void the_user_enters_valid_details(String firstname, String lastname, String mobilenumber, String email, String password) {
	
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastname);
	    
		driver.findElement(By.id("mobile")).sendKeys(mobilenumber);
	    
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
	    
		driver.findElement(By.xpath("//*[@id=\"addPassword\"]")).sendKeys(password);
	    
	    
	}

	@When("^hits submit$")
	public void hits_submit() {
		
		driver.findElement(By.xpath("//*[@id=\"answerForm\"]/button")).click();
	}

	@Then("^The user should be registered successfully$")
	public void the_user_should_be_registered_successfully()  {
	 
	  String wrong_mobile_number = driver.findElement(By.xpath("//*[@id=\"answerForm\"]/div[1]/div[3]/div[2]")).getText();
	  System.out.println(wrong_mobile_number);
//	 
//	  String wrong_email = driver.findElement(By.xpath("//*[@id=\"error-caption-email\"]")).getText();
//	  System.out.println(wrong_email);
	  
	  String wrong_psssword = driver.findElement(By.xpath("//*[@id=\"answerForm\"]/div[1]/div[5]/div[2]")).getText();
	  System.out.println(wrong_psssword);
	  
	  
	  //Thread.sleep(5000);
	 driver.quit();
	}

}
