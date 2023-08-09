package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductGridPage extends BasePage {

    @FindBy(xpath = "//a[@title='" + Constants.CONFIGURABLE_PRODUCT + "']")
    private WebElementFacade predefinedConfigurableProductPageLink;

    @FindBy(css = ".category-products > div:not(.toolbar-bottom) .sort-by select")
    private WebElementFacade sortBySelector;

    @FindBy(css = ".category-products > div:not(.toolbar-bottom) .sort-by .sort-by-switcher.sort-by-switcher--desc")
    private WebElementFacade descSwitcher;

    @FindBy(css = ".category-products > div:not(.toolbar-bottom) .sort-by .sort-by-switcher.sort-by-switcher--asc")
    private WebElementFacade ascSwitcher;

    @FindBy(css = ".item")
    private List<WebElementFacade> itemsList;

    public void clickAddToCartButton(String productName) {
        WebElementFacade product = element(By.xpath("//div[h2[a[@title = '" + productName + "']]]"));
        clickOn(product.find(By.cssSelector(".btn-cart")));
    }

    public void clickProductPageLink(String productName) {
        clickOn(element(By.xpath("//h2[a[@title='" + productName + "']]")));
    }

    public void selectSortDropDownOption(String option){
        sortBySelector.selectByVisibleText(option);
    }

    public void setAscSwitcherOn(){
        if (descSwitcher.isCurrentlyVisible())
            clickOn(descSwitcher);
    }

    public void setDescSwitcherOn(){
        if (ascSwitcher.isCurrentlyVisible())
            clickOn(ascSwitcher);
    }

    public boolean checkIsSortingBy(String option, String order) {
        List<String> actualSortedProducts = new ArrayList<>();

        switch (option) {
            case "Position":
                return true;
            case "Name":
                for (WebElementFacade item : itemsList) {
                    String productName = item.find(By.cssSelector(".product-name")).getText();
                    actualSortedProducts.add(productName);
                }
                List<String> nameSortedProducts = new ArrayList<>(actualSortedProducts);
                if (order.equals("descending")) {
                    Collections.sort(nameSortedProducts, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
                } else {
                    Collections.sort(nameSortedProducts, String.CASE_INSENSITIVE_ORDER);
                }
                waitABit(3000);
                return actualSortedProducts.equals(nameSortedProducts);
            case "Price":
                List<Double> priceList = new ArrayList<>();
                for (WebElementFacade item : itemsList) {
                    String priceText = item.find(By.cssSelector(".price")).getText();
                    double price = Double.parseDouble(priceText.replaceAll("[^0-9.]", ""));
                    priceList.add(price);
                }
                List<Double> sortedPrices = new ArrayList<>(priceList);
                if (order.equals("descending")) {
                    Collections.sort(sortedPrices, Collections.reverseOrder());
                } else {
                    Collections.sort(sortedPrices);
                }
                waitABit(3000);

                // Compare double values with tolerance
                double tolerance = 0.000; // Adjust tolerance as needed
                for (int i = 0; i < priceList.size(); i++) {
                    if (Math.abs(priceList.get(i) - sortedPrices.get(i)) > tolerance) {
                        return false;
                    }
                }

                return true;
            default:
                waitABit(3000);
                return false;
        }
    }

}