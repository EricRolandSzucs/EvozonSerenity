package com.evozon.features;

import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void validRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstname("Tabita");
        registerSteps.enterLastname("Lucaciu");
//        registerSteps.enterEmailAddress();
        registerSteps.enterPassword("password");
        registerSteps.enterConfirmationPassword("password");
        registerSteps.signUpForNewsletter();
        registerSteps.clickRegister();
        registerSteps.verifyUserIsRegistered("Tabita Lucaciu");
    }
}
