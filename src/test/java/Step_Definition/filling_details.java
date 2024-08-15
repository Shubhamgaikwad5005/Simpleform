package Step_Definition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filling_details {
	
	static	WebDriver driver;

	@Given("User is on Simple Form Page")
	public void user_is_on_simple_form_page() {
	   
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://v1.training-support.net/selenium/simple-form");
		
		
	}

	@When("Enter the details in the Form")
	public void enter_the_details_in_the_form() {
	    
		driver.findElement(By.cssSelector("[id=\"firstName\"]")).sendKeys("Shubham");

		driver.findElement(By.cssSelector("[id=\"lastName\"]")).sendKeys("gaikwad");
		
		driver.findElement(By.cssSelector("[id=\"email\"]")).sendKeys("shubhamgaikwad@gmail.com");
		
		driver.findElement(By.cssSelector("[id=\"number\"]")).sendKeys("9168917536");
		
		driver.findElement(By.cssSelector("[rows=\"2\"]")).sendKeys("hi my self shubham");
		
	}

	@And("Click on the Submit Button")
	public void click_on_the_submit_button() {
	    
		
		driver.findElement(By.cssSelector("[onclick=\"simpleFormSubmit()\"]")).click();
		
		
	}

	@Then("Handle the alert")
	public void handle_the_alert() throws InterruptedException {
	    
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert();

		Thread.sleep(1000);
		
		alert.accept();
		
	}

	@And("Close the Browser")
	public void close_the_browser() throws InterruptedException {
	    
		Thread.sleep(1000);
		driver.quit();
		
	}

	
}
