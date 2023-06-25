package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CosulMeuPage.CosulMeuPage;
import pages.SignUpPage.SignUpPage;

public class BaseTest {

    public SignUpPage signUpPage = SignUpPage.getInstance();
    public CosulMeuPage cosulMeuPage = CosulMeuPage.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }
}
