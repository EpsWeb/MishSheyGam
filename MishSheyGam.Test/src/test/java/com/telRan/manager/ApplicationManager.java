package com.telRan.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private NavigationHelper navigationHelper;
    private RegistrationHelper registrationHelper;
    private ProfilHelper profilHelper;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://mish.sheygam.com");
        navigationHelper = new NavigationHelper(wd);
        profilHelper = new ProfilHelper(wd);
        registrationHelper = new RegistrationHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public NavigationHelper getNavigationHelper() { return navigationHelper;}

    public RegistrationHelper getRegistrationHelper() {
        return registrationHelper;
    }

    public ProfilHelper getProfilHelper() {
        return profilHelper;
    }
}
