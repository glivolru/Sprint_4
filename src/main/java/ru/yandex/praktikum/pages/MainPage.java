package ru.yandex.praktikum.pages;

import org.openqa.selenium.WebDriver;
import static ru.yandex.praktikum.pages.LocatorsOnMainPage.*;

public class MainPage {

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookieConfirmButton() {
        driver.findElement(cookieConfirmButton).click();
    }

    public void clickOrderButton(String button) {
        if (button.equals("first")) {
            driver.findElement(firstOrderButton).click();
        } else if (button.equals("second")) {
            driver.findElement(secondOrderButton).click();
        }
    }

}
