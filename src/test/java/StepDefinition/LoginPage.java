package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
}
   public void loginmethod() throws InterruptedException {
      Thread.sleep(1000);
      // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.findElement(Username).sendKeys("Admin");
   }
   public void Loginmethod2(){
       driver.findElement(Password).sendKeys("admin123");
       driver.findElement(Login).click();
    }
}
