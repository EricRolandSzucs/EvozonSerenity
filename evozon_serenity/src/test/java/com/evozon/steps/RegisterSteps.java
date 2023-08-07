package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    @Step
    public void navigateToRegisterPage(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterFirstname(String firstname){
        registerPage.setFirstnameField(firstname);
    }

    @Step
    public void enterLastname(String lastname){
        registerPage.setLastnameField(lastname);
    }

    @Step
    public void enterEmailAddress(){
        registerPage.setRandomEmailAddressField();
    }

    @Step
    public void enterPassword(String password){
        registerPage.setPasswordField(password);
    }

    @Step
    public void enterConfirmationPassword(String confirmationPassword){
        registerPage.setConfirmationPasswordField(confirmationPassword);
    }

    @Step
    public void signUpForNewsletter(){
        registerPage.setIsSubscribedCheckbox();
    }

    @Step
    public void clickRegister(){
        registerPage.clickRegisterButton();
    }

    @Step
    public void verifyUserIsRegistered(String username){
        Assert.assertTrue(accountPage.isUserRegistered(username));
    }
}
