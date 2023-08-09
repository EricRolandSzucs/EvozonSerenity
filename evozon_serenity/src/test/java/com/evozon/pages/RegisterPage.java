package com.evozon.pages;

import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {

    Faker faker = new Faker();

    @FindBy(id = "firstname")
    private WebElement firstnameField;

    @FindBy(id = "middlename")
    private WebElement middleNameOrInitialField;

    @FindBy(id = "lastname")
    private WebElement lastnameField;

    @FindBy(id = "email_address")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmationPasswordField;

    @FindBy(id = "is_subscribed")
    private WebElement isSubscribedCheckbox;

    @FindBy(css = "button[title=Register] > span > span")
    private WebElement registerButton;

    @FindBy(css = ".page-title h1")
    private WebElement pageTitle;

    public void setFirstnameField(String firstname){
        waitFor(firstnameField);
        if(firstname!=null) {
            typeInto(firstnameField, firstname);
        }
    }

    public void setMiddleNameOrInitialField(String middleNameOrInitial)
    {
        if(middleNameOrInitial!=null) {
            typeInto(middleNameOrInitialField, middleNameOrInitial);
        }
    }

    public void setLastnameField(String lastname){
        if(lastname!=null) {
            typeInto(lastnameField, lastname);
        }
    }

    public void setEmailAddressField(String email) {
        if (email != null) {
            typeInto(emailAddressField, email);
        }
    }

    public void setRandomEmailAddressField(){
        String randomEmailAddress = faker.bothify("??????###@gmail.com");
        typeInto(emailAddressField, randomEmailAddress);
    }

    public void setPasswordField(String password){
        if (password != null) {
            typeInto(passwordField, password);
        }
    }

    public void setConfirmationPasswordField(String confirmationPassword) {
        if (confirmationPassword != null) {
            typeInto(confirmationPasswordField, confirmationPassword);
        }
    }

    public void setIsSubscribedCheckbox(){
        clickOn(isSubscribedCheckbox);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }


    public String getPageTitle()
    {
        return pageTitle.getText();
    }
}