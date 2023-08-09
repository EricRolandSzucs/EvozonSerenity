package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    private String emailAddress, password, resultDefinition;

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
        Assert.assertTrue(accountPage.isUserLoggedIn(userName));
    }

    @Step
    public void verifyInvalidEmailOrPasswordMessageIsShown(String message){
        loginPage.invalidEmailOrPasswordMessageIsShown(message);
    }

    @Step
    public void doLogin(String userEmail, String password){
        navigateToLoginPage();
        enterEmailAddress(userEmail);
        enterPassword(password);
        clickLogin();
    }

    @Step
    public void doLoginWithInvalidData(){
        enterEmailAddress(emailAddress);
        enterPassword(password);
        clickLogin();
        verifyInvalidEmailOrPasswordMessageIsShown(resultDefinition);
    }
}