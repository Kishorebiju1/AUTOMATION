package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    driver.get("https://www.facebook.com/");
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("pass123");
	}
	
	@And("click login button")
	public void click_login_button() {
	    driver.findElement(By.name("login")).submit();
	}
	
	@Then("user is navigated to the home")
	public void user_is_navigated_to_the_home() {
	    Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/","valid login");
	}

}




