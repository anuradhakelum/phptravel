package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class CustomerFronEnd_Page {

    private CFEDashboard_Page cfeDashboard_page;
    private WebDriver driver;

    By userName_Field = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input");
    By password_Field = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input");
    By login_Button = By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button");
    public CustomerFronEnd_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void set_UserName(String userName){
        driver.findElement(userName_Field).sendKeys(userName);
    }

    public void set_Password(String password){
        driver.findElement(password_Field).sendKeys(password);
    }

    public CFEDashboard_Page click_Login(){
        String current_Window = driver.getWindowHandle();
        driver.findElement(login_Button).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        while (iterator.hasNext()){
            String child_Window = iterator.next();
            driver.switchTo().window(child_Window);
        }

        return cfeDashboard_page = new CFEDashboard_Page(driver);
    }
}
