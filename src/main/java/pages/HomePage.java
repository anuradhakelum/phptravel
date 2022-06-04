package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class HomePage {
    private WebDriver driver;
    private CustomerFronEnd_Page customerFronEnd_page;

    By customerFrontEndLogin_Button = By.xpath("//*[@id=\"Main\"]/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public CustomerFronEnd_Page customerFrontEnd_Click(){
        String parent_Window = driver.getWindowHandle();
        driver.findElement(customerFrontEndLogin_Button).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        if(iterator.hasNext()){
            iterator.next();
        }
        return customerFronEnd_page = new CustomerFronEnd_Page(driver);
    }

}
