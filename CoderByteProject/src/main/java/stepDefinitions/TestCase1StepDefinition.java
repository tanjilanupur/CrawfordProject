package stepDefinitions;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestCase1StepDefinition extends TestBase {
	
	
	public TestCase1StepDefinition() {
		super();
	}
	
	@Given("^User is already on Crawford homepage$")
	public void user_is_already_on_Crawford_homepage() {

		initialization();
	}

	@When("^Title of homepage$")
	public void title_of_homepage() {
	 
		String title = driver.getTitle();
		Assert.assertEquals(prop.getProperty("CrowfordTitle"), title);
	    
	}

	@Then("^User clicks on facebook link$")
	public void user_clicks_on_facebook_link() {
	    
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement facebookLink = driver.findElement(By.xpath("//a[@title=\"Crawford on Facebook\"]"));
		jse.executeScript("arguments[0].click();", facebookLink);

	}

	@Then("^User confirms the URL of our facebook link on this page$")
	public void user_confirms_the_URL_of_our_facebook_link_on_this_page(){
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		
		driver.switchTo().window(childWindow); //Handle of the Child window
		String expectedUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(prop.getProperty("FacebookURL"), expectedUrl);
		driver.quit();
	   
	}
	
	@Then("^User close the browser$")
	public void user_close_the_browser() {
	   driver.quit();
	}

}
