package com.simbirsoft.autofeedback.autotest.helpers;

import java.util.UUID;

/**
 * Created by user on 14.11.2016.
 */
public class EmailHelper {




    //эта прикольная функция генерирует почтовый адрес из случайного набора чисел
    public String emailGeneration() {
        String uuid = UUID.randomUUID().toString();
        String rndmail = uuid + "@thismail.ru";
        return rndmail;
    }
}
