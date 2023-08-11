package com.evozon.pages.admin;

import com.evozon.pages.BasePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrdersPage extends BasePage {

    @FindBy(id = "sales_order_grid_filter_real_order_id")
    private WebElementFacade orderIdField;

    @FindBy(css = "button[title=\"Search\"]")
    private WebElementFacade searchButton;

    public void setOrderIdField(String orderId) {
        typeInto(orderIdField, orderId);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public boolean verifyIfOrderIsPresent(String orderId) {
        WebElementFacade order = element(By.xpath("//tr[td[2][contains(text(),'" + orderId + "')]]"));
        return order.isPresent();
    }




}
