package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends Baseclass {
    @Given("User is on the Login Page")
    public void user_is_on_the_Login_page() {
   setUpDriver("Chrome");
    }
    @Given("add Username and password")
    public void add_username_and_password()
    {
    pageFactory.GetLogin().AddingUsernameandPassword();
    }
    @When("Click on Login")
    public void click_on_login() {
     pageFactory.GetLogin().ClickingOnLoginButton();
        driver.quit();
    }
}
