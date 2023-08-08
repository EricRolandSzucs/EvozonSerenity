package com.evozon.features;

import com.evozon.utils.Constants;
import org.junit.Before;
import org.junit.Test;

public class PasswordChangeTest extends BaseTest{

    @Before
    public void login() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASSWORD);
    }

    @Test
    public void validPasswordChangeTest() {
        passwordChangeSteps.clickOnPasswordChangeLink();
        passwordChangeSteps.setCurrentPasswordField(Constants.USER_PASSWORD);
        passwordChangeSteps.setPasswordField("parola124");
        passwordChangeSteps.setConfirmationField("parola124");
        passwordChangeSteps.clickPasswordChangeButton();


    }
}
