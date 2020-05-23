import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailWelcomePage extends BasePage{



    private WebElement enterButton = driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[2]/a"));

    public MailWelcomePage(WebDriver driver) {
        super(driver);
    }

    public void openLoginWindow (){
        enterButton.click();
    }

}
