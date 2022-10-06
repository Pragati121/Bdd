package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step extends Baseclass {
    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
   setUpDriver("Chrome");
    }
    @Given("add Username and password")
    public void add_username_and_password() throws InterruptedException {
    pageFactory.GetLogin().loginmethod();
    }
    @When("Click on Login")
    public void click_on_login() {
     pageFactory.GetLogin().Loginmethod2();
    }
}
