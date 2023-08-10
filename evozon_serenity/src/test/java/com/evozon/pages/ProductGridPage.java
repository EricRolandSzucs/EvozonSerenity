package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductGridPage extends BasePage {

    @FindBy(xpath = "//a[@title='" + Constants.CONFIGURABLE_PRODUCT + "']")
    private WebElementFacade predefinedConfigurableProductPageLink;

    @FindBy(css = ".products-grid.products-grid--max-3-col.first.last.odd li.item.last>a")
    private List<WebElementFacade> resultProductsGridLinks;

    public void clickAddToCartButton(String productName) {
        WebElementFacade product = element(By.xpath("//div[h2[a[@title = '" + productName + "']]]"));
        clickOn(product.find(By.cssSelector(".btn-cart")));
    }

    public void clickProductPageLink(String productName) {
        clickOn(element(By.xpath("//h2[a[@title='" + productName + "']]")));
    }

    public List<WebElementFacade> getResultProductLinksList()
    {
        return resultProductsGridLinks;
    }

    public void clickOnDetailsForProduct(WebElementFacade product)
    {
        clickOn(product);
    }
}