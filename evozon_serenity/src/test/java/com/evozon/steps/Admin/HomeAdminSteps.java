package com.evozon.steps.Admin;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeAdminSteps extends BaseAdminSteps
{

    @Step
    public void clickOnClosePopup()
    {
        homePage.clickPopupCloseButton();
    }

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
    public void checkIfAdminIsLoggedIn()
    {
        Assert.assertEquals("Magento Logo", homePage.getLogoText());
    }


    @Step
    public void navigateToManageCustomers()
    {
        clickCustomersMenuOption();
        clickManageCustomerSubCategory();
    }


}
