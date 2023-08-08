package com.evozon.pages.Admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CreateCustomerPage extends BasePage
{
    @FindBy(css = "#_accountwebsite_id")
    private WebElementFacade websiteAssociateSelectList;


    @FindBy(css = "#_accountwebsite_id option[value=\"1\"]")
    private  WebElementFacade mainWebsiteOption;


    @FindBy(id = "_accountfirstname")
    private WebElementFacade firstNameField;


    @FindBy(id = "_accountlastname")
    private WebElementFacade lastNameField;


    @FindBy(id = "_accountemail")
    private WebElementFacade emailAddressField;

    @FindBy(id = "_accountpassword")
    private WebElementFacade passwordField;


    @FindBy(css = ".main-col-inner button[title=\"Save Customer\"]")
    private WebElementFacade saveCustomerButton;


    public void clickWebsiteAssociateSelectList()
    {
        clickOn(websiteAssociateSelectList);
    }

    public void clickMainWebsiteOption()
    {
        clickOn(mainWebsiteOption);
    }


    public void setFirstNameField(String firstName)
    {
        typeInto(firstNameField,firstName);
    }

    public void setLastNameField(String lastName)
    {
        typeInto(lastNameField,lastName);
    }

    public void setEmailAddressField(String email)
    {
        typeInto(emailAddressField,email);
    }

    public void setPasswordField(String password)
    {
        typeInto(passwordField,password);
    }


    public void clickSaveCustomerButton()
    {
        clickOn(saveCustomerButton);
    }

}
