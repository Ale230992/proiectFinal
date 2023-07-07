package pages.LeftSideBarPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LeftSideBarPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LeftSideBarPage.class);
    public static LeftSideBarPage instance;

    private LeftSideBarPage() {

    }

    public static LeftSideBarPage getInstance() {
        if (instance == null) {
            instance = new LeftSideBarPage();
        }
        return instance;
    }

    private By popUp = By.xpath("//div[@class='modal-content']/span");
    private By creativArtAndHobbyButton = By.xpath("//a[@href='/creativ-art-hobby']");
    private By articoleLemnButton = By.xpath("//a[@href='https://complexart.ro/articole-lemn']");
    private By cutiiLemnSiMdfButton = By.xpath("//a[@href='https://complexart.ro/cutii-lemn-mdf']");
    private By page2Button = By.xpath("//a[@href='https://complexart.ro/cutii-lemn-mdf?page=2']");
    private By page3Button = By.xpath("//a[@href='https://complexart.ro/cutii-lemn-mdf?page=3']");
    private By page4Button = By.xpath("//a[@href='https://complexart.ro/cutii-lemn-mdf?page=4']");
    private By page5Button = By.xpath("//a[@href='https://complexart.ro/cutii-lemn-mdf?page=5']");
    private By scrollTopButton = By.id("scrollTopButton");
    private By playVideoButton = By.xpath("//div[@class='Catalog-coverVideoPlayBtn']");
    private By inchideButton = By.xpath("//div[@class='abs ct19-video-overlay-close pointer to02l']");
    private By veziTutorialeVideoButton = By.xpath("//a[@href='https://www.youtube.com/channel/UCUotRXzjbK_hZ7saAtLcA4A/videos']");

    public void closeModal() {
        LOG.info("Close popup");
        if (driver.findElement(popUp).isDisplayed()) {
            driver.findElement(popUp).click();
        }
    }

    public void clickCreativArtAndHobbyButton() {
        LOG.info("Click 'Creativ - Art & Hobby' button");
        driver.findElement(creativArtAndHobbyButton).click();
    }

    public void clickArticoleLemnButton() {
        LOG.info("Click 'Articole lemn' button");
        driver.findElement(articoleLemnButton).click();
    }

    public void clickCutiiLemnSiMdfButton() {
        LOG.info("Click 'Cutii lemn si MDF' button");
        driver.findElement(cutiiLemnSiMdfButton).click();
    }

    public void clickPage2Button() {
        LOG.info("Click '2' button");
        driver.findElement(page2Button).click();
    }

    public void clickPage3Button() {
        LOG.info("Click '3' button");
        driver.findElement(page3Button).click();
    }

    public void clickPage4Button() {
        LOG.info("Click '4' button");
        driver.findElement(page4Button).click();
    }

    public void clickPage5Button() {
        LOG.info("Click '5' button");
        driver.findElement(page5Button).click();
    }

    public void clickScrollTopButton() {
        LOG.info("Click 'Scroll Top' button");
        driver.findElement(scrollTopButton).click();
    }

    public void clickPlayVdeoButton() {
        LOG.info("Click 'Play Video' button");
        driver.findElement(playVideoButton).click();
    }

    public void clickInchideButton() {
        LOG.info("Click 'Inchide' button");
        driver.findElement(inchideButton).click();
    }

    public void clickVeziTutorialeVideoButton() {
        LOG.info("Click 'Vezi Tutoriale Video' button");
        driver.findElement(veziTutorialeVideoButton).click();
    }


}
