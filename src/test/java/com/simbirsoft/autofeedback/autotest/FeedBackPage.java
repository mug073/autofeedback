package com.simbirsoft.autofeedback.autotest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mug on 13.11.16.
 */
public class FeedBackPage{
    WebDriver driver;
    public FeedBackPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    //------Описание локаторов------------
    //    заголовок
    @FindBy(xpath = "./html/body/section/form/div[1]/div[1]")
    private WebElement  headLocator;

    //    кнопка языка
    @FindBy (xpath = "./html/body/section/form/a")
    private WebElement lengButtonLocator;

    //    поле почты
    @FindBy (name ="email")
    private WebElement emailfieldLocator;

    //    локатор формы для отправки
    @FindBy (tagName = "form")
    private WebElement sendFormLocator;

    @FindBy (tagName = "")
    private WebElement helloLocator;

    //    рамка валидации почты
    @FindBy (xpath = "//*[contains(@class,'required email valid')]")
    private WebElement searchLocator;


    public boolean findLocator() {
        if (searchLocator != null) {
            return true;
        }
        else return false;
    }

    String headMsg = "Здравствуйте";





    public void lengButtonLocatorClick(){
        lengButtonLocator.click();
    }

    public FeedBackPage typeEmail(String email) {
        emailfieldLocator.sendKeys(email);
        return this;
    }


    public FeedBackPage submitForm() {
        sendFormLocator.submit();
            return new FeedBackPage(driver);
    }

    public void openMainPage(WebDriver driver) {
        driver.get("http://feedback.simbirsoft.com");
    }

    public boolean assertLang(){
        headLocator.getText().contains(headMsg);

        return false;
    }

}
