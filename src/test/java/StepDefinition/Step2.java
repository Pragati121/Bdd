package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step2 extends Baseclass{
    @Given("User is on Home Page")
    public void user_is_on_home_page(){
        pageFactory.GetAdmin().AdminMethod();
    }
//    @Given("Click on Admin Option")
//    public void click_on_admin_option() {
//
//    }
//    @Given("add username and employee name")
//    public void add_username_and_employee_name() {
//
//    }
//    @When("Click on user role and status")
//    public void click_on_user_role_and_status() {
//
//    }

}
