package com.evozon.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElementFacade productAddedParagraph;

    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade checkoutButton;

    public boolean isProductAdded(String product) {
        return productAddedParagraph.containsOnlyText(product + " was added to your shopping cart.");
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
}