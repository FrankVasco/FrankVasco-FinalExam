package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspnPageHome extends BasePage {

    public EspnPageHome(WebDriver driver){
        super(driver);
    }

    @FindBy(id="global-user-trigger")
    private WebElement loginIcon;

    public void clickOnUserIcon(){
        click((By) loginIcon);
    }

}
