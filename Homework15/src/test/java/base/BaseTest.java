package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
