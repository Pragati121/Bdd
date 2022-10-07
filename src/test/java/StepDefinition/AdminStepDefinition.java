package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class AdminStepDefinition extends Baseclass {
    @Given("User is in Home Page")
    public void user_is_in_home_page()  {
        setUpDriver("Chrome");
        pageFactory.GetLogin().AddingUsernameandPassword();
        pageFactory.GetLogin().ClickingOnLoginButton();
    }

    @And("Click on Admin Option")
    public void click_on_admin_option() {
        pageFactory.GetAdmin().ClikingonAdmin();
    }

    @And("Enter username  and employee name")
    public void enterUsernameAndEmployeeName() {
        pageFactory.GetAdmin().EnteringUsernameandemployeename();
        //driver.quit();
    }

}