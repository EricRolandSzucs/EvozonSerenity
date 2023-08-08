package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Before;
import org.junit.Test;

public class LogoutTest extends BaseTest{

    @Before
    public void login() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }

    @Test
    public void validLogoutTest() {
          logoutSteps.doLogout();
          logoutSteps.verifySuccessfulLogout();
    }
}
