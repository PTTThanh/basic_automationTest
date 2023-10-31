package pages;

import core.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Hummingbird Printed T-Shirt")
    private WebElement productOne;
    @FindBy(linkText = "Hummingbird Printed Sweater")
    private WebElement productTwo;
    @FindBy(linkText = "The Best Is Yet To Come'...")
    private WebElement productThree;
    @FindBy(linkText = "The Adventure Begins Framed...")
    private WebElement productFour;
    @FindBy(linkText = "Today Is A Good Day Framed...")
    private WebElement productFive;
    @FindBy(linkText = "Mug The Best Is Yet To Come")
    private WebElement productSix;
    @FindBy(linkText = "Mug The Adventure Begins")
    private WebElement productSeven;
    @FindBy(linkText = "Mug Today Is A Good Day")
    private WebElement productEight;
    @FindBy(css = "select[name='group[1]']")
    private WebElement sizeOption;
    @FindBy (css = ".product-variants .input-container:nth-of-type(1) [type]")
    private WebElement chooseWhite;
    @FindBy(css = ".product-variants .input-container:nth-of-type(2) [type]")
    private WebElement chooseBlack;

    @FindBy(css = ".touchspin-up")
    private WebElement quantityIncrease;
    @FindBy(css = ".touchspin-down")
    private WebElement quantityDecrease;
    @FindBy(css = "[data-button-action]")
    private WebElement addBtn;
    public void chooseItem (){
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView();", productOne);
        productOne.click();
    }
    public void conductAddItem (){
        handleDropDownList(sizeOption,"L");
        chooseBlack.click();
        ((JavascriptExecutor) getDriver()).executeScript(
                "arguments[0].scrollIntoView();", addBtn);
        quantityIncrease.click();
        getWait().until(ExpectedConditions.elementToBeClickable(quantityIncrease));
        quantityIncrease.click();
        addBtn.click();
    }
}
