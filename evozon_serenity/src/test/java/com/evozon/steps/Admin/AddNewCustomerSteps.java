package com.evozon.steps.Admin;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;



public class AddNewCustomerSteps extends BaseAdminSteps
{
    @Step
    public void clickCustomersMenuOption()
    {
        homePage.clickCustomersDropdown();
    }

    @Step
    public void clickManageCustomerSubCategory()
    {
        homePage.clickManageCustomersLink();
    }

    @Step
    public void navigateToManageCustomers()
    {
        clickCustomersMenuOption();
        clickManageCustomerSubCategory();
    }
    @Step
    public void clickOnAddNewCustomer()
    {
        manageCustomersPage.clickAddNewCustomerButton();
    }

    @Step
    public void selectMainWebsiteOption()
    {
        createCustomerPage.clickWebsiteAssociateSelectList();
        createCustomerPage.clickMainWebsiteOption();
    }


    @Step
    public void enterFirstName(String firstName)
    {
        createCustomerPage.setFirstNameField(firstName);
    }

    @Step
    public void enterLastName(String lastName)
    {
        createCustomerPage.setLastNameField(lastName);
    }

    @Step
    public void enterEmailAddress(String email)
    {
        createCustomerPage.setEmailAddressField(email);
    }

    @Step
    public void enterPassword(String password)
    {
        createCustomerPage.setPasswordField(password);
    }

    @Step
    public void clickSaveCustomer()
    {
        createCustomerPage.clickSaveCustomerButton();
    }


    @Step
    public void checkIfUserIsSaved()
    {
        Assert.assertEquals("The customer has been saved.",manageCustomersPage.getSuccessMessage());
    }

    @Step
    public void doCreateNewCustomer(String firstName, String lastName, String email, String password)
    {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmailAddress(email);
        enterPassword(password);
        clickSaveCustomer();
    }
}
