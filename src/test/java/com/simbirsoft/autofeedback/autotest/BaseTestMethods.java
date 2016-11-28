package com.simbirsoft.autofeedback.autotest;

import com.simbirsoft.autofeedback.autotest.helpers.HelperManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created by mug on 14.11.16.
 */
public class BaseTestMethods extends RunDriver {
    HelperManager manager = new HelperManager();
    public String emailData = manager.getEmailHelper().emailGeneration(); // "test@simbirsoft.com";

    private FeedBackPage feedBackPage = new FeedBackPage(driver);

    public void runCase00 (WebDriver driver) throws Exception{

        feedBackPage.openMainPage(driver);

        //тыкаем на кнопку языка
        feedBackPage.lengButtonLocatorClick();
        Assert.assertFalse(feedBackPage.assertLang());
        System.out.println("Тест 00 на определение языка пройден");
    }

    public void runCase01 (WebDriver driver) throws Exception{
        //открываем страницу
        feedBackPage.openMainPage(driver);
        //тыкаем по кнопке отправить
        feedBackPage.submitForm();

        //заполняем форму почты
        feedBackPage.typeEmail(emailData);

        //проверяем что по данному пути есть строчка с valid
        Assert.assertTrue(feedBackPage.findLocator());
        System.out.println("Тест 01 на валиадность почты пройден");


    }


}
