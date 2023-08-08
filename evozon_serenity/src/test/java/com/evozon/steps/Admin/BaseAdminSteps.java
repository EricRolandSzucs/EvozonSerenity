package com.evozon.steps.Admin;

import com.evozon.pages.Admin.*;
import com.github.javafaker.Faker;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Random;

public class BaseAdminSteps extends ScenarioSteps
{
    protected Faker faker = new Faker();

    protected Random random = new Random();
    protected LoginAdminPage loginPage;

    protected HomeAdminPage homePage;

    protected ManageCustomersPage manageCustomersPage;

    protected CreateCustomerPage createCustomerPage;

    protected UserPersonalPage userPersonalPage;

    protected ManageProductsPage manageProductsPage;

    protected AddProductPage addProductPage;
}
