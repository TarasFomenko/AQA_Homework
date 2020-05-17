import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IUATest {
    private WebDriver driver;

    public static final String LOGIN = "Taras1-2";
    public static final String PASSWORD = "Test1234";
    public static final String EMAIL = "Taras1-2@i.ua";
    public static final String SUBJECT = "Изучение Автомейшен";
    public static final String BODY = "Я рад, что решился пойти на курсы!";


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

    @Test(priority = 1)
    public void loginIntoSite(){
        WebElement searchLoginPage = driver.findElement(By.cssSelector("body > div.Branding_header.page_medium.clear > div.Header.clear > ul.user_menu > li.first > a"));
        searchLoginPage.click();

        WebElement enterLogin = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[1]/input"));
        enterLogin.sendKeys(EMAIL);

        WebElement enterPassword = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[2]/input"));
        enterPassword.sendKeys(PASSWORD);

        WebElement logInto = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/input[6]"));
        logInto.click();

        WebElement checkLogin = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
        String loginText = checkLogin.getText();
        Assert.assertTrue(loginText.contains("Taras"));
    }

    @Test(priority = 2)
    public void loginIntoSiteIncorrectData(){
        WebElement searchLoginPage = driver.findElement(By.cssSelector("body > div.Branding_header.page_medium.clear > div.Header.clear > ul.user_menu > li.first > a"));
        searchLoginPage.click();

        WebElement enterLogin = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[1]/input"));
        enterLogin.sendKeys(EMAIL);

        WebElement enterPassword = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[2]/input"));
        enterPassword.sendKeys(PASSWORD + "5");

        WebElement logInto = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/input[6]"));
        logInto.click();

        WebElement checkIncorrectLogin = driver.findElement(By.xpath("//*[@id='lform_errCtrl']/div[1]"));
        String errorMessageText = checkIncorrectLogin.getText();
        Assert.assertTrue(errorMessageText.contains("Неверный логин или пароль"));
    }

    @Test(priority = 3)
        public void sendingEmailAndVerification() throws InterruptedException{
        WebElement searchLoginPage = driver.findElement(By.cssSelector("body > div.Branding_header.page_medium.clear > div.Header.clear > ul.user_menu > li.first > a"));
        searchLoginPage.click();

        WebElement enterLogin = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[1]/input"));
        enterLogin.sendKeys(LOGIN);

        WebElement enterPassword = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[2]/input"));
        enterPassword.sendKeys(PASSWORD);

        WebElement logInto = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/input[6]"));
        logInto.click();

        WebElement enterIntoMailList = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[2]/div[3]/ul/li[1]/a"));
        enterIntoMailList.click();

        WebElement createEmailFeature = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));
        createEmailFeature.click();

        WebElement fillInAddress = driver.findElement((By.xpath("//*[@id='to']")));
        fillInAddress.sendKeys(EMAIL);

        WebElement fillInSubject = driver.findElement(By.xpath("*//input[@tabindex = 5]"));
        fillInSubject.sendKeys(SUBJECT);

        WebElement fillInBody = driver.findElement(By.xpath("//*[@id='text']"));
        fillInBody.sendKeys(BODY);

        Thread.sleep(10000);

        WebElement sendEmail = driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/p[1]/input[1]"));
        sendEmail.click();

        WebElement openEmailList = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));
        openEmailList.click();

        WebElement openNewEmail = driver.findElement(By.xpath("*//div[@class = 'messages']/form/div/a"));
        openNewEmail.click();

        WebElement locateNewEmailSubject = driver.findElement(By.cssSelector("body > div.body_container > div.Body > div:nth-child(3) > div.Right > ul > li > div.message_container.clear > div > div.message_header.clear > h3"));
        String getSubjectText = locateNewEmailSubject.getText();
        Assert.assertTrue(getSubjectText.contains(SUBJECT));

        WebElement locateNewEmailBody = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/ul/li/div[1]/div/div[3]/pre"));
        String getBodyText = locateNewEmailBody.getText();
        Assert.assertTrue(getBodyText.contains(BODY));

        WebElement openEmailListToClear = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));
        openEmailListToClear.click();

        WebElement selectAllEmails = driver.findElement(By.xpath("//*[@id='mesgList']/div/span[1]/span[1]/input"));
        selectAllEmails.click();

        WebElement deleteAllEmails = driver.findElement(By.xpath("//*[@id='fieldset1']/fieldset[3]/span"));
        deleteAllEmails.click();
        driver.switchTo().alert().accept();
    }
}


