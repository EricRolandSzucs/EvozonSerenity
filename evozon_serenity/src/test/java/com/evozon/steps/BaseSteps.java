package com.evozon.steps;


import com.evozon.pages.*;

import com.evozon.pages.AccountPage;
import com.evozon.pages.Admin.HomeAdminPage;
import com.evozon.pages.Admin.OrdersPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import com.evozon.pages.RegisterPage;

import com.evozon.pages.checkout.BillingPage;
import com.evozon.pages.checkout.CheckoutPage;
import com.evozon.pages.checkout.ShippingInformationPage;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected AccountPage accountPage;
    protected ProductGridPage productGridPage;
    protected CartPage cartPage;
    protected ProductPage productPage;
    protected CheckoutPage checkoutPage;
    protected BillingPage billingPage;
    protected ShippingInformationPage shippingInformationPage;
    protected WishlistPage wishlistPage;
    protected AccountInformationPage accountInformationPage;
    protected SubcategoryPage subcategoryPage;

    protected HomeAdminPage homeAdminPage;
    protected OrdersPage ordersAdminPage;

}