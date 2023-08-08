package com.evozon.steps;

import net.thucydides.core.annotations.Step;

public class ChangePasswordSteps extends BaseSteps{

    @Step
    public void clickOnPasswordChangeLink() {
        accountPage.clickChangePasswordLink();
    }

    @Step
    public void setCurrentPasswordField(String currentPassword) {
        accountInformationPage.setCurrentPasswordField(currentPassword);
    }

    @Step
    public void setPasswordField(String password) {
        accountInformationPage.setPasswordField(password);
    }


    @Step
    public void setConfirmationField(String confirmation) {
        accountInformationPage.setConfirmationField(confirmation);
    }

    @Step
    public void clickPasswordChangeButton() {
        accountInformationPage.clickPasswordChangeButton();
    }

    @Step
    public void doPasswordChange(String oldPassword, String newPassword) {
        accountInformationPage.setCurrentPasswordField(oldPassword);
        accountInformationPage.setPasswordField(newPassword);
        accountInformationPage.setConfirmationField(newPassword);
        accountInformationPage.clickPasswordChangeButton();
    }

}
