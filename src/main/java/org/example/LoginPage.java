package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "prependedInput")
    private WebElement login;

    @FindBy(id = "prependedInput2")
    private WebElement pass;

    @FindBy(id = "_submit")
    private WebElement btn1;

    @FindBy(xpath = "//a[@class=\'unclickable\']/*[contains(text(),\'Контрагенты\')]//..")
    private WebElement kontragents;

    @FindBy(css = ".first .last .title")
    private WebElement kontakt;

    @FindBy(css = ".back")
    private WebElement kontaktCreate;

    @FindBy(xpath = "//*[@name=\'crm_contact[lastName]\']")
    private WebElement lastName;

    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastName1;

    @FindBy(xpath = "//*[@name=\'crm_contact[firstName]\']")
    private WebElement firstName;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstName1;

    @FindBy(css = ".responsive-cell:nth-child(1) > .control-group:nth-child(4) > .controls")
    private WebElement btn2;

    @FindBy(css = ".select2-chosen")
    private WebElement organization;

    @FindBy(css = ".select2-input")
    private WebElement organization1;

    @FindBy(tagName = "body")
    private WebElement organization2;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement job;

    @FindBy(css = ".responsive-cell:nth-child(2) > .control-group:nth-child(3) > .controls")
    private WebElement btn3;

    @FindBy(css = ".btn-group:nth-child(4) > .btn")
    private WebElement btn4;

    public void loginClick() {
        login.click();
    }

    public void loginIn(String log) {
        login.sendKeys(log);
    }

    public void passClick() {
        pass.click();
    }

    public void passIn(String password) {
        pass.sendKeys(password);
    }

    public void btn1Click() {
        btn1.click();
    }

    public void kontragentsClick() {
        kontragents.click();
    }

    public void kontaktClick() {
        kontakt.click();
    }

    public void kontaktCreateClick() {
        kontaktCreate.click();
    }

    public void lastNameClick() {
        lastName.click();
    }

    public void lastName1In(String lastnm) {
        lastName1.sendKeys(lastnm);
    }

    public void firstNameClick() {
        firstName.click();
    }

    public void firstNameIn(String firstnm) {
        firstName1.sendKeys(firstnm);
    }

    public void btn2Click() {
        btn2.click();
    }

    public void organizationClick() {
        organization.click();
    }

    public void organization1Click() {
        organization1.click();
    }

    public void organization2Click() {
        organization2.click();
    }

    public void jobClick() {
        job.click();
    }

    public void jobIn(String prof) {
        job.sendKeys(prof);
    }

    public void btn3Click() {
        btn3.click();
    }

    public void btn4Click() {
        btn4.click();
    }

}
