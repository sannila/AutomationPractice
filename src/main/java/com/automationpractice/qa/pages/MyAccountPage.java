package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends TestBase {


    @FindBy(xpath = ".//*[text()='Order history and details']")
    protected WebElement orderHistoryDetails;

    @FindBy(xpath = ".//*[text()='My credit slips]")
    protected WebElement myCreditSlips;

    @FindBy(xpath = ".//*[text()='My addresses']")
    protected WebElement myAddresses;

    @FindBy(xpath = ".//*[text()='My personal information']")
    protected WebElement myPersonalInformation;

    @FindBy(xpath = ".//*[text()='My wishlists']")
    protected WebElement myWishLists;

    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public void getOrderHistoryDetails(){
        orderHistoryDetails.click();
    }

    public void getMyCreditSlips(){
        myCreditSlips.click();
    }

    public void getMyAddresses(){
        myAddresses.click();
    }

    public void getMyPersonalInformation(){
        myPersonalInformation.click();
    }

    public void getMyWishLists(){
        myWishLists.click();
    }

    
}
