package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void navigateToLoginPage(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
    }

    @Step
    public void enterEmailAddress(String email){
        loginPage.setEmailField(email);
    }

    @Step
    public void enterPassword(String pass){
        loginPage.setPassField(pass);
    }

    @Step
    public void clickLogin(){
        loginPage.clickLoginButton();

    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
//        accountPage.verifyLoggedIn(userName);
        Assert.assertTrue(accountPage.isUserLoggedIn(userName));
    }


    @Step
    public void doLogin(String userEmail, String password){
        navigateToLoginPage();
        enterEmailAddress(userEmail);
        enterPassword(password);
        clickLogin();
    }
}