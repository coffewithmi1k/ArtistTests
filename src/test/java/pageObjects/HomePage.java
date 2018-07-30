package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageNavigator {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Home Page is opened")
    public String verifyHomePageOpened(){
     return   driver.getTitle();
    }

}
