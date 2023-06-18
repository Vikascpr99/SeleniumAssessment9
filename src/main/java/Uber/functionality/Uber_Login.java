package Uber.functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Uber_Login {

	WebDriver driver;
	
	@Given("^The User is in login page$")
	public void the_user_is_in_login_page() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.uber.com/in/en/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"main\"]/nav/div/ul[4]/li[4]")).click();
		 Thread.sleep(3000);
		 String title1 = driver.getTitle();
			System.out.println(title1);
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div[2]/div/div[4]/section/div/div/div/div/div[3]/a/div[2]")).click();
		 Thread.sleep(3000);
		 String title = driver.getTitle();
			System.out.println(title);
	}

	@When("^The User enters valid \"(.*)\" and hits submit$")
	public void the_user_enters_valid_credentials(String mobilenumber) throws InterruptedException {
		WebElement login = driver.findElement(By.name("phoneNumber"));
		Thread.sleep(3000);
		login.click();
		login.sendKeys(mobilenumber);
		
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
	   
	}
	/*
	@And("^hits submit$")
	public void hits_submit() {
		driver.findElement(By.xpath("//*[@id=\"next-button\"]")).click();
		//driver.findElement(By.id("next-button")).click();;
	}
	*/
	

	@Then("^The user should be logged in successfully$")
	public void the_user_should_be_logged_in_successfully() throws InterruptedException {
	   WebElement error_msg = driver.findElement(By.xpath("//*[@id=\"error-caption-mobile\"]"));
	   System.out.println("Getting Error Message :-"+error_msg.getText());
	   
	   Thread.sleep(3000);
	   driver.quit();
	}

}
