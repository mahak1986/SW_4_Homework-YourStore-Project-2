package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HPLP3065CheckOutPage extends Utility {

    By verifyHPLP3065ProductNameOnCheckOutPage = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");

    public String verifyHPLP3065ProductNameOnCheckOutPage() {
        return getTextFromElement(verifyHPLP3065ProductNameOnCheckOutPage);
    }

    By verifyDeliveryDate = (By.xpath("//small[normalize-space()='Delivery Date:2027-11-23']"));

    public String verifyDeliveryDate() {
        return getTextFromElement(verifyDeliveryDate);
    }

    By verifyByModel21 = By.xpath("//td[normalize-space()='Product 21']");

    public String verifyByModel21() {
        return getTextFromElement(verifyByModel21);
    }

    By verifyTotalPrice = By.xpath("(//td[contains(text(),'£74.73')])[4]");

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);

    }
}
