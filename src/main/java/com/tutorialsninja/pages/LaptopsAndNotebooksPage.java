package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {

    By verifyLaptopsAndNotebooksText = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    public String verifyLaptopsAndNotebooksText() {
        return getTextFromElement(verifyLaptopsAndNotebooksText);
    }

    By productNameInAplhabeticalOrder = By.id("input-sort");

    public void productNameInAplhabeticalOrder(String highLow) {
        selectByVisibleText(productNameInAplhabeticalOrder, highLow);
    }

    By clickOnMacBook = (By.xpath("//a[text()='MacBook']"));

    public void clickOnMacBook() {
        clickOnElement(clickOnMacBook);
    }

    By verifyMacBookText = (By.xpath("//h1[normalize-space()='MacBook']"));

    public String verifyMacBookText() {
        return getTextFromElement(verifyMacBookText);

    }
}
