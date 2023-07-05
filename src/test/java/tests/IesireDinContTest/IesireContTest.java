package tests.IesireDinContTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;


public class IesireContTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(IesireContTest.class);

    @Test
    public void iesireCont() {

        String email = "ale.nyx23@gmail.com";
        String parolata = "AleNyx2309";

        LOG.info("Click 'Autentificare' button");
        iesireContPage.clickAutentificareButton();

        LOG.info("Complete the 'Adresa de Email' field");
        iesireContPage.typeInAdresaDeEmailField(email);

        LOG.info("Click 'Continua' button");
        iesireContPage.clickContinuaButton();
        sleep(1000);

        LOG.info("Complete the 'Parola ta' field");
        iesireContPage.typeInParolaTaField(parolata);
        sleep(1000);

        LOG.info("Click 'Intra in Cont' button");
        iesireContPage.clickIntraInContButton();
        sleep(1000);

        LOG.info("Click 'Contul meu' button");
        iesireContPage.clickContulMeuButton();
        sleep(1000);

        LOG.info("Check 'Iesire cont' button");
        Assert.assertTrue(iesireContPage.isIesireContButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Iesire cont' button");
        iesireContPage.clickIesireContButton();
    }
}