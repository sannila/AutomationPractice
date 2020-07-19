package com.automationpractice.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends TestBase {

    public String title;

    @FindBy(xpath = "//*[@id='email']")
    WebElement username;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    WebElement signInBtn;

    @FindBy(xpath = "//*[@class='logo img-responsive']")
    WebElement loginPageLogo;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElement createEmail;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    WebElement createAccountBtn;


    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?controller=password']")
    WebElement forgetPasswordLink;

    //Initializing LoginPage Objects
    public LogInPage() {

        PageFactory.initElements(driver, this);
    }

    public String verifyLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean verifyLoginPageLogo() {
        return loginPageLogo.isDisplayed();

    }

    public HomePage login(String userName, String passWord) {

        username.sendKeys(userName);
        password.sendKeys(passWord);
        signInBtn.click();
        return new HomePage();

    }

    public RegistrationPage createAnAccount(String email) {
        createEmail.sendKeys(email);
        createAccountBtn.click();
        return new RegistrationPage();

    }

    public void clickForgetPasswordLink() {

        forgetPasswordLink.click();
    }


}
