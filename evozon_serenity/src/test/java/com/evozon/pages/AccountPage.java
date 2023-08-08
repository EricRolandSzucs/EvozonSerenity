package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    public boolean isUserLoggedIn(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

}
