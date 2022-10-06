package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class Baseclass {
    static WebDriver driver;
    public PageFactory pageFactory;
    @Parameters("browserName")
    @BeforeClass
    public void setUpDriver(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
            driver.manage().window().maximize();
            pageFactory = new PageFactory(driver);

        } else if (browserName.equalsIgnoreCase("FireFox")) {

            WebDriverManager.firefoxdriver().setup();

            driver = new FirefoxDriver();

            driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

            driver.manage().window().maximize();

            pageFactory = new PageFactory(driver);

        }
    }
    public void close() {
        driver.quit();
    }
}

