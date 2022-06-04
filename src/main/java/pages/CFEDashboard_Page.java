package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CFEDashboard_Page {

    By usersName_Text = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div/div[2]/span");
    private WebDriver driver;
    public CFEDashboard_Page(WebDriver driver) {
        this.driver = driver;
    }

    public String get_useName(){
        return driver.findElement(usersName_Text).getText();
    }
}
