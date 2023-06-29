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
    private By alegeOParolaField = By.xpath("//form[@id='AuthForm']/div[4]/input[@type='password']");
    private By continua1Button = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By numeSiprenumeleField = By.xpath("//form[@id='AuthForm']/div[5]/input[@type='text']");
    private By telefonField = By.xpath("//form[@id='AuthForm']/div[5]/input[@type='tel']");
    private By continua2Button = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By adresaField = By.xpath("//form[@id='AuthForm']/div[6]/input[1][@type='text']");
    private By localitateField = By.xpath("//form[@id='AuthForm']/div[6]/input[2][@type='text']");
    private By judetField = By.xpath("//form[@id='AuthForm']/div[6]/input[3][@type='text']");
    private By taraField = By.xpath("//form[@id='AuthForm']/div[6]/input[4][@type='text']");
    private By puncteDeReperField = By.xpath("//form[@id='AuthForm']/div[6]/input[5][@type='text']");
    private By continua3Button = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By persoanaFizicaRadioButton = By.xpath("//form[@id='AuthForm']/div[7]/div[2]/div[1]/div[1]/div[1]['RadioButton-icon']");
    private By creeazaContulButton = By.xpath("//form[@id='AuthForm']/div[12]/Div[1]//button[@class='Button js-authSubmitButton']");

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

    public void typeInAlegeOparolaField(String password) {
        LOG.info("Typing password in 'Alege o Parola' field");
        driver.findElement(alegeOParolaField).sendKeys(password);
    }

    public void clickContinua1Button() {
        LOG.info("Click 'Continua' button");
        driver.findElement(continua1Button).click();
    }

    public void typeInNumeSiPrenumeleField(String numesiprenumele) {
        LOG.info("Typing nume and prenume in 'Nume si Prenumele' field");
        driver.findElement(numeSiprenumeleField).sendKeys(numesiprenumele);
    }

    public void typeInTelefonField(String telefon) {
        LOG.info("Typing telefon in 'Telefon' field");
        driver.findElement(telefonField).sendKeys(telefon);
    }

    public void clickContinua2Button() {
        LOG.info("Click 'Continua' button");
        driver.findElement(continua2Button).click();
    }

    public void typeInAdresaField(String adresa) {
        LOG.info("Typing adresa in 'Adresa' field");
        driver.findElement(adresaField).sendKeys(adresa);
    }

    public void typeInLocalitateField(String localitate) {
        LOG.info("Typing localitate in 'Localitate' field");
        driver.findElement(localitateField).sendKeys(localitate);
    }

    public void typeInJudetField(String judet) {
        LOG.info("Typing judet in 'Judet' field");
        driver.findElement(judetField).sendKeys(judet);
    }

    public boolean isTaraFieldButtonTypedIn() {
        LOG.info("Verify if 'Tara' field is typed in");
        return driver.findElement(taraField).isDisplayed();
    }

    public void typeInPunctDeReperField(String punctdereper) {
        LOG.info("Typing punct de reper in 'Punct de reper' field");
        driver.findElement(puncteDeReperField).sendKeys(punctdereper);
    }

    public void clickContinua3Button() {
        LOG.info("Click 'Continua' button");
        driver.findElement(continua3Button).click();
    }

    public void clickPersoanaFizicaRadioButton() {
        LOG.info("Click 'Persoana fizica' radio button");
        driver.findElement(persoanaFizicaRadioButton).click();
    }

    public void clickCreeazaContulButton() {
        LOG.info("Click 'Creeaza contul' button");
        driver.findElement(creeazaContulButton).click();
    }


}




