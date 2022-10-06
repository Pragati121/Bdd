package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;
    By Admin=By.xpath("//li[@class='oxd-main-menu-item-wrapper'][1]");
    public AdminPage(WebDriver driver){
        this.driver=driver;
    }
public void AdminMethod()
{
    driver.findElement(Admin).click();
}
}
