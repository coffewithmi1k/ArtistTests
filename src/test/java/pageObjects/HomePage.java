package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends PageNavigator {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Home Page is opened")
    public void verifyHomePageOpened(){

        Assert.assertTrue(driver.getTitle().contains("Artist Next Door"));
    }

    @Step("User clicks on the Main Logo")
    public void clickMainLogo() throws InterruptedException {
        driver.findElement(By.cssSelector("body > header > nav > div > a")).click();
        Thread.sleep(5000);
    }

    @Step("User clicks Become an Artist")
    public SignUpPage checkHeaderBecomeAnArtist(){
        driver.findElement(By.cssSelector("#navbarTopContent > ul > li:nth-child(1) > a")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#signup-form > div > div > div.modal-header > div")).getText()
        .contains("Sign Up"));
        return new SignUpPage(driver);

    }

   

}
