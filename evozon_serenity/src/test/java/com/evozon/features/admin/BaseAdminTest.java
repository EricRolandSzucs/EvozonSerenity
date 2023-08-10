package com.evozon.features.admin;

import com.evozon.steps.admin.AddNewCustomerSteps;
import com.evozon.steps.admin.CreateProductSteps;
import com.evozon.steps.admin.DeleteCustomerSteps;
import com.evozon.steps.admin.LoginAdminSteps;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseAdminTest
{
    @Managed(uniqueSession = true)
    protected WebDriver driver;

    @Steps
    protected LoginAdminSteps loginSteps;

    @Steps
    protected DeleteCustomerSteps deleteCustomerSteps;


    @Steps
    protected AddNewCustomerSteps addNewCustomerSteps;

    @Steps
    protected CreateProductSteps createNewProductSteps;



    @Before
    public void init()
    {
        driver.manage().window().maximize();
        driver.get(Constants.ADMIN_URL);
    }
}
