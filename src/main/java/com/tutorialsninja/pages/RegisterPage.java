package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.UUID;

/**
 * Test name verifyThatUserRegisterAccountSuccessfully()
 * 3.1 Clickr on My Account Link.
 * 3.2 Call the method “selectMyAccountOptions” method and pass the parameter
 * “Register”
 * */
public class RegisterPage extends Utility {
    //Enter First Name
    By enterFirstName = (By.id("input-firstname"));
    public void enterFirstName(String firstName) {

        sendTextToElement(enterFirstName, firstName);
    }
    //Enter Last Name
    By enterLastName = (By.id("input-lastname"));
    public void enterLastName(String lastName) {

        sendTextToElement(enterLastName, lastName);
    }
    //Enter Email
    final String randomEmail = randomEmail();
    By emailAddressOption = (By.id("input-email"));
    public void enterEmailAddress(){

        sendTextToElement(emailAddressOption, randomEmail);
    }
    //Enter Telephone
    By phoneNumber = (By.id("input-telephone"));
    public void phoneNumber(String number) {
        sendTextToElement(phoneNumber, number);
    }
    //Enter Password
    By enterPassword = By.id("input-password");
    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }
    //Enter Password Confirm
    By enterConfirmPassword = (By.id("input-confirm"));
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(enterConfirmPassword, confirmPassword);
    }
    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }
    //Select Subscribe Yes radio button
    By subscribeYesRadioButton = (By.xpath("//label[normalize-space()='Yes']"));
    public void subscribeYesRadioButton(){
        clickOnElement(subscribeYesRadioButton);
    }
    //Click on Privacy Policy check box
    By clickOnPrivacyPolicyCheckBox = (By.xpath("//input[@name='agree']"));
    public void clickOnPrivacyPolicyCheckBox(){
        clickOnElement(clickOnPrivacyPolicyCheckBox);
    }
    //Click on Continue button

    By clickOnContinueButton = (By.xpath("//input[@value='Continue']"));
    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }
    //Verify the message “Your Account Has Been Created!”
    By verifyAccountHasBeenCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

    public String verifyAccountHasBeenCreatedText() {
        return getTextFromElement(verifyAccountHasBeenCreatedText);
    }
    //Click on Continue button
    By clickOnContinueButtonPostAccountCreation = (By.xpath("//a[normalize-space()='Continue']"));
    public void clickOnContinueButtonPostAccountCreation() {
        clickOnElement(clickOnContinueButtonPostAccountCreation);
    }

    By clickOnLogOut = (By.xpath("//a[normalize-space()='Logout']"));
    public void clickOnLogOut() {
        clickOnElement(clickOnLogOut);
    }
    //Verify the text “Account Logout”
    By verifyAccountLogoutText = By.xpath("//h1[normalize-space()='Account Logout']");
    public String verifyAccountLogoutText() {
        return getTextFromElement(verifyAccountLogoutText);
    }

    //Click on Continue button
    By clickOnContinuePostVerifyLogoutText = (By.xpath("//a[normalize-space()='Continue']"));
    public void clickOnContinuePostVerifyLogoutText() {

        clickOnElement(clickOnContinuePostVerifyLogoutText);
    }


}
