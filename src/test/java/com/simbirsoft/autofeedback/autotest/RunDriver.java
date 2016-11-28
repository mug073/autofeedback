package com.simbirsoft.autofeedback.autotest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 10.11.2016.
 */



public class RunDriver {


    public static WebDriver driver;

    @BeforeClass
    public static void setUp (){
        //для unix
        //System.setProperty("webdriver.chrome.driver", "/home/mug/autofeedback/libs/chromedriver");
        // Для windows
        System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



    }
    @AfterClass
    public static void driverDown(){
        driver.close();

    }






}
