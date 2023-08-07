package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".success-msg")
    private WebElementFacade productAddedParagraph;

    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade checkoutButton;

    @FindBy(css = ".input-text.qty[title='Qty']")
    private WebElementFacade quantityField;

    @FindBy(css = ".product-cart-actions .btn-update")
    private WebElementFacade updateButton;

    public boolean isProductAdded(String product) {
        return productAddedParagraph.containsOnlyText(product + " was added to your shopping cart.");
    }

    public void clearQuantityField(){
        quantityField.clear();
    }

    public void setQuantityField(int quantity){
        String quantityString = String.valueOf(quantity);
        typeInto(quantityField, quantityString);
    }

    public String getQuantityField(){
        return quantityField.getAttribute("value");
    }

    public void clickUpdateButton(){
        waitFor(updateButton);
        clickOn(updateButton);
    }

    public boolean verifyQuantityWasUpdated(int quantity){
        String quantityString = String.valueOf(quantity);
        return getQuantityField().equals(quantityString);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
}