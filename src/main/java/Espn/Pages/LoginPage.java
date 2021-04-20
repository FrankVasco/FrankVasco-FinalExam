package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver){
        super(driver);
        //this.driver = driver;

    }

    @FindBy(css="input[type='email']")
    private WebElement userNameTextbox;

    @FindBy(css="input[type='password']")
    private WebElement passwordTextbox;

    @FindBy(css="button[class^='btn']")
    private WebElement logInButton;


    public void clickOnEmailTxt(){
        getWait().until(ExpectedConditions.elementToBeClickable(userNameTextbox));
        click((By) userNameTextbox);
    }

    public void clickOnPasswordTxt(){
        getWait().until(ExpectedConditions.elementToBeClickable(userNameTextbox));
        click((By) passwordTextbox);
    }

    public void clickOnloginBtn(){
        getWait().until(ExpectedConditions.elementToBeClickable(userNameTextbox));
        click((By) logInButton);
    }

    public void sendKeysEmail(String text){
        sendKeys((By) passwordTextbox, text);
    }

    public void sendKeysPassword(String text){
        sendKeys((By) passwordTextbox, text);
    }

}
