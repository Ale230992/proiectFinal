package tests.SignUpTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignUpPage.SignUpPage;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void SignUp() {
        String email = "ale.nyx23@gmail.com";

        LOG.info("Check 'Autentificare' button");
        Assert.assertTrue(signUpPage.isAutentificareButtonDisplayed(), "Button is not displayed");
        sleep (3000);

        LOG.info("Click button");
        signUpPage.clickAutentificareButton();
        sleep (3000);

        LOG.info("Complete the 'Adresa de Email' field");
        signUpPage.typeInAdresaDeEmailField(email);
        sleep (3000);


    }

}
