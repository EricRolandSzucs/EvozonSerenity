package com.evozon.pages;

//import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageObject {

    Faker faker = new Faker();

    @FindBy(id = "firstname")
    private WebElement firstnameField;

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

    public void setFirstnameField(String firstname){
        waitFor(firstnameField);
        typeInto(firstnameField, firstname);
    }

    public void setLastnameField(String lastname){
        typeInto(lastnameField, lastname);
    }

    public void setRandomEmailAddressField(){
        String randomEmailAddress = faker.bothify("??????###@gmail.com");
        typeInto(emailAddressField, randomEmailAddress);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void setConfirmationPasswordField(String confirmationPassword) {
        typeInto(confirmationPasswordField, confirmationPassword);
    }

    public void setIsSubscribedCheckbox(){
        clickOn(isSubscribedCheckbox);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }
}