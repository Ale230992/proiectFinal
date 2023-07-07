package tests.LeftSideBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;


public class LeftSideBarTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(LeftSideBarTest.class);

    @Test
    public void leftSideBar() {

        LOG.info("Close popup");
        leftSideBarPage.closeModal();

        LOG.info("Click 'Creativ - Art & Hobby' button");
        leftSideBarPage.clickCreativArtAndHobbyButton();

        LOG.info("Click 'Articole lemn' button");
        leftSideBarPage.clickArticoleLemnButton();

        LOG.info("Click 'Cutii lemn si MDF' button");
        leftSideBarPage.clickCutiiLemnSiMdfButton();

        LOG.info("Click '2' button");
        leftSideBarPage.clickPage2Button();

        LOG.info("Click '3' button");
        leftSideBarPage.clickPage3Button();

        LOG.info("Click '4' button");
        leftSideBarPage.clickPage4Button();

        LOG.info("Click '5' button");
        leftSideBarPage.clickPage5Button();

        LOG.info("Click 'Scroll Top' button");
        leftSideBarPage.clickScrollTopButton();

        LOG.info("Click 'Play Video' button");
        leftSideBarPage.clickPlayVdeoButton();

        LOG.info("Click 'Inchide' button");
        leftSideBarPage.clickInchideButton();

        LOG.info("Click 'Vezi Tutoriale Video' button");
        leftSideBarPage.clickVeziTutorialeVideoButton();

    }
}
