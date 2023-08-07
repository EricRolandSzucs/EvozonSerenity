package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    public void clickAccountLink(){
        clickOn(accountLink);
    }

    public void clickLoginLink(){
        waitFor(loginLink);
        clickOn(loginLink);
    }

}