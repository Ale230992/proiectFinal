package pages.CosulMeuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
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



}
