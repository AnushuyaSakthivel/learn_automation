package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        driver.get("https://portal.document360.info/9f0f5279-9b63-4e1d-8689-70848f25b107/document/v1/category/682e0579-aecb-4b7f-94a7-fe53a03ff80a");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("https://www.k7computing.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.)
        driver.navigate().back();
        System.out.println(driver.getTitle());
       // System.out.println(driver.getPageSource());

         */
        driver.get("https://portal.document360.net");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("form-control inputValidate")).sendKeys("anushuyadevi.sakthivel@kovai.co");

    }
}
