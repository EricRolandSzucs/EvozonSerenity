package com.evozon.steps;

import com.evozon.pages.AccountPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;
}