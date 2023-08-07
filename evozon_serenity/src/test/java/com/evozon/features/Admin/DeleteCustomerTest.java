package com.evozon.features.Admin;

import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class DeleteCustomerTest extends BaseAdminTest
{
    @Before
    public void getToManageCustomersPage()
    {
        loginSteps.doLogin(Constants.ADMIN_USERNAME, Constants.USER_PASSWORD);
        homeSteps.clickOnClosePopup();
        homeSteps.navigateToManageCustomers();
    }


    @Test
    public void deleteCustomerTest()
    {
        WebElementFacade user = deleteCustomerSteps.getUserToDelete();
        deleteCustomerSteps.clickUserEdit(user);
        deleteCustomerSteps.clickDeleteUser();
        deleteCustomerSteps.acceptPopup();
        deleteCustomerSteps.checkIfUserIsDeleted();
    }


}
