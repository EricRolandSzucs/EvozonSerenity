package com.evozon.pages;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Locale;

public class RegisterPage extends PageObject {

    @FindBy(id ="firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmationField;

    @FindBy(css = "button[title='Register']")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setMiddleNameField(String middleName) {
        typeInto(middleNameField, middleName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setEmailAddressField() {
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en", "US"), new RandomService());

        String email = fakeValuesService.bothify("??????###@gmail.com");
        typeInto(emailAddressField, email);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void setConfirmationField(String confirmation) {

        typeInto(confirmationField, confirmation);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}

