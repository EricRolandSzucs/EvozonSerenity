package com.evozon.features.admin;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginAdminTest extends BaseAdminTest
{

    @Test
    public void loginInAdmin()
    {
        loginSteps.enterUsername(Constants.ADMIN_USERNAME);
        loginSteps.enterPassword(Constants.ADMIN_PASSWORD);
        loginSteps.clickLogin();
        loginSteps.clickOnClosePopup();
        loginSteps.checkIfAdminIsLoggedIn();
    }

}

