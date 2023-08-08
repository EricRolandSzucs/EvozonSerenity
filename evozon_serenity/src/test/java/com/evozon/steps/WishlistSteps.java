package com.evozon.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class WishlistSteps extends BaseSteps{

    @Step
    public void addToWishlist() {
        productPage.clickAddToWishlistButton();
    }

    @Step
    public void verifyProductIsAddedToWishlist(String product){
        Assert.assertTrue(wishlistPage.isProductAdded(product));
    }

    @Step
    public void identifyProduct(String product){
        wishlistPage.identifyProduct(product);
    }
    @Step
    public void deleteProductFromWishlist() {
        wishlistPage.clickDeleteFromWishlistIcon();
    }

    @Step
    public void verifyProductIsDeleted(){
        Assert.assertTrue(wishlistPage.checkProductExists());
    }

    @Step
    public void changeProductQuantity(String quantity) {
        wishlistPage.setQuantityField(quantity);
        wishlistPage.submitQuantityField();
    }

    @Step
    public int getQuantityField() {
        return wishlistPage.getQuantityField();
    }

    @Step
    public void verifyQuantityChange(String quantity) {
        Assert.assertTrue(wishlistPage.checkQuantityValue(quantity));
    }

    @Step
    public void addAllProductsToCart() {
        wishlistPage.clickAddAllToCartButton();
    }

    @Step
    public void verifyProductAreMovedToCart() {
        wishlistPage.areProductsMovedToCart();
    }

    @Step
    public void shareWishlist() {
        wishlistPage.clickShareButton();
    }




}
