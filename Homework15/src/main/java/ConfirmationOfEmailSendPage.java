import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationOfEmailSendPage extends BasePage {

    public WebElement emailList = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));

    public ConfirmationOfEmailSendPage(WebDriver driver) {
        super(driver);
    }

    public void pressOnEmailList(){
        emailList.click();
    }
}
