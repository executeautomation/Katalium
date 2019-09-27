package com.katalon.kata.sample.page;

import com.katalon.kata.selenium.PageTemplate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageTemplate {

  private String baseUrl;

  @FindBy(linkText = "Login")
  private WebElement lnkLogin;

  @FindBy(linkText = "Employee List")
  private WebElement lnkEmployeeList;

  @FindBy(linkText = "Home")
  private WebElement lnkHome;

  @FindBy(linkText = "Employee Details")
  private WebElement lnkEmployeeDetails;

  public HomePage(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  public boolean isOnPage() {
    log.info("In home page");
    return lnkEmployeeDetails.isDisplayed();
  }

  public void open() {
    log.info("Open EA home page.");
    driver.get(baseUrl);
  }

  public void clickLogin() {
    log.info("click Login.");
    lnkLogin.click();
  }

  public void clickEmployeeList() {
    log.info("click Login.");
    lnkLogin.click();
  }
}