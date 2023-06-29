package pages.CosulMeuPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CosulMeuPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(CosulMeuPage.class);
    public static CosulMeuPage instance;

    private CosulMeuPage() {

    }

    public static CosulMeuPage getInstance() {
        if (instance == null) {
            instance = new CosulMeuPage();
        }
        return instance;
    }


    private By cosulMeuButton = By.xpath("//a[@title='Cosul meu de cumparaturi']/div[2]");
    private By continuaCumparaturileButton = By.xpath("//a[@class='Button']");
    private By veziProduseNoiButton = By.xpath("//a[@href='https://complexart.ro/noi']");
    private By markerCreativNegruButton = By.xpath("//a[@href='https://complexart.ro/p/fc160799-marker-creativ-negru-faber-castell-57357']");
    private By adaugaInCosButton = By.xpath("//td[@class='td-product-add-to-cart']");
    private By modificaCantitateField = By.xpath("//input[@id='quantity0']");
    private By modificaButton = By.xpath("//td[@id='addT0']");
    private By adaugaLaFavoriteButton = By.xpath("//div[@class='ct20-headlineButton pointer']");
    private By adresaDeEmailField1 = By.xpath("//input[@type='email']");
    private By continuaButton = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By parolaTaField = By.xpath("//div[3]//input[1]");
    private By intraInContButton = By.xpath("//button[@type='submit']");
    private By cosulMeuButton1 = By.xpath("//a[@title='Cosul meu de cumparaturi']/div[2]");
    private By livrareLaDomiciliuRadioButton = By.xpath("//input[@name='paymentDeliveryType'][@value='home']");
    private By localitateField = By.id("deliveryCity");
    private By judetField = By.id("deliveryCounty");
    private By taraField = By.id("deliveryCountry");
    private By codPostalField = By.id("deliveryPostalCode");
    private By punctDeReperField = By.id("ct21DeliveryCommentInput");
    private By numerarSauRambursRadioButton = By.xpath("//input[@value='cash']");
    private By precizariField = By.id("ct21CommentInput");
    private By telefonField = By.id("deliveryPhone");
    private By confirmNumarulDeTelefonSiAdresaDeLivrareButton = By.id("ct21SendOrderButton");


    public boolean isCosulMeuButtonDisplayed() {
        LOG.info("Verify if 'Cosul meu' button is displayed");
        return driver.findElement(cosulMeuButton).isDisplayed();
    }

    public void clickCosulMeuButton() {
        LOG.info("Click 'Cosul meu' button");
        driver.findElement(cosulMeuButton).click();
    }

    public void clickContinuaCumparaturileButton() {
        LOG.info("Click 'Continua cumparaturile' button");
        driver.findElement(continuaCumparaturileButton).click();
    }

    public void clickVeziProduseNoiButton() {
        LOG.info("Click 'Vezi Produse Noi' button");
        driver.findElement(veziProduseNoiButton).click();
    }

    public void clickMarkerCreativNegruButton() {
        LOG.info("Click 'Marker creativ negru' button");
        driver.findElement(markerCreativNegruButton).click();
    }

    public void clickAdaugaInCosButton() {
        LOG.info("Click 'Adauga in cos' button");
        driver.findElement(adaugaInCosButton).click();
    }

    public void typeInModificaCantitateField(String modificacantitatea) {
        LOG.info("Typing quantity 'Modifica cantitatea' field");
        driver.findElement(modificaCantitateField).sendKeys(modificacantitatea);
    }

    public void clickModificaButton() {
        LOG.info("Click 'Modifica' button");
        driver.findElement(modificaButton).click();
    }

    public void clickAdaugaLaFavoriteButton() {
        LOG.info("Click 'Adauga la Favorite' button");
        driver.findElement(adaugaLaFavoriteButton).click();
    }

    public void typeInAdresaDeEmailField1(String email) {
        LOG.info("Typing email address in 'Adresa de Email' field");
        driver.findElement(adresaDeEmailField1).sendKeys(email);
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

    public void clickCosulMeuButton1() {
        LOG.info("Click 'Cosul meu' button");
        driver.findElement(cosulMeuButton1).click();
    }

    public boolean isLivrareLaDomiciuliuRadioButtonSelected() {
        LOG.info("Verify if 'Livrare la domiciliu' radio button is selected");
        return driver.findElement(livrareLaDomiciliuRadioButton).isSelected();
    }

    public boolean isLocalitateFieldTypedIn() {
        LOG.info("Verify if 'Localitate' field is typed in");
        return driver.findElement(localitateField).isDisplayed();
    }

    public boolean isJudetFieldTypedIn() {
        LOG.info("Verify if 'Judet' field is typed in");
        return driver.findElement(judetField).isDisplayed();
    }

    public boolean isTaraFieldTypedIn() {
        LOG.info("Verify if 'Tara' field is typed in");
        return driver.findElement(taraField).isDisplayed();
    }

    public void typeInCodPostalField(String codpostal) {
        LOG.info("Typing cod postal 'Cod postal' field");
        driver.findElement(codPostalField).sendKeys(codpostal);
    }

    public boolean isPunctDeReperFieldTypedIn() {
        LOG.info("Verify if 'Punct de reper' field is typed in");
        return driver.findElement(punctDeReperField).isDisplayed();
    }

    public boolean isNumerarSauRambursRadioButtonSelected() {
        LOG.info("Verify if 'Numerar sau ramburs' radio button is selected");
        return driver.findElement(numerarSauRambursRadioButton).isSelected();
    }

    public void typeInPrecizariField(String precizari) {
        LOG.info("Typing precizari 'Precizari' field");
        driver.findElement(precizariField).sendKeys(precizari);
    }

    public boolean isTelefonFieldTypedIn() {
        LOG.info("Verify if 'Telefon' field is typed in");
        return driver.findElement(telefonField).isDisplayed();
    }

    public void clickConfirmNumarulDeTelefonSiAdresaDeLivrareButton() {
        LOG.info("Click 'Confirm numarul de telefon si adresa de livrare' button");
        driver.findElement(confirmNumarulDeTelefonSiAdresaDeLivrareButton).click();
    }


}
