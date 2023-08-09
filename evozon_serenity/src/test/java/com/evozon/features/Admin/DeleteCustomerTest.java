package com.evozon.features.Admin;

import com.evozon.utils.Constants;
import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.thucydides.core.steps.stepdata.StepData.withTestDataFrom;

@RunWith(SerenityRunner.class)
public class DeleteCustomerTest extends BaseAdminTest
{
    @Test
    public void deleteCustomerTest()
    {
        loginSteps.doLogin(Constants.ADMIN_USERNAME, Constants.USER_PASSWORD);
        deleteCustomerSteps.navigateToManageCustomers();
        try
        {
            withTestDataFrom("src/test/resources/csv/validRegister.csv").run(deleteCustomerSteps).doDeleteUser();
        }catch (Exception e){}

    }
}
