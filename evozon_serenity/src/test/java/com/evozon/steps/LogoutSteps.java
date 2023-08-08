package com.evozon.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LogoutSteps extends BaseSteps{

    @Step
    public void doLogout() {
        homePage.clickAccountLink();
        homePage.clickLogoutLink();
    }

    @Step
    public void verifySuccessfulLogout() {
        Assert.assertTrue(accountPage.isUserLoggedOut());
    }
}
