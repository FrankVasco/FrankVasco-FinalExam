package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnUserPage extends BasePage {


    public EspnUserPage(WebDriver driver){
        super(driver);
        //this.driver = driver;

    }

    @FindBy(css="div[class='global-user'][style^='left'] a[data-affiliatename='espn']")
    private WebElement logInLink;

    String loginIframe = "disneyid-iframe";

    @FindBy(css="li[class='user hover'] a[onclick^='javascrip']:nth-child(1)")
    private WebElement LogOutLink;

    @FindBy(css="li:nth-child(2) a[tref='/members/v3_1/modifyAccount']")
    private WebElement espnProfile;

    @FindBy(css="li[class='user hover'] li[class='display-user']")
    private WebElement welcomeLabel;



    public void clickOnLogin(){
        click((By) logInLink);
    }

    public void changeToIframe(){
        getDriver().switchTo().frame(loginIframe);
    }

    public String loggedText(){
        findElementUntillVisibility((By) LogOutLink);
        String islogged = getTextElement((By) LogOutLink);
        return islogged;
    }

    public String logOutText(){
        findElementUntillVisibility((By) logInLink);
        String islogged = getTextElement((By) logInLink);
        return islogged;
    }

    public void clickOnLogout(){
        click((By) LogOutLink);
    }

    public void clickOnProfile(){
        click((By) espnProfile);
    }

}
