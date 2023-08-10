package com.evozon.suite;

import com.evozon.features.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ValidLoginTest.class,
        LogoutTest.class,
        RegisterTest.class,
        PasswordChangeTest.class
})
public class AccountSuite {
}