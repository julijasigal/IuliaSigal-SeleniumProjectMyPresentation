package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchOzonTests {
    WebDriver wd;


    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://www.ozon.ru/");

    }

    @Test
    public void searchFromNavMenuTest(){
       //click on supermarket
        wd.findElement(By.cssSelector("li a[href=\"/category/knigi-16500/\"]")).click();

        //get page title
        String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
        System.out.println(pageTitle);

        wd.findElement(By.cssSelector("a[href=\"/highlight/38672/\"][class=\"c6a3\"]")).click();

        String pageTitle1 = wd.findElement(By.cssSelector("h1")).getText();
        System.out.println(pageTitle1);

       // wd.findElement(By.cssSelector("div[class=\"ui-k8 ui-m ui-m5 ui-l4 ui-m8\"] span ")).click();

        //String pageTitle2 =wd.findElement(By.cssSelector("[href=\"/highlight/38672/?category=16501\"]")).getText();
       // System.out.println(pageTitle2);







    }


    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();

    }
}
