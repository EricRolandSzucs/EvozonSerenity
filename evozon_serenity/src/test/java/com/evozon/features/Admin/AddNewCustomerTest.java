package com.evozon.features.Admin;

import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddNewCustomerTest extends BaseAdminTest
{

    @Before
    public void getToManageCustomersPage()
    {
        loginSteps.doLogin(Constants.ADMIN_USERNAME, Constants.USER_PASSWORD);
        addNewCustomerSteps.navigateToManageCustomers();
    }


    @Test
    public void addNewCustomerTest()
    {
        addNewCustomerSteps.clickOnAddNewCustomer();
        addNewCustomerSteps.selectMainWebsiteOption();
        addNewCustomerSteps.enterFirstName("ana");
        addNewCustomerSteps.enterLastName("popa");
        addNewCustomerSteps.enterEmailAddress("ana@popa.com");
        addNewCustomerSteps.enterPassword("anapopa");
        addNewCustomerSteps.clickSaveCustomer();
        addNewCustomerSteps.checkIfUserIsSaved();
    }
}
