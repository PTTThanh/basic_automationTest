package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC01_SingIn extends BaseTest {
    @Test
    public void TC01_testSingIn (){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.accessURL("textURL");
        loginPage.inputInfo("email","pass");
        System.out.println("SigIn successfully !!!");
    }


}
