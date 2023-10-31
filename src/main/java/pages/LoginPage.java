package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "div#_desktop_user_info .hidden-sm-down")
    private WebElement loginBtn;
    @FindBy(css = "section input[name='email']")
    private WebElement emailText;
    @FindBy(css = "input[name='password']")
    private WebElement passText;
    @FindBy(css = "button#submit-login")
    private WebElement btnSigIn;
    public void accessURL (String url){
        getDriver().get(url);
        //getDriver().manage().window().maximize();
    }

    public void inputInfo (String e, String p){
        loginBtn.click();
        getWait().until(ExpectedConditions.visibilityOf(emailText));
        emailText.sendKeys(e);
        passText.sendKeys(p);
        btnSigIn.click();
    }

}
