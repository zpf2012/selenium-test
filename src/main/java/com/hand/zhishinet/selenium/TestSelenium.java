package com.hand.zhishinet.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @Author Created by zhangpengfei.
 * @CreatedOn: 2017/9/26 下午7:00.
 * @Description: seleniummvn
 * @Version: 1.0
 * @ModifyBy:
 */
public class TestSelenium {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.baidu.com/");

        driver.manage().window().maximize();

        WebElement txtbox = driver.findElement(By.name("wd"));
        txtbox.sendKeys("Glen");

        WebElement btn = driver.findElement(By.id("su"));
        btn.click();

        driver.close();
    }
}
