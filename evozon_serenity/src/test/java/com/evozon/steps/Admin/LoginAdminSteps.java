package com.evozon.steps.Admin;

import net.thucydides.core.annotations.Step;

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
    public void doLogin(String username, String password)
    {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

}
