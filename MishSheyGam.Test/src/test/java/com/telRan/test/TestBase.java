package com.telRan.test;

import com.telRan.manager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public ApplicationManager applicationManager = new ApplicationManager();


    @BeforeClass
    public void setUp(){
        applicationManager.start();
    }


    @AfterClass
    public void tearDeown(){
        applicationManager.stop();
    }

}
