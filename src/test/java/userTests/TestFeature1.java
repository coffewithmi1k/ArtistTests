package userTests;

import config.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFeature1 extends DriverConfig {




    @Test
    public void checkHomePageOpened(){
        driver.get("http://192.168.10.58/");

    }

}
