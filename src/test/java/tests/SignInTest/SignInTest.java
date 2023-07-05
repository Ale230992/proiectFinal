package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void SignIn() {
        String email = "ale.nyx23@gmail.com";
        String password = "AleNyx2309";

        LOG.info("Check 'Autentificare' button");
        Assert.assertTrue(signInPage.isAutentificareButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Autentificare' button");
        signInPage.clickAutentificareButton();

        LOG.info("Complete the 'Adresa de Email' field");
        signInPage.typeInAdresaDeEmailField(email);

        LOG.info("Click 'Continua' button");
        signInPage.clickContinuaButton();
        sleep(1000);

        LOG.info("Complete the 'Parola ta' field");
        signInPage.typeInParolaTaField(password);

        LOG.info("Click 'Intra in Cont' button");
        signInPage.clickIntraInContButton();


    }
}
