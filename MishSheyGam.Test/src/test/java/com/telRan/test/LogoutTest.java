package com.telRan.test;

import com.telRan.manager.ApplicationManager;
import com.telRan.manager.HelperBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {

    @BeforeTest
    public void EnsurePrecondition(){
        if(applicationManager.getNavigationHelper().isLoggedIn()){
            applicationManager.getNavigationHelper().ClickLogOut();}
        }



    @Test
    public void LogoutTest(){

        applicationManager.getNavigationHelper().logInMyAccount();
        applicationManager.getNavigationHelper().ClickLogOut();

    }

}
