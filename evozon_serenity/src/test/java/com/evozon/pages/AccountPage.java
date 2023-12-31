package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class AccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeTextParagraph;

    @FindBy(css = ".box-content a")
    private WebElementFacade changePasswordLink;

    @FindBy(css = ".page-title")
    private WebElementFacade logoutTextParagraph;

    public boolean isUserLoggedIn(String userName) {
        return welcomeTextParagraph.containsOnlyText("Hello, " + userName + "!");
    }

    public String getWelcomeText()
    {
        return welcomeTextParagraph.getText();
    }

    public void clickChangePasswordLink() {
        clickOn(changePasswordLink);
    }

    public boolean isUserLoggedOut() {
        return logoutTextParagraph.containsOnlyText("YOU ARE NOW LOGGED OUT");
    }

}
