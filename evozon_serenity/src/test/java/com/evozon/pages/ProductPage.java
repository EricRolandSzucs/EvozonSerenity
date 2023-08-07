package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(css = ".add-to-cart-buttons button")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#swatch27")
    private WebElementFacade colorOptionButton;

    @FindBy(css = "#option72")
    private WebElementFacade sizeOptionButton;

    public void clickColorOptionButton() {
        clickOn(colorOptionButton);
    }

    public void clickSizeOptionButton() {
        clickOn(sizeOptionButton);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }
}
