package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void validRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstname(Constants.FIRSTNAME);
        registerSteps.enterLastname(Constants.LASTNAME);
        registerSteps.enterEmailAddress();
        registerSteps.enterPassword(Constants.PASSWORD);
        registerSteps.enterConfirmationPassword(Constants.PASSWORD);
        registerSteps.signUpForNewsletter();
        registerSteps.clickRegister();
        registerSteps.verifyUserIsLoggedIn(Constants.FIRSTNAME + " " + Constants.LASTNAME);
    }
}
