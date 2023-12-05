package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.UUID;

public class LoginPage extends Utility {
    //Click on My Account Link.
    By clickOnMyAccountsLink = (By.xpath("//span[text()='My Account']"));
    public void clickOnMyAccountsLink(){

        clickOnElement(clickOnMyAccountsLink);
    }

    //Click on login link
    By clickOnLoginLink = (By.xpath("//a[normalize-space()='Login']"));
    public void clickOnLoginLink() {

        clickOnElement(clickOnLoginLink);
    }
    //Enter Email address
    By enterEmailAddress = (By.id("input-email"));
    public void enterEmailAddress(String email) {

        sendTextToElement(enterEmailAddress, email);
    }

    //Enter Password
    By enterPassword = (By.id("input-password"));
    public void enterPassword(String password) {

        sendTextToElement(enterPassword, password);
    }
    //Click on Login button

    By clickOnLoginButtonOnLoginPage = (By.xpath("//input[@value='Login']"));
    public void clickOnLoginButtonOnLoginPage(){

        clickOnElement(clickOnLoginButtonOnLoginPage);
    }

    //Verify text “My Account”
    By verifyMyAccountText = (By.xpath("//h2[contains(text(),'My Account')]"));

    public String verifyMyAccountText() {

        return getTextFromElement(verifyMyAccountText);
    }
    //Click on My Account Link.
    By clickOnMyAccountsTabOnAccountsPage = (By.xpath("//span[contains(text(),'My Account')]"));
    public void clickOnMyAccountsTabOnAccountsPage() {

        clickOnElement(clickOnMyAccountsTabOnAccountsPage);
    }
    By clickOnLogoutOnLastPage = (By.xpath("(//a[normalize-space()='Logout'])[1]"));
    public void clickOnLogoutOnLastPage() {

        clickOnElement(clickOnLogoutOnLastPage);
    }

    //Verify the text “Account Logout”
    By verifyMyAccountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");

    public String verifyMyAccountLogoutText() {

        return getTextFromElement(verifyMyAccountLogoutText);
    }
    //Click on Continue button
    By clickOnContinueOnLastPage = (By.xpath("//a[text()='Continue']"));
    public void clickOnContinueOnLastPage() {
        clickOnElement(clickOnContinueOnLastPage);
    }
    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }
}
