package tests;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CFEDashboard_Page;
import pages.CustomerFronEnd_Page;

public class CustomerFrontEnd extends BaseTest {

    private CustomerFronEnd_Page customerFronEnd_page;
    private CFEDashboard_Page cfeDashboard_page;

    @Test
    public void enter_correct_username_password(){
        customerFronEnd_page = homePage.customerFrontEnd_Click();

        customerFronEnd_page.set_UserName("user@phptravels.com");
        customerFronEnd_page.set_Password("demouser");
        cfeDashboard_page = customerFronEnd_page.click_Login();

        Assert.assertEquals(cfeDashboard_page.get_useName(),"Tekrar Hoş Geldiniz");
    }
}
