package com.automationpractice.qa;

import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.TestBase;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends TestBase {
   private HomePage homePage;

    public HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
    }


    @Test
    public void verifyHomePageTitle() {
        homePage.verifyHomePageTitle();

    }

    @Test
    public void verifyLogin() {

        homePage.clickLogin();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
