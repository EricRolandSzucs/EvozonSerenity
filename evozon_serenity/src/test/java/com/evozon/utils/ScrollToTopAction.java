package com.evozon.utils;

import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.JavascriptExecutor;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ScrollToTopAction
{

    public static void scrollToBeginning()
    {
        WebDriverFacade driverFacade = (WebDriverFacade) getDriver();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driverFacade.getProxiedDriver();

        jsExecutor.executeScript("window.scrollTo(0, 0);");
    }
}


