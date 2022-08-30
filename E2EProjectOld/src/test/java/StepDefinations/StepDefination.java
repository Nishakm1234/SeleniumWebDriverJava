package StepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import resources.base;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination extends base{
@Given("Initialize the driver with Chrome")
public void initialize_the_driver_with_chrome() throws IOException {
	driver=initializeDriver();
    
}
@Given("Navigate to {string} site")
public void navigate_to_site(String string) {
   
   driver.get(string);
}
@Given("click on Login link in home page to land on secure sign in page")
public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() {
	LandingPage l=new LandingPage(driver);
	
	l.getLogin();
	
}
@When("^User enters (.+) and (.+) and logs in$")
public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(username);
	lp.getPassword().sendKeys(password);
	lp.getLogin().click();
}

@Then("Verify that the user is successfully logged in")
public void verify_that_the_user_is_successfully_logged_in() {
   portalHomePage p=new portalHomePage(driver);
   Assert.assertTrue(p.getSearchBox().isDisplayed());
}

@And("^Close browsers$")
public void close_browsers() throws Throwable {
    driver.quit();
}

}