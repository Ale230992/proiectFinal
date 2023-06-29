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
        sleep(3000);

        LOG.info("Click 'Cosul meu' button");
        cosulMeuPage.clickCosulMeuButton();
        sleep(3000);

        LOG.info("Click 'Continua cumparaturile' button");
        cosulMeuPage.clickContinuaCumparaturileButton();
        sleep(3000);

        LOG.info("Click 'Vezi Produse Noi' button");
        cosulMeuPage.clickVeziProduseNoiButton();
        sleep(3000);

        LOG.info("Click 'Marker creativ negru' button");
        cosulMeuPage.clickMarkerCreativNegruButton();
        sleep(3000);

        LOG.info("Click 'Adauga in cos' button");
        cosulMeuPage.clickAdaugaInCosButton();
        sleep(3000);

        LOG.info("Complete the 'Modifica cantitatea' field");
        cosulMeuPage.typeInModificaCantitateField(modificacantitatea);
        sleep(3000);

        LOG.info("Click 'Modifica' button");
        cosulMeuPage.clickModificaButton();
        sleep(3000);

        LOG.info("Click 'Adauga la Favorite' button");
        cosulMeuPage.clickAdaugaLaFavoriteButton();
        sleep(3000);

        LOG.info("Complete the 'Adresa de Email' field");
        cosulMeuPage.typeInAdresaDeEmailField1(email1);
        sleep(3000);

        LOG.info("Click 'Continua' button");
        cosulMeuPage.clickContinuaButton();
        sleep(3000);

        LOG.info("Complete the 'Parola ta' field");
        cosulMeuPage.typeInParolaTaField(parolata);
        sleep(3000);

        LOG.info("Click 'Intra in Cont' button");
        cosulMeuPage.clickIntraInContButton();
        sleep(3000);

        LOG.info("Click 'Cosul meu' button");
        cosulMeuPage.clickCosulMeuButton1();
        sleep(3000);

        LOG.info("Check 'Livrare la domiciliu' radio button is selected");
        Assert.assertTrue(cosulMeuPage.isLivrareLaDomiciuliuRadioButtonSelected(), "Radio button is not selected");
        sleep(3000);

        LOG.info("Check 'Localitate' field is typed in");
        Assert.assertTrue(cosulMeuPage.isLocalitateFieldTypedIn(), "Field is not typed in");
        sleep(3000);

        LOG.info("Check 'Judet' field is typed in");
        Assert.assertTrue(cosulMeuPage.isJudetFieldTypedIn(), "Field is not typed in");
        sleep(3000);

        LOG.info("Check 'Tara' field is typed in");
        Assert.assertTrue(cosulMeuPage.isTaraFieldTypedIn(), "Field is not typed in");
        sleep(3000);

        LOG.info("Complete the 'Cod postal' field");
        cosulMeuPage.typeInCodPostalField(codpostal);
        sleep(3000);

        LOG.info("Check 'Punct de reper' field is typed in");
        Assert.assertTrue(cosulMeuPage.isPunctDeReperFieldTypedIn(), "Field is not typed in");
        sleep(3000);

        LOG.info("Check 'Numerar sau ramburs' radio button is selected");
        Assert.assertTrue(cosulMeuPage.isNumerarSauRambursRadioButtonSelected(), "Radio button is not selected");
        sleep(3000);

        LOG.info("Complete the 'Precizari' field");
        cosulMeuPage.typeInPrecizariField(precizari);
        sleep(3000);

        LOG.info("Check 'Telefon' field is typed in");
        Assert.assertTrue(cosulMeuPage.isTelefonFieldTypedIn(), "Field is not typed in");
        sleep(3000);

        LOG.info("Click 'Confirm numarul de telefon si adresa de livrare' button");
        cosulMeuPage.clickConfirmNumarulDeTelefonSiAdresaDeLivrareButton();
        sleep(3000);


    }
}
