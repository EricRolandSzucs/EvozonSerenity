package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade shoppingCartTitle;

    @FindBy(css = ".success-msg")
    private WebElementFacade productAddedParagraph;

    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade checkoutButton;

    @FindBy(css = ".input-text.qty[title='Qty']")
    private WebElementFacade quantityField;

    @FindBy(css = ".product-cart-actions .btn-update")
    private WebElementFacade updateButton;

    @FindBy(css = ".product-cart-remove .btn-remove")
    private WebElementFacade removeButton;

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

    public void clickRemoveButton(){
        clickOn(removeButton);
    }

    public String getShoppingCartTitle(){
        return shoppingCartTitle.getText();
    }

    public boolean productWasDeleted(){
        return shoppingCartTitle.containsOnlyText("SHOPPING CART IS EMPTY");
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
}