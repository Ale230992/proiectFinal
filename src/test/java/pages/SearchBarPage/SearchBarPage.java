package pages.SearchBarPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchBarPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarPage.class);
    public static SearchBarPage instance;

    private SearchBarPage() {

    }

    public static SearchBarPage getInstance() {
        if (instance == null) {
            instance = new SearchBarPage();
        }
        return instance;
    }


    private By searchBar = By.xpath("//input[@placeholder='Ce vrei sa cauti azi?']");
    private By searchBarField = By.xpath("//input[@placeholder='Ce vrei sa cauti azi?']");
    private By blocHartieDeOrezButton = By.xpath("//div/a[@href='https://complexart.ro/p/bloc-hartie-de-orez-a4-angels-boys-and-girls-itd-48964']");
    private By popUp = By.xpath("//div[@class='modal-content']/span");
    private By adaugaLaFavoriteButton = By.xpath("//div[@class='ct20-headlineButton pointer']");
    private By adresaDeEmailField1 = By.xpath("//input[@type='email']");
    private By continuaButton = By.xpath("//button[@class='Button js-authSubmitButton']");
    private By parolaTaField = By.xpath("//div[3]//input[1]");
    private By intraInContButton = By.xpath("//button[@type='submit']");


    public boolean isSearchBarDisplayed() {
        LOG.info("Verify if 'Search Bar' is displayed");
        return driver.findElement(searchBar).isDisplayed();
    }

    public void closeModal() {
        LOG.info("Close popup");
        if (driver.findElement(popUp).isDisplayed()) {
            driver.findElement(popUp).click();
        }
    }

    public void typeInSearchBarField(String searchbar) {
        LOG.info("Typing the name of a product in 'Search bar' field");
        driver.findElement(searchBarField).sendKeys(searchbar);
    }


    public void clickBlocHartieDeOrezButton() {
        LOG.info("Click 'Bloc hartie de orez' button");
        driver.findElement(blocHartieDeOrezButton).click();
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
}

