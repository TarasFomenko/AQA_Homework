import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailCreationPage extends BasePage{

    public static final String EMAIL = "Taras1-2@i.ua";
    public static final String SUBJECT = "Изучение Автомейшен";
    public static final String BODY = "Я рад, что решился пойти на курсы!";

    public WebElement toWhom = driver.findElement((By.xpath("//*[@id='to']")));
    public WebElement subject = driver.findElement(By.xpath("*//input[@tabindex = 5]"));
    public WebElement body = driver.findElement(By.xpath("//*[@id='text']"));
    public WebElement sendButton = driver.findElement(By.xpath("/html/body/div[4]/div[6]/div[1]/div[1]/p[1]/input[1]"));

    public EmailCreationPage(WebDriver driver) {
        super(driver);
    }

    public void enterToWhom(){
        toWhom.sendKeys(EMAIL);
    }

    public void enterSubject(){
        subject.sendKeys(SUBJECT);
    }

    public void enterBody(){
        body.sendKeys(BODY);
    }

    public void pressSendButton(){
        sendButton.click();
    }

}
