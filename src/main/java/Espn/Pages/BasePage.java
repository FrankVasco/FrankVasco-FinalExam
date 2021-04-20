package Espn.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        driver = pDriver;
    }

    protected WebDriver getDriver(){
        return driver;
    }

    /***
     * Define WebDriverWait method for the project
     * @return WebDriverWait
     */
    public WebDriverWait getWait(){
        WebDriverWait wait =  new WebDriverWait(driver, 20);
        this.webDriverWait = wait;
        return webDriverWait;
    }

    /***
     *
     * @param element
     */
    public void findElementUntillVisibility(String element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(element))));
    }

    /***
     * Explicit wait until visibility of a web desired element
     * @param element Web Element in String format
     */
    public void findElementUntillVisibility(By element){
        getWait().until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    /***
     *
     * @param element Web Element in String format
     * @return
     */
    public String getTextElement(String element){
        return driver.findElement(By.cssSelector(element)).getText();
    }

    public String getTextElement(By element){
        return driver.findElement(element).getText();
    }



    /***
     * Click in the button First Selected
     * @param element
     */
    public void click(String element){

        getDriver().findElement(By.cssSelector(element)).click();
    }

    public void click(By element){

        getDriver().findElement(element).click();
    }

    public void sendKeys(By element, String text){
        getDriver().findElement(element).sendKeys(text);
    }




    public void dispose(){
        if(driver != null){
            driver.quit();
        }
    }




}
