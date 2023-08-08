package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    @FindBy(css = ".box-content a")
    private WebElementFacade changePasswordLink;

    public boolean isUserLoggedIn(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

    public boolean isUserRegistered(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

    public void clickChangePasswordLink() {
        clickOn(changePasswordLink);
    }
}
