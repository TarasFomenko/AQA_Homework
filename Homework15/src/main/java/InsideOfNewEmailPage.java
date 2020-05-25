import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsideOfNewEmailPage extends BasePage {

    public WebElement subjectOfNewEmail = driver.findElement(By.cssSelector("body > div.body_container > div.Body > div:nth-child(3) > div.Right > ul > li > div.message_container.clear > div > div.message_header.clear > h3"));
    public WebElement bodyOfNewEmail = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/ul/li/div[1]/div/div[3]/pre"));
    public WebElement fullEmailList = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));

    public InsideOfNewEmailPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromSubjectOfNewEmail(){
        return subjectOfNewEmail.getText();
    }

    public String getBodyofNewEmail(){
        return bodyOfNewEmail.getText();
    }

    public void enterIntoFullEmailList(){
        fullEmailList.click();
    }
}
