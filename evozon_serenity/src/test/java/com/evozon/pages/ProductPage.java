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

    @FindBy(css = ".link-wishlist")
    private WebElementFacade addToWishlistButton;

    @FindBy(css = ".tab-content .std")
    private WebElementFacade productDescriptionParagraph;

    @FindBy(css = ".toggle-tabs li:nth-child(2)")
    private WebElementFacade productAdditionalInformationTab;

    @FindBy(css = ".main-container.col1-layout")
    private WebElementFacade productPageMainContainer;

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

    public String getProductDescriptionText(){return productDescriptionParagraph.getText();}

    public void clickAdditionalInformationTab(){clickOn(productAdditionalInformationTab);}

    public String getProductMainPageText(){
        String productPageText = productPageMainContainer.getText().toLowerCase();
        clickAdditionalInformationTab();
        productPageText += productPageMainContainer.getText().toLowerCase();
        return productPageText;
    }


}
