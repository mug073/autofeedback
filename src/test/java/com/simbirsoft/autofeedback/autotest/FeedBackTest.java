package com.simbirsoft.autofeedback.autotest;

import org.junit.Test;


/**
 * Created by user on 11.11.2016.
 */
public class FeedBackTest extends RunDriver {

    FeedBackPage feedBackPage = new FeedBackPage(driver);

    //-----------Определение языка-----------
    //нажать кнопку html/body/section/form/a
    //прочитать заголовок еще раз. не должны быть равнен значению по умолчанию
    @Test
    public void case00() throws Exception  {
        testCase("lang test");
    }



    //-----------Валидация почтового адреса (позитивный тест)-----------
    //Определяем корректность почты по наличию красной рамки
    //присваиваем полю корректное значение, читаем цвет рамки
    @Test
    public void case01() throws Exception  {

        testCase("mail test");

    }



    public void testCase(String caseDirectory) throws Exception{
        BaseTestMethods  baseTestMethods= new BaseTestMethods();

        if (caseDirectory.equals("lang test")){
            baseTestMethods.runCase00(driver);
        }
        else if (caseDirectory.equals("mail test")){
            baseTestMethods.runCase01(driver);
        }
    }


}
