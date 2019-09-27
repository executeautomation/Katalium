package com.katalon.kata.sample.page;

import com.katalon.kata.selenium.PageTemplate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageTemplate {

  @FindBy(id = "UserName")
  private WebElement txtUserName;

  @FindBy(id = "Password")
  private WebElement txtPassword;

  @FindBy(css = ".btn-default")
  private WebElement btnLogin;

  public void login(String username, String password) {
    log.info("Log in.");
    txtUserName.sendKeys(username);
    txtPassword.sendKeys(password);
    btnLogin.submit();
    log.info("Login successful !");
  }
}
