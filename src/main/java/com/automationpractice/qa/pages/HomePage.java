package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath = "//a[@class='login']")
    WebElement loginLink;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public MyAccountPage clickLogin(){
        loginLink.click();
        return new MyAccountPage();
    }


}
