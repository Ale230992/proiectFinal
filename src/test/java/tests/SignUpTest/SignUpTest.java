package tests.SignUpTest;


import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void SignUp() {

        String email = RandomStringUtils.randomAlphabetic(5) + "." + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
        String password = "AleNyx2309";
        String numesiprenumele = "Nicoara Alexandra";
        String telefon = "0756 906 275";
        String adresa = "Str. Luptei, nr.2";
        String localitate = "Sibiu";
        String judet = "Sibiu";
        String punctdereper = "Elmina";


        LOG.info("Check 'Autentificare' button");
        Assert.assertTrue(signUpPage.isAutentificareButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Autentificare' button");
        signUpPage.clickAutentificareButton();

        LOG.info("Complete the 'Adresa de Email' field");
        signUpPage.typeInAdresaDeEmailField(email);

        LOG.info("Click 'Continua' button");
        signUpPage.clickContinuaButton();
        sleep(1000);

        LOG.info("Click 'Sunt de acord' button");
        signUpPage.clickSuntDeAcordButton();

        LOG.info("Complete the 'Alege o Parola' field");
        signUpPage.typeInAlegeOparolaField(password);

        LOG.info("Click 'Continua' button");
        signUpPage.clickContinua1Button();

        LOG.info("Complete the 'Nume si Prenumele' field");
        signUpPage.typeInNumeSiPrenumeleField(numesiprenumele);

        LOG.info("Complete the 'Telefon' field");
        signUpPage.typeInTelefonField(telefon);

        LOG.info("Click 'Continua' button");
        signUpPage.clickContinua2Button();

        LOG.info("Complete the 'Adresa' field");
        signUpPage.typeInAdresaField(adresa);

        LOG.info("Complete the 'Localitate' field");
        signUpPage.typeInLocalitateField(localitate);

        LOG.info("Complete the 'Judet' field");
        signUpPage.typeInJudetField(judet);

        LOG.info("Check 'Tara' field is typed in");
        Assert.assertTrue(signUpPage.isTaraFieldButtonTypedIn(), "Field is not typed in");

        LOG.info("Complete the 'Punct de reper' field");
        signUpPage.typeInPunctDeReperField(punctdereper);

        LOG.info("Click 'Continua' button");
        signUpPage.clickContinua3Button();

        LOG.info("Click 'Persoana fizica' radio button");
        signUpPage.clickPersoanaFizicaRadioButton();

        LOG.info("Click 'Creeaza contul' button");
        signUpPage.clickCreeazaContulButton();


    }

}
