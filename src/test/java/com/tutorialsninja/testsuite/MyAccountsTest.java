package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyAccountsTest extends BaseTest {


    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AccountsPage accountsPage = new AccountsPage();





    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class = 'list-inline']//a"));
        for (WebElement list : options) {
            if (option.equalsIgnoreCase(list.getText())) {
                list.click();
                break;
            }
        }
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
        accountsPage.clickOnMyAccountsLink();
        selectMyAccountOptions("Register");
        Thread.sleep(2000);
        String expected = "Register Account";
        Assert.assertEquals(accountsPage.verifyRegisterText(), expected, "Error Message");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        accountsPage.clickOnMyAccountsLink();
        selectMyAccountOptions("Login");
        String expected1 = "Returning Customer";
        Assert.assertEquals(accountsPage.verifyReturningCustomerText(), expected1, "Error Message");
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //Reference Register page
        accountsPage.clickOnMyAccountsLink();
        selectMyAccountOptions("Register");
        registerPage.enterFirstName("Mahak");
        registerPage.enterLastName("Agarwal");
        registerPage.enterEmailAddress();
        registerPage.phoneNumber("07945997654");
        registerPage.enterPassword("Mahak123");
        registerPage.enterConfirmPassword("Mahak123");
        registerPage.subscribeYesRadioButton();
        registerPage.clickOnPrivacyPolicyCheckBox();
        registerPage.clickOnContinueButton();
        String expected = "Your Account Has Been Created!";
        Assert.assertEquals(registerPage.verifyAccountHasBeenCreatedText(), expected, "Error Message");
        registerPage.clickOnContinueButtonPostAccountCreation();
        accountsPage.clickOnMyAccountsLink();
        selectMyAccountOptions("Logout");
        String expected1 = "Account Logout";
        Assert.assertEquals(registerPage.verifyAccountLogoutText(),expected1,"Error Message");
        registerPage.clickOnContinuePostVerifyLogoutText();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        //Reference - Login page
        accountsPage.clickOnMyAccountsLink();
        selectMyAccountOptions("Login");
        loginPage.enterEmailAddress("Mahak123@gmail.com");
        loginPage.enterPassword("Mahak123");
        Thread.sleep(2000);
        loginPage.clickOnLoginButtonOnLoginPage();
        String expected2 = "My Account";
        Assert.assertEquals(loginPage.verifyMyAccountText(),expected2,"Error Message");
        loginPage.clickOnMyAccountsTabOnAccountsPage();
        Thread.sleep(2000);
        selectMyAccountOptions("Logout");
        String expected3 = "Account Logout";
        Assert.assertEquals(loginPage.verifyMyAccountLogoutText(),expected3,"Error Message");
        loginPage.clickOnContinueOnLastPage();
        Thread.sleep(2000);
    }
}
