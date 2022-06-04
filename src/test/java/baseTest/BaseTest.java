package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        driver = new SafariDriver();
        driver.navigate().to("https://phptravels.com/demo/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
