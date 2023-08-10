package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class WishlistPage extends BasePage{
    @FindBy(css = ".success-msg")
    private WebElementFacade confirmationTextParagraph;

    @FindBy(css = ".btn-add")
    private WebElementFacade addAllToCartButton;

    @FindBy(css = ".btn-share")
    private WebElementFacade shareButton;

    @FindBy(id = "email_address")
    private WebElementFacade emailsTextArea;

    private WebElementFacade identifiableProduct;

    private WebElementFacade quantity;

    public boolean isProductAdded(String product) {
        return confirmationTextParagraph.containsOnlyText(product + " has been added to your wishlist. Click here to continue shopping.");
    }

    public void identifyProduct(String productName) {
        identifiableProduct = element(By.xpath("//tr[td[h3[a[text() = '" + productName + "']]]]"));
        quantity = identifiableProduct.find(By.cssSelector(".input-text"));
    }
    public void clickDeleteFromWishlistIcon() {
        clickOn(identifiableProduct.find(By.cssSelector(".btn-remove2")));
        getAlert().accept();
    }

    public boolean verifyProductExists() {
            return !identifiableProduct.isCurrentlyVisible();
    }

    public void setQuantityField(String value) {
        typeInto(quantity, value);
    }

    public void submitQuantityField() {
        quantity.submit();
    }

    public int getQuantityField() {
        return Integer.parseInt(quantity.getValue());
    }

    public boolean verifyQuantityValue(String value) {
        return Objects.equals(quantity.getValue(), value);
    }

    public void clickAddAllToCartButton() {
        clickOn(addAllToCartButton);
    }

    public boolean areProductsMovedToCart() {
        return confirmationTextParagraph.getText().matches("^\\d+ product\\(s\\) have been added to shopping cart:");
    }

    public void clickShareButton() {
        clickOn(shareButton);
    }

    public void setEmailsTextArea(String text) {
        typeInto(emailsTextArea, text);
    }

    public void submitEmailShare(){
        emailsTextArea.submit();
    }

    public boolean isWishlistShared() {
        return confirmationTextParagraph.containsOnlyText("Your Wishlist has been shared.");
    }

}
