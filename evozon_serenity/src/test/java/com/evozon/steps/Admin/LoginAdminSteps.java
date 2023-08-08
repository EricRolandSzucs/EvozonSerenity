package com.evozon.steps.Admin;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginAdminSteps extends BaseAdminSteps
{

    @Step
    public void enterUsername(String username)
    {
        loginPage.setUsernameField(username);
    }

    @Step
    public void enterPassword(String password)
    {
        loginPage.setPasswordField(password);
    }

    @Step
    public void clickLogin()
    {
        loginPage.clickLoginButton();
    }

    @Step
    public void clickOnClosePopup()
    {
        homePage.clickPopupCloseButton();
    }

    @Step
    public void doLogin(String username, String password)
    {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
        clickOnClosePopup();
    }

    @Step
    public void checkIfAdminIsLoggedIn()
    {
        Assert.assertEquals("Magento Logo", homePage.getLogoText());
    }

}
