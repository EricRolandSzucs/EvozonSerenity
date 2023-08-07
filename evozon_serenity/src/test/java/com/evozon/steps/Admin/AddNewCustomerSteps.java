package com.evozon.steps.Admin;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;


public class AddNewCustomerSteps extends BaseAdminSteps
{
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
}
