package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {

    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By autentificareButton = By.xpath("//a[@title='Autentificare']/div[2]");
    private By adresaDeEmailField = By.xpath("//input[@type='email']");
    private By continuaButton = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By parolaTaField = By.xpath("//form[@id='AuthForm']/div[3]/input[@type='password']");
    private By intraInContButton = By.xpath("//button[@type='submit']");

    public boolean isAutentificareButtonDisplayed() {
        LOG.info("Verify if 'Autentificare' button is displayed");
        return driver.findElement(autentificareButton).isDisplayed();
    }

    public void clickAutentificareButton() {
        LOG.info("Click 'Autentificare' button");
        driver.findElement(autentificareButton).click();
    }

    public void typeInAdresaDeEmailField(String email) {
        LOG.info("Typing email address in 'Adresa de Email' field");
        driver.findElement(adresaDeEmailField).sendKeys(email);
    }

    public void clickContinuaButton() {
        LOG.info("Click 'Continua' button");
        driver.findElement(continuaButton).click();
    }

    public void typeInParolaTaField(String password) {
        LOG.info("Typing password in 'Parola ta' field");
        driver.findElement(parolaTaField).sendKeys(password);
    }

    public void clickIntraInContButton() {
        LOG.info("Click 'Intra in Cont' button");
        driver.findElement(intraInContButton).click();
    }
}
