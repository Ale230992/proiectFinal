package pages.IesireDinContPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class IesireContPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(IesireContPage.class);
    public static IesireContPage instance;

    private IesireContPage() {

    }

    public static IesireContPage getInstance() {
        if (instance == null) {
            instance = new IesireContPage();
        }
        return instance;
    }

    private By autentificareButton = By.xpath("//a[@title='Autentificare']/div[2]");
    private By adresaDeEmailField = By.xpath("//input[@type='email']");
    private By continuaButton = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By parolaTaField = By.xpath("//div[3]//input[1]");
    private By intraInContButton = By.xpath("//button[@type='submit']");
    private By contulMeuButton = By.xpath("//a[@title='Contul meu']/div[2]");
    private By iesireContButton = By.xpath("//a[@href='/iesire-cont']");


    public void clickAutentificareButton() {
        LOG.info("Click 'Autentificare' button");
        driver.findElement(autentificareButton).click();
    }

    public void clickContulMeuButton() {
        LOG.info("Click 'Contul meu' button");
        driver.findElement(contulMeuButton).click();
    }

    public void typeInAdresaDeEmailField(String email) {
        LOG.info("Typing email address in 'Adresa de Email' field");
        driver.findElement(adresaDeEmailField).sendKeys(email);
    }

    public void clickContinuaButton() {
        LOG.info("Click 'Continua' button");
        driver.findElement(continuaButton).click();
    }

    public void typeInParolaTaField(String parolata) {
        LOG.info("Typing password in 'Parola ta' field");
        driver.findElement(parolaTaField).sendKeys(parolata);
    }

    public void clickIntraInContButton() {
        LOG.info("Click 'Intra in Cont' button");
        driver.findElement(intraInContButton).click();
    }

    public boolean isIesireContButtonDisplayed() {
        LOG.info("Verify if 'Iesire cont' button is displayed");
        return driver.findElement(iesireContButton).isDisplayed();
    }

    public void clickIesireContButton() {
        LOG.info("Click 'Iesire cont' button");
        driver.findElement(iesireContButton).click();
    }
}