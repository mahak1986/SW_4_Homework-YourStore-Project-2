package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookCheckOutPage extends Utility {

    By verifyCheckOutText = By.xpath("//h1[normalize-space()='Checkout']");
    public String verifyCheckOutText(){
        return getTextFromElement(verifyCheckOutText);

    }
    By VerifyNewCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    public String VerifyNewCustomerText() {
        return getTextFromElement(VerifyNewCustomerText);
    }
    By clickOnGuestCheckoutRadioButton = (By.xpath("//input[@value='guest']"));
    public void clickOnGuestCheckoutRadioButton(){
        clickOnElement(clickOnGuestCheckoutRadioButton);
    }
    By clickOnContinueTabOnCheckOutPage = (By.xpath("//input[@id='button-account']"));
    public void clickOnContinueTabOnCheckOutPage() {
        clickOnElement(clickOnContinueTabOnCheckOutPage);
    }
    By firstNameOption = (By.id("input-payment-firstname"));

    public void enterFirstName(String firstName) {

        sendTextToElement(firstNameOption, firstName);
    }
    By lasttNameOption = (By.id("input-payment-lastname"));

    public void enterlastName(String lastName) {

        sendTextToElement(lasttNameOption, lastName);
    }

    By emailOption = (By.id("input-payment-email"));

    public void enterEmail(String email) {

        sendTextToElement(emailOption, email);
    }
    By phoneNumberOption = (By.id("input-payment-telephone"));

    public void enterPhoneNumber(String phoneNumber) {

        sendTextToElement(phoneNumberOption, phoneNumber);
    }
    By enterAddress = (By.id("input-payment-address-1"));

    public void enterAddress(String address) {

        sendTextToElement(enterAddress, address);
    }
    By enterCity = (By.id("input-payment-city"));

    public void enterCity(String city) {

        sendTextToElement(enterCity, city);
    }
    By enterPostcode = (By.id("input-payment-postcode"));

    public void enterPostcode(String postcode) {

        sendTextToElement(enterPostcode, postcode);
    }
    By clickOnCountry = By.id("input-payment-country");
    public void clickOnCountry(){
        clickOnElement(clickOnCountry);
    }
    By enterCountry = (By.id("input-payment-country"));

    public void enterCountry(String value) {
        selectByVisibleText(enterCountry, value);//value is 222
    }

    By inputState = By.id("input-payment-zone");
    public void inputState() {
        clickOnElement(inputState);
    }
    By enterRegion = (By.id("input-payment-zone"));

    public void enterRegion(String name) {
        selectByVisibleText(enterRegion, name);
    }
    By clickOnContinueTabOnCheckOutPage1 = (By.id("button-guest"));
    public void clickOnContinueTabOnCheckOutPage1(){
        clickOnElement(clickOnContinueTabOnCheckOutPage1);
    }
    By addCommentsOnCheckOutPage = (By.xpath("//textarea[@class = 'form-control']"));
    public void addCommentsOnCheckOutPage(String comment) {

        sendTextToElement(addCommentsOnCheckOutPage, comment);
    }
    By clickOnTermsAndConditions = (By.xpath("//input[@type='checkbox']"));
    public void clickOnTermsAndConditions(){
        clickOnElement(clickOnTermsAndConditions);

    }
    By clickOnContinueButtonPostCommentButton = (By.id("button-payment-method"));
    public void clickOnContinueButtonPostCommentButton(){
        clickOnElement(clickOnContinueButtonPostCommentButton);
    }
    By verifyPaymentMethodRequiredText = (By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    public String verifyPaymentMethodRequiredText() {
        return getTextFromElement(verifyPaymentMethodRequiredText);
    }

}
