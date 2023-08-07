package com.evozon.features;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmailAddress("cosmin@evo.com");
        loginSteps.enterPassword("123123");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("aaa dasda");
    }
}
