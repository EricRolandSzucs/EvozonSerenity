package com.evozon.steps;


import com.evozon.pages.*;

import com.evozon.pages.AccountPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import com.evozon.pages.RegisterPage;

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
}