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


    }
}
