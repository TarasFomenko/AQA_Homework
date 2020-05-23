import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailLoginWelcomePage extends BasePage {

    private WebElement welcomeMessage = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));
    private WebElement mailList = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[3]/div[2]/div[2]/div[3]/ul/li[1]/a"));

    public MailLoginWelcomePage(WebDriver driver) {
        super(driver);
    }

    public String getWelcomeText() {
        return welcomeMessage.getText();
    }

    public void enterIntoEmail(){
        mailList.click();
    }


}
