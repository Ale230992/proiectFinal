package tests.CosulMeuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class CosulMeuTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(CosulMeuTest.class);

    @Test
    public void cosulMeu() {
        String modificacantitatea = "7";
        String email1 = "ale.nyx23@gmail.com";
        String parolata = "AleNyx2309";
        String codpostal = "362789";
        String precizari = "Sunati dupa ora 12:00";

        LOG.info("Check 'Cosul meu' button");
        Assert.assertTrue(cosulMeuPage.isCosulMeuButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Cosul meu' button");
        cosulMeuPage.clickCosulMeuButton();

        LOG.info("Click 'Continua cumparaturile' button");
        cosulMeuPage.clickContinuaCumparaturileButton();

        LOG.info("Click 'Vezi Produse Noi' button");
        cosulMeuPage.clickVeziProduseNoiButton();

        LOG.info("Click 'Marker creativ negru' button");
        cosulMeuPage.clickMarkerCreativNegruButton();

        LOG.info("Click 'Adauga in cos' button");
        cosulMeuPage.clickAdaugaInCosButton();

        LOG.info("Complete the 'Modifica cantitatea' field");
        cosulMeuPage.typeInModificaCantitateField(modificacantitatea);

        LOG.info("Click 'Modifica' button");
        cosulMeuPage.clickModificaButton();

        LOG.info("Click 'Adauga la Favorite' button");
        cosulMeuPage.clickAdaugaLaFavoriteButton();

        LOG.info("Complete the 'Adresa de Email' field");
        cosulMeuPage.typeInAdresaDeEmailField1(email1);

        LOG.info("Click 'Continua' button");
        cosulMeuPage.clickContinuaButton();
        sleep(1000);

        LOG.info("Complete the 'Parola ta' field");
        cosulMeuPage.typeInParolaTaField(parolata);
        sleep(1000);

        LOG.info("Click 'Intra in Cont' button");
        cosulMeuPage.clickIntraInContButton();
        sleep(1000);

        LOG.info("Click 'Cosul meu' button");
        cosulMeuPage.clickCosulMeuButton1();

        LOG.info("Check 'Livrare la domiciliu' radio button is selected");
        Assert.assertTrue(cosulMeuPage.isLivrareLaDomiciuliuRadioButtonSelected(), "Radio button is not selected");

        LOG.info("Check 'Localitate' field is typed in");
        Assert.assertTrue(cosulMeuPage.isLocalitateFieldTypedIn(), "Field is not typed in");

        LOG.info("Check 'Judet' field is typed in");
        Assert.assertTrue(cosulMeuPage.isJudetFieldTypedIn(), "Field is not typed in");

        LOG.info("Check 'Tara' field is typed in");
        Assert.assertTrue(cosulMeuPage.isTaraFieldTypedIn(), "Field is not typed in");

        LOG.info("Complete the 'Cod postal' field");
        cosulMeuPage.typeInCodPostalField(codpostal);

        LOG.info("Check 'Punct de reper' field is typed in");
        Assert.assertTrue(cosulMeuPage.isPunctDeReperFieldTypedIn(), "Field is not typed in");

        LOG.info("Check 'Numerar sau ramburs' radio button is selected");
        Assert.assertTrue(cosulMeuPage.isNumerarSauRambursRadioButtonSelected(), "Radio button is not selected");

        LOG.info("Complete the 'Precizari' field");
        cosulMeuPage.typeInPrecizariField(precizari);

        LOG.info("Check 'Telefon' field is typed in");
        Assert.assertTrue(cosulMeuPage.isTelefonFieldTypedIn(), "Field is not typed in");

        LOG.info("Click 'Confirm numarul de telefon si adresa de livrare' button");
        cosulMeuPage.clickConfirmNumarulDeTelefonSiAdresaDeLivrareButton();


    }
}
