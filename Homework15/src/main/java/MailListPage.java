import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailListPage extends BasePage{

    public WebElement createEmailSign = driver.findElement(By.cssSelector("body > div.body_container > div.section_nav > ul > li:nth-child(2) > a"));
    public WebElement newEmail = driver.findElement(By.xpath("*//div[@class = 'messages']/form/div/a"));
    public WebElement allElements = driver.findElement(By.xpath("//*[@id='mesgList']/div/span[1]/span[1]/input"));
    public WebElement deleteSign =  driver.findElement(By.xpath("//*[@id='fieldset1']/fieldset[3]/span"));


    public MailListPage(WebDriver driver) {
        super(driver);
    }

    public void enterIntoEmailCreationOption(){
        createEmailSign.click();
    }

    public void openNewEmail(){
        newEmail.click();
    }

    public void selectAllElements(){
        allElements.click();
    }

    public void pressOnDeleteSign(){
        deleteSign.click();
    }


}
