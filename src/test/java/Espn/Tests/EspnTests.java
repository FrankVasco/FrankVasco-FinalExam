package Espn.Tests;

import Espn.Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EspnTests extends BaseTests {

    EspnPageHome espnPageHome;
    EspnUserPage espnUserPage;
    LoginConfirmationPage loginConfirmationPage;
    LoginPage loginPage;
    DeleteAccount deleteAccount;

    @BeforeTest
    public void setup(){

        espnPageHome = new EspnPageHome(driver);
        espnUserPage = new EspnUserPage(driver);
        loginConfirmationPage = new LoginConfirmationPage(driver);
        loginPage = new LoginPage(driver);
        deleteAccount = new DeleteAccount(driver);
    }


    @Test(dataProvider = "InputDataCredentials", dataProviderClass = TestData.class)
    public void logIn(String userName, String password){
        espnPageHome.clickOnUserIcon();
        espnUserPage.clickOnLogin();
        espnUserPage.changeToIframe();
        loginPage.clickOnEmailTxt();
        loginPage.sendKeysEmail(userName);
        loginPage.clickOnPasswordTxt();
        loginPage.sendKeysPassword(password);
        loginPage.clickOnloginBtn();
        espnPageHome.clickOnUserIcon();
        Assert.assertEquals(espnUserPage.loggedText(), "Log Out");
    }

    @Test(description = "LogOut", dataProvider = "InputDataCredentials", dataProviderClass = TestData.class)
    public void LogOut(String userName, String password){
        espnPageHome.clickOnUserIcon();
        espnUserPage.clickOnLogin();
        espnUserPage.changeToIframe();
        loginPage.clickOnEmailTxt();
        loginPage.sendKeysEmail(userName);
        loginPage.clickOnPasswordTxt();
        loginPage.sendKeysPassword(password);
        loginPage.clickOnloginBtn();
        espnUserPage.clickOnLogout();
        Assert.assertEquals(espnUserPage.logOutText(), "Log In");
    }


    @Test(description = "Cancel Account", dataProvider = "InputDataCredentials", dataProviderClass = TestData.class)
    public void cancelAccount(String userName, String password){
        espnPageHome.clickOnUserIcon();
        espnUserPage.clickOnLogin();
        espnUserPage.changeToIframe();
        loginPage.clickOnEmailTxt();
        loginPage.sendKeysEmail(userName);
        loginPage.clickOnPasswordTxt();
        loginPage.sendKeysPassword(password);
        loginPage.clickOnloginBtn();
        espnUserPage.clickOnProfile();
        loginConfirmationPage.clickOnPassword();
        loginConfirmationPage.sendKeysPassword(password);
        loginConfirmationPage.clickOnPassword();
        deleteAccount.clickOnDelete();
        deleteAccount.clickConfirmDeleteAccount();
    }

    @AfterTest
    public void closePage(){
        espnPageHome.dispose();
        espnUserPage.dispose();
        loginConfirmationPage.dispose();
        loginPage.dispose();
        deleteAccount.dispose();
    }

}
