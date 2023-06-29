package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CosulMeuPage.CosulMeuPage;
import pages.IesireDinContPage.IesireContPage;
import pages.SearchBarPage.SearchBarPage;
import pages.SignInPage.SignInPage;
import pages.SignUpPage.SignUpPage;

public class BaseTest {

    public SignUpPage signUpPage = SignUpPage.getInstance();
    public CosulMeuPage cosulMeuPage = CosulMeuPage.getInstance();
    public SearchBarPage searchBarPage = SearchBarPage.getInstance();
    public IesireContPage iesireContPage = IesireContPage.getInstance();
    public SignInPage signInPage = SignInPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}
