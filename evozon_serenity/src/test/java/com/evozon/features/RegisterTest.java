package com.evozon.features;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class RegisterTest extends BaseTest {

    @Ignore
    public void validRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.enterFirstname(Constants.FIRSTNAME);
        registerSteps.enterLastname(Constants.LASTNAME);
        registerSteps.enterRandomEmailAddress();
        registerSteps.enterPassword(Constants.PASSWORD);
        registerSteps.enterConfirmationPassword(Constants.PASSWORD);
        registerSteps.signUpForNewsletter();
        registerSteps.clickRegister();
        registerSteps.verifyUserIsLoggedIn(Constants.FIRSTNAME + " " + Constants.LASTNAME);
    }

    @Test
    public void ddValidRegisterTest()
    {

        try
        {
            withTestDataFrom("src/test/resources/csv/ValidRegister.csv").run(registerSteps).doRegister();
        }
        catch (Exception e){}
    }

    @Test
    public void ddInvalidRegisterTest()
    {
        registerSteps.navigateToRegisterPage();
        try
        {
            withTestDataFrom("src/test/resources/csv/InvalidRegister.csv").run(registerSteps).doInvalidRegister();
        }
        catch (Exception e){}
    }
}
