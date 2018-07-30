package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PageNavigator {


    WebDriver driver;

    public PageNavigator(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Open Home Page")
    public HomePage OpenHomePage(){
        driver.get("http://192.168.10.58/");
        return  new HomePage(driver);
    }
}
