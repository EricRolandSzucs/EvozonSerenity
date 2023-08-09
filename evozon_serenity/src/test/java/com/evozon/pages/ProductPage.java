package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(css = ".add-to-cart-buttons button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#swatch27")
    private WebElementFacade colorOptionButton;

    @FindBy(css = "#option72")
    private WebElementFacade sizeOptionButton;

    @FindBy(css = ".link-wishlist")
    private WebElementFacade addToWishlistButton;

    public void clickColorOptionButton() {
        clickOn(colorOptionButton);
    }

    public void clickSizeOptionButton() {
        clickOn(sizeOptionButton);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void clickAddToWishlistButton() {
        clickOn(addToWishlistButton);
    }

    public void clickParameterColorOptionButton(String colorName) {
        WebElementFacade colorOption = element(By.cssSelector("img[alt = '" + colorName + "']"));
        if(colorOption.isCurrentlyVisible()) {
            clickOn(colorOption);
        }
    }

    public void clickParameterSizeOptionButton(String sizeName) {
        WebElementFacade sizeOption = element(By.cssSelector("a.swatch-link-180[title='" + sizeName + "']"));
        if(sizeOption.isCurrentlyVisible()) {
            clickOn(sizeOption);
        }
    }

    public void clickParameterOption(String optionName) {
        WebElementFacade option = element(By.xpath("//option[text() = '" + optionName + "']"));
        if(option.isCurrentlyVisible()) {
            clickOn(option);
        }
    }


}
