package com.evozon.features;

import com.evozon.steps.CartSteps;
import com.evozon.steps.LoginSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected CartSteps cartSteps;

    @Before
    public void init(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

}