package com.simbirsoft.autofeedback.autotest.helpers;

/**
 * Created by user on 14.11.2016.
 */
public class HelperManager {
    EmailHelper email;

    public EmailHelper getEmailHelper() {
        if (email == null) {
            email= new EmailHelper();
        }
        return email;
    }

}
