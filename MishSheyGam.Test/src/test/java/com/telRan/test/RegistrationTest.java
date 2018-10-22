package com.telRan.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void RegistrationFromHeaderTest(){
        applicationManager.getRegistrationHelper().initiateCreate();
        applicationManager.getRegistrationHelper().fillRegistration("micamike@hotmail.com", "mickael55", "mickael55");
        applicationManager.getRegistrationHelper().comfirmCreation();
        applicationManager.getRegistrationHelper().fillProfilFields();
    }

    @Test
    public void RegistrationFromPlusButton() throws InterruptedException {
        applicationManager.getRegistrationHelper().initiatePlusButton();
        applicationManager.getRegistrationHelper().fillRegistration("micamike+"+System.currentTimeMillis()+"@hotmail.com", "mickael55", "mickael55");
        applicationManager.getRegistrationHelper().comfirmCreation();
        applicationManager.getRegistrationHelper().fillProfilFields();
    }

    @Test
    public void RegistrationByLogin() throws InterruptedException {
        applicationManager.getRegistrationHelper().initiateByLogin();
        applicationManager.getRegistrationHelper().fillRegistration("micamike+"+System.currentTimeMillis()+"@hotmail.com", "mickael55", "mickael55");
        applicationManager.getRegistrationHelper().comfirmCreation();
        applicationManager.getRegistrationHelper().fillProfilFields();
    }

}
