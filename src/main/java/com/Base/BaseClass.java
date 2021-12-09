package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void main(String[] args) {
        //chrome_launce();
        opera_launce();

    }
    public static  void chrome_launce(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static  void opera_launce(){
        System.setProperty("webdriver.opera.driver","./src/main/resources/Driver/operadriver.exe");
        driver = new OperaDriver();
    }
}
