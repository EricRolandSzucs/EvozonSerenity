package com.evozon.pages.Admin;

import com.evozon.pages.BasePage;
import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginAdminPage extends BasePage
{
    @FindBy(id = "username")
    private WebElementFacade usernameField;

    @FindBy(id = "login")
    private WebElementFacade passwordField;

    @FindBy(css = "input[title=\"Login\"]")
    private WebElementFacade loginButton;

    @FindBy(css = ".login-form h2")
    private WebElementFacade loggedOutParagraph;



    public void setUsernameField(String username)
    {
        typeInto(usernameField, Constants.ADMIN_USERNAME);
    }

    public void setPasswordField(String password)
    {
        typeInto(passwordField, Constants.ADMIN_PASSWORD);
    }

    public void clickLoginButton()
    {
        clickOn(loginButton);
    }

    public String getLoggedOutMessage()
    {
        return loggedOutParagraph.getText();
    }

}
