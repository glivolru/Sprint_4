package ru.yandex.praktikum.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static ru.yandex.praktikum.pages.LocatorsOnOrderScooterPages.*;

public class OrderScooterPages {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public OrderScooterPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void typeName(String name) {
        wait.until(ExpectedConditions.elementToBeClickable(nameField));
        driver.findElement(nameField).sendKeys(name);
    }

    public void typeSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void typeAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void typeSubway(String subway) {
        driver.findElement(subwayField).sendKeys(subway);
        driver.findElement(subwayChosen).click();
    }

    public void typePhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void typeOrderDate(String date) {
        driver.findElement(orderDateField).sendKeys(date);
    }

    public void clickOrderDay(String day) {
        driver.findElement(dropdownOrderDay).click();
        if (day.equals("one day")) {
            driver.findElement(timeOrderDay).click();
        } else if (day.equals("two day")) {
            driver.findElement(timeOrderTwoDay).click();
        }

    }

    public void clickColorSelection(String color) {
        if (color.equals("black")) {
            driver.findElement(colorScooterBlack).click();
        } else if (color.equals("grey")) {
            driver.findElement(colorScooterGrey).click();
        }
    }

    public void typeCommentForCourier(String comment) {
        driver.findElement(commentForCourier).sendKeys(comment);
    }

    public void clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
    }

    public boolean isModalOrderCompletedDisplayed() {
        return driver.findElement(modalOrderCompleted).isDisplayed();
    }
}
