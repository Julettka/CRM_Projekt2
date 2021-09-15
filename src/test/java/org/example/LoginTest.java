package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() {
        loginPage.loginClick();
        loginPage.loginIn(ConfProperties.getProperty("log"));
        Assert.assertEquals("Applanatest1", ConfProperties.getProperty("log"));
        loginPage.passClick();
        loginPage.passIn(ConfProperties.getProperty("password"));
        Assert.assertEquals("Student2020!", ConfProperties.getProperty("password"));
        loginPage.btn1Click();
        loginPage.kontragentsClick();
        loginPage.kontaktClick();
        String title1 = driver.getTitle();
        Assert.assertEquals("Панель инструментов", title1);
        loginPage.kontaktCreateClick();
        loginPage.lastNameClick();
        loginPage.lastName1In(ConfProperties.getProperty("lastnm"));
        Assert.assertEquals("petrov", ConfProperties.getProperty("lastnm"));
        loginPage.firstNameClick();
        loginPage.firstNameIn(ConfProperties.getProperty("firstnm"));
        Assert.assertEquals("ivan", ConfProperties.getProperty("firstnm"));
        loginPage.btn2Click();
        loginPage.organizationClick();
        loginPage.organization1Click();
        loginPage.organization2Click();
        String title2 = driver.getTitle();
        Assert.assertEquals("Создать контактное лицо - Контактные лица - Контрагенты", title2);
        loginPage.jobClick();
        loginPage.jobIn(ConfProperties.getProperty("prof"));
        loginPage.btn3Click();
        loginPage.btn4Click();
    }
}
