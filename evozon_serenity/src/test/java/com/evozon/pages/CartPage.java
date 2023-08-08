package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = "h1")
    private WebElementFacade shoppingCartTitle;

    @FindBy(css = ".success-msg")
    private WebElementFacade productAddedParagraph;

    @FindBy(css = "[title='Empty Cart']")
    private WebElementFacade emptyCartLink;

    @FindBy(css = ".bottom .btn-checkout")
    private WebElementFacade checkoutButton;

    @FindBy(css = "button:not([style='visibility:hidden;'])[title='Update Shopping Cart']")
    private WebElementFacade updateShoppingCartLink;

    @FindBy(css = "[title='Continue Shopping']")
    private WebElementFacade continueShoppingLink;

    private WebElementFacade identifiableProduct;

    public boolean isProductAdded(String product) {
        return productAddedParagraph.containsOnlyText(product + " was added to your shopping cart.");
    }

    public void clearQuantityField(){
        WebElementFacade quantityField = identifiableProduct.find(By.cssSelector(".input-text.qty[title='Qty']"));
        quantityField.clear();
    }

    public void setQuantityField(int quantity){
        WebElementFacade quantityField = identifiableProduct.find(By.cssSelector(".input-text.qty[title='Qty']"));
        String quantityString = String.valueOf(quantity);
        typeInto(quantityField, quantityString);
    }

    public String getQuantityField(){
        WebElementFacade quantityField = identifiableProduct.find(By.cssSelector(".input-text.qty[title='Qty']"));
        return quantityField.getAttribute("value");
    }

    public boolean checkQuantityIsUpdated(int quantity){
        String quantityString = String.valueOf(quantity);
        return getQuantityField().equals(quantityString);
    }

    public String getShoppingCartTitle(){
        return shoppingCartTitle.getText();
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }

    public void identifyProduct(String name){
        identifiableProduct = find(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[td[a[@title = '"+ name + "']]]"));
    }

    public void clickRemoveButton(){
        WebElementFacade removeButtonElement = identifiableProduct.find(By.cssSelector(".product-cart-remove .btn-remove"));
        clickOn(removeButtonElement);
    }

    public void clickUpdateButton(){
        waitABit(1000);
        WebElementFacade updateButtonElement = identifiableProduct.find(By.cssSelector(".product-cart-actions .btn-update"));
        clickOn(updateButtonElement);
    }

    public boolean productIsDeleted(){
        return !identifiableProduct.isCurrentlyVisible();
    }

    public void clickEmptyCartLink(){
        clickOn(emptyCartLink);
    }

    public void clickUpdateShoppingCartLink(){
        clickOn(updateShoppingCartLink);
    }

    public void clickContinueShoppingLink(){
        clickOn(continueShoppingLink);
    }

    public boolean checkEmptyCart(){
        return shoppingCartTitle.containsOnlyText("SHOPPING CART IS EMPTY");
    }
}