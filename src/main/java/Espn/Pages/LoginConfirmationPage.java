package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginConfirmationPage extends BasePage {

    public LoginConfirmationPage(WebDriver driver){
        super(driver);
        //this.driver = driver;

    }

    @FindBy(css="input[type='password']")
    private WebElement passwordContinueWindow;

    @FindBy(css="button[class='btn btn-primary ng-isolate-scope']")
    private WebElement logInbuttonConfirmation;

    public void clickOnPassword(){
        click((By) passwordContinueWindow);
    }

    public void sendKeysPassword(String text){
        sendKeys((By) passwordContinueWindow, text);
    }

    public void clickOnLogin(){
        click((By) logInbuttonConfirmation);
    }


}
