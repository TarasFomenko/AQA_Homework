import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAndPasswordForm extends BasePage {

    public static final String LOGIN = "Taras1-2";
    public static final String PASSWORD = "Test1234";
    public static final String INVALID_PASSWORD = "Test12345";

    private WebElement loginField = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[1]/input"));
    private WebElement passwordField = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/fieldset/p[2]/input"));
    private WebElement submitButton = driver.findElement(By.xpath("//*[@id='FloatLogin']/div/div/form/input[6]"));

    public LoginAndPasswordForm(WebDriver driver) {
        super(driver);
    }

    public void enterLogin() {
        loginField.sendKeys(LOGIN);
    }

    public void enterPassword() {
        passwordField.sendKeys(PASSWORD);
    }

    public void submitCredentials(){
        submitButton.click();
    }

    public void enterInvalidPassword() {
        passwordField.sendKeys(INVALID_PASSWORD);
    }


}
