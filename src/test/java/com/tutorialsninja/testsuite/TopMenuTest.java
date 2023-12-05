package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();


    @Test
    public void verifyPageNavigation() {
        String expectedMessage = "Desktops\n" +
                "Laptops & Notebooks\n" +
                "Components\n" +
                "Tablets\n" +
                "Software\n" +
                "Phones & PDAs\n" +
                "Cameras\n" +
                "MP3 Players";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, expectedMessage, "Top menu is not displayed");
        System.out.println(expectedMessage);
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.mouseHoverOnDesktopTab();
        homePage.clickOnDesktopTab();
        homePage.findAllTabsInTopMenu();
        homePage.clickOnShowAllDesktops();
        String expected = "Desktops";
        Assert.assertEquals(desktopsPage.verifyDesktopTextOnDesktopPage(), expected, "Error message");


    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homePage.mouseHoverOnLaptopsAndNotebooksTab();
        homePage.clickOnLaptopsAndNotebooksTab();
        homePage.clickOnShowAllLaptopsAndNotebooks();
        String expected1 = "Laptops & Notebooks";
        Assert.assertEquals(laptopsAndNotebooksPage.verifyLaptopsAndNotebooksText(), expected1, "Error Message");


    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverOnComponents();
        homePage.clickOnComponents();
        homePage.clickOnShowAllComponents();
        String expected2 = "Components";
        Assert.assertEquals(homePage.verifyComponentsText(),expected2,"Error Message");
    }
}
