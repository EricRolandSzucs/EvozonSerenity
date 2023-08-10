package com.evozon.steps.admin;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteCustomerSteps extends BaseAdminSteps
{
    private String firstName, middleNameOrInitial, lastName, emailAddress, password, confirmPassword;

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
    public WebElementFacade getUserToDelete()
    {
        List<WebElementFacade> users = manageCustomersPage.getAllCustomers();

        for(WebElementFacade user: users)
        {

            String txt = user.getText();
            if((!middleNameOrInitial.isEmpty() && txt.contains(firstName+" " +middleNameOrInitial+" "+lastName)) || (middleNameOrInitial.isEmpty() && txt.contains(firstName+" "+lastName)))
            {
                return user;
            }
            else
            {}
        }
        return null;
    }

    @Step
    public void clickUserEdit(WebElementFacade user)
    {
        manageCustomersPage.clickEditUser(user);
    }

    @Step
    public void clickDeleteUser()
    {
        userPersonalPage.clickDeleteCustomerButton();
    }


    @Step
    public void checkIfUserIsDeleted()
    {
        Assert.assertEquals("The customer has been deleted.",manageCustomersPage.getSuccessMessage());
    }

    @Step
    public void doDeleteUser()
    {
        WebElementFacade user = getUserToDelete();
        clickUserEdit(user);
        clickDeleteUser();
        checkIfUserIsDeleted();
    }
}
