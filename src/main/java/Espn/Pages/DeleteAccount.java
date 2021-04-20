package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccount extends BasePage {

    public DeleteAccount(WebDriver driver){
        super(driver);
        //this.driver = driver;
    }

    @FindBy(id="cancel-account")
    private WebElement deleteAccountLink;

    @FindBy(css="button[class='btn btn-primary ng-isolate-scope']")
    private WebElement confirmDeleteAccount;

    public void clickOnDelete(){
        click((By) deleteAccountLink);
    }

    public void clickConfirmDeleteAccount(){
        click((By) confirmDeleteAccount);
    }


}
