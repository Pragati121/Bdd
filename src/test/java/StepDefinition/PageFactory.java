package StepDefinition;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage LoginP;
    private AdminPage Admin;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage GetLogin() {
        if (LoginP == null){
            LoginP = new LoginPage(driver);
    }
    return LoginP;
}

    public AdminPage GetAdmin() {
        if(Admin==null){
            Admin=new AdminPage(driver);
        }
        return Admin;
    }
}

