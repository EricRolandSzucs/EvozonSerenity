package com.evozon.suite;

import com.evozon.features.admin.DeleteCustomerTest;
import com.evozon.features.RegisterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegisterTest.class,
        DeleteCustomerTest.class
})
public class RegisterSuite
{
}
