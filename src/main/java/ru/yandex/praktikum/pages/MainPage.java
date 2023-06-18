package ru.yandex.praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    //Кнопка "да все привыкли" для подтверждения куки
    private final By cookieConfirmButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");
    //Кнопка "Заказать" в хедере
    private final By firstOrderButton = By.xpath(".//div[2]/button[text()='Заказать']");
    //Вторая кнопка "Заказать"
    private final By secondOrderButton = By.xpath(".//div[5]/button[text()='Заказать']");

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
