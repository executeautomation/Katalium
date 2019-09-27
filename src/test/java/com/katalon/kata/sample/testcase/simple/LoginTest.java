package com.katalon.kata.sample.testcase.simple;

import com.katalon.kata.sample.Constants;
import com.katalon.kata.sample.page.HomePage;
import com.katalon.kata.sample.page.LoginPage;
import com.katalon.kata.testng.TestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestTemplate {


  private HomePage eaHomePage = new HomePage(Constants.baseUrl);
  
  private LoginPage eaLoginPage;

  @Test
  public void shouldLogin() {
    eaHomePage.open();
    eaHomePage.clickLogin();
    eaLoginPage.login(Constants.username, Constants.password);
    boolean exist = eaHomePage.isOnPage();
    Assert.assertTrue(exist);
    driver.quit();
  }

  @Test
  public void LoginWithWrongPassword() {
    eaHomePage.open();
    eaHomePage.clickLogin();
    eaLoginPage.login(Constants.username, Constants.password + "232");
    boolean exist = eaHomePage.isOnPage();
    Assert.assertFalse(exist);
    driver.quit();
  }
}
