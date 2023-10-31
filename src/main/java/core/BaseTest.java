package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    WebDriver driver;
    private String url;
    private Properties prop;
    @BeforeSuite
    public void beforeTest () throws IOException {
        System.setProperty("webdriver.chrome.driver","D:\\Tester\\URLWEB\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void afterTest (){
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
