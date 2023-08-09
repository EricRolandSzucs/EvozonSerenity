package com.evozon.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class InvalidLoginTest extends BaseTest {

    @Test
    public void loginWithInvalidEmailAddressOrPasswordTest() throws IOException {
        loginSteps.navigateToLoginPage();
        withTestDataFrom("src/test/resources/csv/LoginWithInvalidEmailOrAddress.csv").run(loginSteps).doLoginWithInvalidData();
    }

    //tabylucaciu@yahoo,password,Please enter a valid email address. For example johndoe@domain.com.
    //tabylucaciu.com,password,Please include an '@' in the email address. 'tabylucaciu.com' is missing an '@'.
    //tabylucaciu@yahoo.com, password,null,null,Please enter 6 or more characters without leading or trailing spaces.
    //,antonia,null,This is a required field.,null
    // , ,null,This is a required field.,Please enter 6 or more characters without leading or trailing spaces.
    //This is a required field.
}
