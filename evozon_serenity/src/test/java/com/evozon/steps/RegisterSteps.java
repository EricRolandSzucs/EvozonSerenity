package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    private String firstName, middleNameOrInitial, lastName, emailAddress, password, confirmPassword;

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
    public void enterMiddleNameOrInitial(String middleNameOrInitial){registerPage.setMiddleNameOrInitialField(middleNameOrInitial);}

    @Step
    public void enterLastname(String lastname){
        registerPage.setLastnameField(lastname);
    }

    @Step
    public void enterEmailAddress(String email){registerPage.setEmailAddressField(email);}

    @Step
    public void enterRandomEmailAddress(){
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
    public void verifyUserIsLoggedIn(String username){
        //Assert.assertTrue(accountPage.isUserLoggedIn(username));
        Assert.assertEquals("WELCOME, "+username.toUpperCase()+"!",homePage.getWelcomeMessage());
    }

    @Step
    public void verifyUserIsNotRedirectedToAnotherPage()
    {
        Assert.assertEquals("create an account",registerPage.getPageTitle().toLowerCase());
    }

    @Step
    public void doLogout()
    {
        homePage.clickAccountLink();;
        homePage.clickLogoutLink();
    }

    @Step
    public void doRegister()
    {
        navigateToRegisterPage();
        enterFirstname(firstName);
        enterMiddleNameOrInitial(middleNameOrInitial);
        enterLastname(lastName);
        enterEmailAddress(emailAddress);
        enterPassword(password);
        enterConfirmationPassword(confirmPassword);
        clickRegister();
        if(!middleNameOrInitial.isEmpty())
        {
            verifyUserIsLoggedIn(firstName+" "+middleNameOrInitial+" "+lastName);
        }
        else {
            verifyUserIsLoggedIn(firstName+" "+lastName);
        }
        doLogout();
    }

    @Step
    public void doInvalidRegister()
    {
        enterFirstname(firstName);
        enterMiddleNameOrInitial(middleNameOrInitial);
        enterLastname(lastName);
        enterEmailAddress(emailAddress);
        enterPassword(password);
        enterConfirmationPassword(confirmPassword);
        clickRegister();
        verifyUserIsNotRedirectedToAnotherPage();
    }
}
