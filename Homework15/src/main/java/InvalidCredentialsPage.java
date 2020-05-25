import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvalidCredentialsPage extends BasePage {

    public WebElement warningMessage = driver.findElement(By.xpath("//*[@id='lform_errCtrl']/div[1]"));

    public InvalidCredentialsPage(WebDriver driver) {
        super(driver);
    }

    public String getMessageText(){
        return warningMessage.getText();
    }
}
