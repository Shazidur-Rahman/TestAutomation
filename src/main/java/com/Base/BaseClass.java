package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {

    public static WebDriver driver;

    public static void main(String[] args) {
        //chrome_launce();
        //open_URL();
        //opera_launce();
        firefox_launce();
        open_URL();
        //edge_launce();
        //chrome_close();
        //opera_close();
        firefox_close();
        //edge_close();
    }
    public static  void chrome_launce(){
        System.setProperty("webdriver.chrome.driver","G:\\TestAutomation\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static  void opera_launce(){
        System.setProperty("webdriver.opera.driver","G:\\TestAutomation\\src\\main\\resources\\Drivers\\operadriver.exe");
        driver = new OperaDriver();
    }
    public static  void firefox_launce(){
        System.setProperty("webdriver.gecko.driver","G:\\TestAutomation\\src\\main\\resources\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }
    public static  void edge_launce(){
        System.setProperty("webdriver.edge.driver","G:\\TestAutomation\\src\\main\\resources\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
    }
    public static  void chrome_close(){
        driver.close();
    }
    public static  void firefox_close(){
        driver.close();
    }
    public static  void opera_close(){
        driver.close();
    }
    public static  void edge_close(){
        driver.close();
    }
    public static  void chrome_quit(){driver.quit();}
    public static  void firefox_quit(){
        driver.quit();
    }
    public static  void opera_quit(){
        driver.quit();
    }
    public static  void edge_quit(){
        driver.quit();
    }
    public static void open_URL(){
        driver.get("http://www.google.com");
    }
}
