package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css = ".toggle-tabs li.last")
    private WebElementFacade productReviewTabButton;

    @FindBy(css = ".no-rating a")
    protected WebElementFacade addFirstReviewButton;

    @FindBy(css = ".rating-links a:last-of-type")
    private WebElementFacade addReviewButton;

    public void clickProductReviewTabButton() { clickOn(productReviewTabButton); }

    public boolean verifyReviewExistence() {
        return !addFirstReviewButton.isPresent();
    }

    public void clickAddFirstProductReviewButton() {
        clickOn(addFirstReviewButton);
    }

    public void clickAddProductReviewButton() {
        clickOn(addReviewButton);
    }


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
