package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Log Out']")
    private WebElementFacade logoutLink;
  
    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        waitFor(loginLink);
        clickOn(loginLink);
    }

    public void clickLogoutLink(){
        waitFor(logoutLink);
        clickOn(logoutLink);
    }


    public void setSearchField(String search) {
        typeInto(searchField, search);
    }

    public void submitSearchField(){
        searchField.submit();
    }

    public void clickRegisterLink(){
        waitFor(registerLink);
        clickOn(registerLink);
    }

    public boolean checkMatchedUrl(String currentUrl){
        return currentUrl.equals(Constants.BASE_URL);
    }
}