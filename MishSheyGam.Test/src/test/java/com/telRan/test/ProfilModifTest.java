package com.telRan.test;

import com.telRan.manager.ProfilHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfilModifTest extends TestBase{

    @Test
    public void ModificationProfilTest() throws InterruptedException {


            applicationManager.getNavigationHelper().logInMyAccount();
            Thread.sleep(3000);
            applicationManager.getNavigationHelper().Hamburger();
            applicationManager.getNavigationHelper().clickProfilButton();
            applicationManager.getProfilHelper().ModifProfilFields();



    }



}
