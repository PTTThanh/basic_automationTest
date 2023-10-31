package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TC02_ClickProduct extends BaseTest {
    @Test
    public void TC01_clickProduct (){
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        loginPage.accessURL("");
        homePage.chooseItem();
        homePage.conductAddItem();
    }


}
