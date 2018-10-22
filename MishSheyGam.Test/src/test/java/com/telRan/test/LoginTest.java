package com.telRan.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{


    @Test
    public void LoginByHeader() throws InterruptedException {

        applicationManager.getNavigationHelper().clickLoginButton();
        applicationManager.getNavigationHelper().fillLoginForm("micamike@hotmail.com", "mickael55");

        Assert.assertTrue(applicationManager.getNavigationHelper().isLoggedIn());
    }

    @AfterMethod
    public void logout(){
        applicationManager.getNavigationHelper().ClickLogOut();
    }

}
