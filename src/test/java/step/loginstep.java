package step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstep {
	
	public static WebDriver driver;
	@Given("^I am a registered user on the web page$")
	public void i_am_a_registered_user_on_the_web_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver =new FirefoxDriver();
	    driver.get("https://magento.com/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("MY ACCOUNT")).click();
	}
	
	
	@When("^I understand user credentials$")
	public void i_understand_user_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("natarajan.ramanathan93@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
	}
	
	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("send2")).click();
	    
	}
	
	@Then("^I should get access to the Dashboard$")
	public void i_should_get_access_to_the_Dashboard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.findElement(By.linkText("Log Out")).isDisplayed());
	}
	

}
