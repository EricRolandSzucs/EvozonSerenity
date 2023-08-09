package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/csv/ValidLogin.csv")
public class ValidLoginTest extends BaseTest{

    private String emailAddress, password, resultDefinition;

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterEmailAddress(emailAddress);
        loginSteps.enterPassword(password);
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn(resultDefinition);
    }
}
