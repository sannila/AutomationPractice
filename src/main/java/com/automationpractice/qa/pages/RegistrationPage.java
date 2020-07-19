package com.automationpractice.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage extends TestBase {

    public Select select;

    @FindBy(xpath = "//*[@name='id_gender']")
    WebElement gender;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    WebElement customerfirstname;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    WebElement customerlastname;

    @FindBy(xpath = "//*[@id='email']")
    WebElement Cemail;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement Cpassword;



    @FindBy(xpath = "//*[@id='days']")
    WebElement days;
    @FindBy(xpath = "//*[@id='months']")
    WebElement months;
    @FindBy(xpath = "//*[@id='years']")
    WebElement years;


    @FindBy(xpath = "//*[@id='newsletter']")
    WebElement newsLetterCheckBox;
    @FindBy(xpath = "//*[@id='optin']")
    WebElement offersCheckBox;


    @FindBy(xpath = "//*[@id='firstname']")
    WebElement firstname;

    @FindBy(xpath = "//*[@id='lastname']")
    WebElement lastname;

    @FindBy(xpath = "//*[@id='company']")
    WebElement company;

    @FindBy(xpath = "//*[@id='address1']")
    WebElement address1;

    @FindBy(xpath = "//*[@id='address2']")
    WebElement address2;

    @FindBy(xpath = "//*[@id='city']")
    WebElement city;


    @FindBy(xpath = "//*[@id='id_state']")
    WebElement state;

    @FindBy(xpath = "//*[@id='postcode']")
    WebElement postcode;

    @FindBy(xpath = "//*[@id='other']")
    WebElement additionalInformation;
    @FindBy(xpath = "//*[@id='phone']")
    WebElement homePhone;
    @FindBy(xpath = "//*[@id='phone_mobile']")
    WebElement mobilePhone;
    @FindBy(xpath = "//*[@id='alias']")
    WebElement aliasAddress;
    @FindBy(xpath = "//*[@id='submitAccount']")
    WebElement registerBtn;


    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }



    public void setGender(String option){


        List<WebElement> elements = driver.findElements(By.name("id_gender"));
            for (WebElement gender: elements) {
                System.out.println(gender);
                if (gender.getAttribute("value").equalsIgnoreCase(option)) {
                    gender.click();
                }
            }
    }

    public void setCustomerfirstname(String customerFname){
        customerfirstname.sendKeys(customerFname);
    }

    public void setCustomerlastname(String customerLname){
        customerlastname.sendKeys(customerLname);
    }

    public void setPassword(String password){
        Cpassword.sendKeys(password);
    }

    public void setDays(String day){
        select = new Select(days);
        select.selectByValue(day);
    }
    public void setMonths(String month){
        select = new Select(months);
        select.selectByVisibleText(month);
    }
    public void setYears(String year){
        select = new Select(years);
        select.selectByValue(year);
    }

    public void setNewsLetterCheckBox(){
        newsLetterCheckBox.click();
    }

    public void setOffersCheckBox(){
        offersCheckBox.click();
    }

    public void setFirstname(String Fname){
        firstname.sendKeys(Fname);
    }

    public void setLastname(String Lname){
        lastname.sendKeys(Lname);
    }

    public void setCompany(String companyName){
        company.sendKeys(companyName);
    }

    public void setAddressOneName(String AddressOneName){
        address1.sendKeys(AddressOneName);
    }

    public void setAddressTwoName(String AddressTwoName){
        address2.sendKeys(AddressTwoName);
    }

    public void setCity(String cityName){
        city.sendKeys(cityName);
    }

    public void setState(String option){
        select= new Select(state);
        select.selectByVisibleText(option);
    }

    public void setPostcode(String zipCode){
        postcode.sendKeys(zipCode);
    }


    public void setAdditionalInformation(String additionalInfo){
        additionalInformation.sendKeys(additionalInfo);
    }

    public void setHomePhone(String homePhoneNumber){
        homePhone.sendKeys(homePhoneNumber);
    }

    public void setMobilePhone(String mobilePhoneNumber){
        mobilePhone.sendKeys(mobilePhoneNumber);
    }

    public void setAliasAddress(String addressAlias){
        aliasAddress.sendKeys(addressAlias);
    }

    public void clickRegisterBtn(){
        registerBtn.click();
    }



}
