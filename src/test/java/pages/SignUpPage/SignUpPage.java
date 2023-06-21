package pages.SignUpPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignUpPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignUpPage.class);
    public static SignUpPage instance;

    private SignUpPage() {

    }

    public static SignUpPage getInstance() {
        if (instance == null) {
            instance = new SignUpPage();
        }
        return instance;
    }

    private By autentificareButton = By.xpath("//a[@title='Autentificare']/div[2]");
    private By adresaDeEmailField = By.xpath("//input[@type='email']");
    private By continuaButton = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By suntDeAcordButton = By.xpath("//button[@type='submit']");

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

    public void clickSuntDeAcordButton() {
        LOG.info("Click 'Sunt de acord' button");
        driver.findElement(suntDeAcordButton).click();
    }


}
