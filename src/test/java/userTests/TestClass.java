package userTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass {


    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void getGoogle(){
        driver.get("Https:google.com");
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }
}
