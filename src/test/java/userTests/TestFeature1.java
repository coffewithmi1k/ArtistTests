package userTests;

import config.DriverConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.PageNavigator;

import java.util.concurrent.TimeUnit;
@Epic("TestFeature1Epic")

public class TestFeature1  {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }

    //Class Page Objects
    PageNavigator pn = new PageNavigator(driver);
    HomePage onHomePage = new HomePage(driver);



    @Story("Smoke")
    @Test(description = "Check Home Page is opened")
    public void checkHomePageOpened(){
        driver.get("http://192.168.10.58/");

    }
    @Story("Smoke")
    @Test(description = "Check home page is opened using PageObject")
public void checkHomePagewithPageObjects(){
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.OpenHomePage(); //Artist Next Door
        Assert.assertTrue(onHomePage.verifyHomePageOpened().contains("Artist Next Door"));
    }
}
