package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;
    WebDriverWait wait;
    By ClickOnAdmin=By.xpath("//li[@class='oxd-main-menu-item-wrapper'][1]");
    By ClickonUsername=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[contains(@class,'oxd-input oxd-input--active')]");
    By ClickOnEmployeeName = By.xpath("//input[contains(@placeholder,'Type for hints...')]");
    By drop                = By.xpath("//div[@class=\"oxd-select-wrapper\"][1]");
    By Select              = By.xpath("//div[@class=\"oxd-select-text-input\"][1]");
    public AdminPage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(90));
    }
public  void ClikingonAdmin()
{
    wait.until(ExpectedConditions.visibilityOfElementLocated(ClickOnAdmin));
    driver.findElement(ClickOnAdmin).click();
}
    public  void EnteringUsernameandemployeename(){
    driver.findElement(ClickonUsername).sendKeys("Admin");
    driver.findElement(ClickOnEmployeeName).sendKeys("Sai Surya Teja");
        driver.findElement(drop).click();
        driver.findElement(Select).sendKeys("ESS");
}
}