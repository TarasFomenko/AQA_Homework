import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class IUATest extends BaseTest {



    @Test(priority = 1)
    public void loginIntoSite() {
        MailWelcomePage mailWelcomePage = new MailWelcomePage(driver);
        mailWelcomePage.openLoginWindow();

        LoginAndPasswordForm loginAndPasswordForm = new LoginAndPasswordForm(driver);
        loginAndPasswordForm.enterLogin();
        loginAndPasswordForm.enterPassword();
        loginAndPasswordForm.submitCredentials();

        MailLoginWelcomePage mailLoginWelcomePage = new MailLoginWelcomePage(driver);
        String loginText = mailLoginWelcomePage.getWelcomeText();
        Assert.assertTrue(loginText.contains("Taras"));
    }

    @Test(priority = 2)
    public void loginIntoSiteIncorrectData() {
        MailWelcomePage mailWelcomePage = new MailWelcomePage(driver);
        mailWelcomePage.openLoginWindow();

        LoginAndPasswordForm loginAndPasswordForm = new LoginAndPasswordForm(driver);
        loginAndPasswordForm.enterLogin();
        loginAndPasswordForm.enterInvalidPassword();
        loginAndPasswordForm.submitCredentials();


        InvalidCredentialsPage invalidCredentialsPage = new InvalidCredentialsPage(driver);
        String messageText = invalidCredentialsPage.getMessageText();
        Assert.assertTrue(messageText.contains("Неверный логин или пароль"));
    }


    @Test(priority = 3)
    public void sendingEmailAndVerification() throws InterruptedException{

        MailWelcomePage mailWelcomePage = new MailWelcomePage(driver);
        mailWelcomePage.openLoginWindow();

        LoginAndPasswordForm loginAndPasswordForm = new LoginAndPasswordForm(driver);
        loginAndPasswordForm.enterLogin();
        loginAndPasswordForm.enterPassword();
        loginAndPasswordForm.submitCredentials();

        MailLoginWelcomePage mailLoginWelcomePage = new MailLoginWelcomePage(driver);
        String loginText = mailLoginWelcomePage.getWelcomeText();
        Assert.assertTrue(loginText.contains("Taras"));
        mailLoginWelcomePage.enterIntoEmail();

        MailListPage mailListPage = new MailListPage(driver);
        mailListPage.enterIntoEmailCreationOption();

        EmailCreationPage emailCreationPage = new EmailCreationPage(driver);
        emailCreationPage.enterToWhom();
        emailCreationPage.enterSubject();
        emailCreationPage.enterBody();
        emailCreationPage.pressSendButton();

        ConfirmationOfEmailSendPage confirmationOfEmailSendPage = new ConfirmationOfEmailSendPage(driver);
        confirmationOfEmailSendPage.pressOnEmailList();

        Thread.sleep(4000);
        MailListPage mailListPage1 = new MailListPage(driver);
        mailListPage1.openNewEmail();

        InsideOfNewEmailPage insideOfNewEmailPage = new InsideOfNewEmailPage(driver);
        String subjectText = insideOfNewEmailPage.getTextFromSubjectOfNewEmail();
        Assert.assertTrue(subjectText.contains(EmailCreationPage.SUBJECT));
        String bodyText = insideOfNewEmailPage.getBodyofNewEmail();
        Assert.assertTrue(bodyText.contains(EmailCreationPage.BODY));
        insideOfNewEmailPage.enterIntoFullEmailList();

        MailListPage mailListPage2 = new MailListPage(driver);
        mailListPage2.selectAllElements();
        Thread.sleep(2000);
        mailListPage2.pressOnDeleteSign();
        driver.switchTo().alert().accept();
    }
}


