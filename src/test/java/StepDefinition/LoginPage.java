package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By Username= By.xpath("//input[@placeholder='Username']");
    By Password= By.xpath("//input[contains(@name,'password')]");
    By Login=By.xpath("//button[@type=\"submit\"]");
  public LoginPage(WebDriver driver)
{
    this.driver=driver;
    wait= new WebDriverWait(driver, Duration.ofSeconds(90));
}
   public void AddingUsernameandPassword() {
       wait.until(ExpectedConditions.visibilityOfElementLocated(Username));
       driver.findElement(Username).sendKeys("Admin");
       driver.findElement(Password).sendKeys("admin123");
   }
   public void ClickingOnLoginButton(){
       driver.findElement(Login).click();
    }
}
