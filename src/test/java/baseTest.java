import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new SafariDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
