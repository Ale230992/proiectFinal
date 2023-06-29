package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class SearchBarTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);

    @Test
    public void searchBar() {
        String searchbar = "hartie de orez";
        String email1 = "ale.nyx23@gmail.com";
        String parolata = "AleNyx2309";

        LOG.info("Check 'Search bar'");
        Assert.assertTrue(searchBarPage.isSearchBarDisplayed(), "Search bar is not displayed");
        sleep(3000);

        LOG.info("Close popup");
        searchBarPage.closeModal();
        sleep(3000);

        LOG.info("Complete the 'Search bar' field");
        searchBarPage.typeInSearchBarField(searchbar);
        sleep(3000);

        LOG.info("Click 'Bloc hartie de orez' button");
        searchBarPage.clickBlocHartieDeOrezButton();
        sleep(3000);

        LOG.info("Click 'Adauga la Favorite' button");
        searchBarPage.clickAdaugaLaFavoriteButton();
        sleep(3000);

        LOG.info("Complete the 'Adresa de Email' field");
        searchBarPage.typeInAdresaDeEmailField1(email1);
        sleep(3000);

        LOG.info("Click 'Continua' button");
        searchBarPage.clickContinuaButton();
        sleep(3000);

        LOG.info("Complete the 'Parola ta' field");
        searchBarPage.typeInParolaTaField(parolata);
        sleep(3000);

        LOG.info("Click 'Intra in Cont' button");
        searchBarPage.clickIntraInContButton();
        sleep(3000);

    }
}
