package com.automationpractice.qa;

import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LogInPage;
import com.automationpractice.qa.pages.RegistrationPage;
import com.automationpractice.qa.pages.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    private HomePage homePage;
    private LogInPage logInPage;
    private RegistrationPage registrationPage;

    public RegistrationTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        homePage = new HomePage();
        logInPage = new LogInPage();
        registrationPage = new RegistrationPage();
    }

    @Test
    public void CreateAnAccount()  {
        homePage.clickLogin();
        logInPage.createAnAccount("tsrt@aol.com");
        registrationPage.setGender("1");
        registrationPage.setCustomerfirstname("First name");
        registrationPage.setCustomerlastname("Last name");
        registrationPage.setPassword("123456");
        registrationPage.setDays("1");
        registrationPage.setMonths("January ");
        registrationPage.setYears("2000");
        registrationPage.setNewsLetterCheckBox();
        registrationPage.setOffersCheckBox();
        registrationPage.setFirstname("FirstName");
        registrationPage.setLastname("LastName");
        registrationPage.setCompany("CompanyName");
        registrationPage.setAddressOneName("AddressOne");
        registrationPage.setAddressTwoName("AddressTwo");
        registrationPage.setCity("City");
        registrationPage.setState("Idaho");
        registrationPage.setPostcode("12345");
        registrationPage.setAdditionalInformation("This is a text Area");
        registrationPage.setHomePhone("1111111111");
        registrationPage.setMobilePhone("2222222222");
        registrationPage.setAliasAddress("Alais Address");
        registrationPage.clickRegisterBtn();

    }





    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
