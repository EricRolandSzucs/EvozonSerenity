package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmailAddress(Constants.USER_EMAIL);
        loginSteps.enterPassword(Constants.USER_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(Constants.USER_NAME);
    }
}
