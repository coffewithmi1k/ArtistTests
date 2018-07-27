package userTests;

import config.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass extends DriverConfig {


    @Test
    public void getGoogle() {
        driver.get("Https:google.com");
    }
}


