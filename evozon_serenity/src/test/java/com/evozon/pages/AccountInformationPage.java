package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountInformationPage extends BasePage{

    @FindBy(id = "current_password")
    private WebElementFacade currentPasswordField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = ".buttons-set button[type='submit']")
    private WebElementFacade passwordChangeButton;

    public void setCurrentPasswordField(String currentPassword) {
        typeInto(currentPasswordField, currentPassword);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void setConfirmationField(String confirmation) {
        typeInto(confirmationField, confirmation);
    }

    public void clickPasswordChangeButton() {
        clickOn(passwordChangeButton);
    }
}
