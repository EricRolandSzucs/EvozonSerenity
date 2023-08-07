package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    public void setEmailField(String email){
        waitFor(emailField);
        typeInto(emailField,email);
    }

    public void setPassField(String password){
        typeInto(passField, password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

}
