package userTests;

import config.DriverConfig;
import io.qameta.allure.Attachment;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PageNavigator;

import java.util.concurrent.TimeUnit;

@Epic("Home Page tests Epic")

public class TestFeature1 {

    WebDriver driver;

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }


    @Story("Basic Flows")
    @Test(description = "Check Home Page is opened")
    public void checkHomePageOpened() {
        driver.get("http://192.168.10.58/");

    }

    @Story("Basic Flows")
    @Test(description = "Check home page is opened using PageObject")
    public void checkHomePagewithPageObjects() {
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.OpenHomePage(); //Artist Next Door
        onHomePage.verifyHomePageOpened();
        saveScreenshotPNG(driver);
    }

    @Story("Basic Flows")
    @Test(description = "Check Main logo redirects to the Main Page")
    public void checkMainLogo() throws InterruptedException {
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.OpenHomePage();
        onHomePage.clickMainLogo();
        onHomePage.verifyHomePageOpened();
        saveScreenshotPNG(driver);

    }

    @Story("Basic Flows")
    @Test(description = "Header links")
    public void checkHeaderMenu() {
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.OpenHomePage();
        onHomePage.checkHeaderBecomeAnArtist();
        saveScreenshotPNG(driver);
    }
}
