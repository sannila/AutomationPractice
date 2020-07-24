package com.automationpractice.qa;

import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LogInPage;
import com.automationpractice.qa.pages.TestBase;
import com.automationpractice.qa.utility.CustomDataProvider;
import com.automationpractice.qa.utility.XLReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class LogInPageTest extends TestBase {
    private HomePage homePage;
    private LogInPage logInPage;
    private XLReader excelReader;
    private String excelPath=properties.getProperty("excelPath").replace("//",File.separator);

    public LogInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() throws Exception{
        initialization();
        homePage = new HomePage();
        logInPage = new LogInPage();
        excelReader = new XLReader(properties.getProperty("excelPath"), "Registration");

    }

    @Test
    public void verifyLoginPageTitleTest(){

        logInPage.verifyLoginPageTitle();
        String actualPageTitle = driver.getTitle();
        System.out.println(actualPageTitle);
    }

    @Test
    public void verifyLoginPageLogoTest(){
        logInPage.verifyLoginPageLogo();
    }

    @Test(dataProvider = "LoginData",dataProviderClass = CustomDataProvider.class)
    public void verifyLoginTest(String UserName, String Password) throws Exception {
        homePage.clickLogin();
        logInPage.login(UserName, Password);

    }

    /*@DataProvider(name = "LoginData")
    public Object[][] getData() {

        Object[][] data = new Object[3][2];
        data[0][0] = "testautomation-practice@gmail.com";
        data[0][1] = "123456";
        data[1][0] = "testautomation-practice@gmail.com";
        data[1][1] = "123456";
        data[2][0] = "testautomation-practice@gmail.com";
        data[2][1] = "123456";

        return data;
    }*/


    /*@Test
    public void verifyForgotPasswordLink() {
        homePage.clickLogin();
        logInPage.clickForgetPasswordLink();
    }*/





    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
