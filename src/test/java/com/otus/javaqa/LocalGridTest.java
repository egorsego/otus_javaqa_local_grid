package com.otus.javaqa;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LocalGridTest {

    private WebDriver driver;

    @Test
    public void otusPageTitleNotEmptyTest(){
        ChromeOptions chromeOptions = new ChromeOptions();
        try {
             driver = new RemoteWebDriver(new URL("http://192.168.1.20:4444/wd/hub"), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.get("https://otus.ru/");
        String pageTitle = driver.getTitle();
        assertTrue(!pageTitle.equals(""));
        driver.quit();
    }
}