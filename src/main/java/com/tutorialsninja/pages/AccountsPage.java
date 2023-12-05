package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountsPage extends Utility {
    public void selectMyAccountOptions(String option) {
        List<WebElement> options = driver.findElements(By.xpath("//ul[@class = 'list-inline']//a"));
        for (WebElement list : options) {
            if (option.equalsIgnoreCase(list.getText())) {
                list.click();
                break;
            }
        }
    }
    By clickOnMyAccountsLink = (By.xpath("//span[text()='My Account']"));
    public void clickOnMyAccountsLink(){
        clickOnElement(clickOnMyAccountsLink);
    }
    By clickOnRegister = (By.xpath("//a[normalize-space()='Register']"));
    public void clickOnRegister(){

        clickOnElement(clickOnRegister);
    }
    By verifyRegisterText = By.xpath("//h1[normalize-space()='Register Account']");

    public String verifyRegisterText() {

        return getTextFromElement(verifyRegisterText);
    }
    By clickOnLogin = (By.xpath("(//a[normalize-space()='Login'])[1]"));
    public void clickOnLogin() {
        clickOnElement(clickOnLogin);
    }
    By verifyReturningCustomerText = By.xpath("//h2[normalize-space()='Returning Customer']");
    public String verifyReturningCustomerText() {
        return getTextFromElement(verifyReturningCustomerText);
    }
}
