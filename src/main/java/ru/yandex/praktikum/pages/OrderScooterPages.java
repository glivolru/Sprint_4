package ru.yandex.praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderScooterPages {
    //Поле для заполнения "Имя"
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //Поле для заполнения "Фамилия"
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле для заполнения "Адрес: куда привезти заказ"
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле для заполнения "Станция метро"
    private final By subwayField = By.xpath(".//input[@placeholder='* Станция метро']");
    //Локатор для клика на выбранную станцию метро
    private final By subwayChosen = By.cssSelector("li.select-search__row");
    //Поле для заполнения "Телефон: на него позвонит курьер"
    private final By phoneNumberField = By.xpath
            (".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    //Поле для заполнения "Когда привезти самокат"
    private final By orderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Поле для заполнения "Срок аренды"
    private final By dropdownOrderDay = By.className("Dropdown-placeholder");
    //Срок аренды сутки
    private final By timeOrderDay = By.xpath(".//div[text()='сутки']");
    //Срок аренды двое суток
    private final By timeOrderTwoDay = By.xpath(".//div[text()='двое суток']");
    //Чекбокс "чёрный жемчуг"
    private final By colorScooterBlack = By.xpath(".//label[@for='black']");
    //Чекбокс "серая безысходность"
    private final By colorScooterGrey = By.xpath(".//label[@for='grey']");
    //Кнопка "Заказать"
    private final By finalOrderButton = By.xpath(".//div[3]/button[2]");
    //Комментарий для курьера
    private final By commentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Модалка "Заказ оформлен" об успешном статусе заказа
    private final By modalOrderCompleted = By.className("Order_Modal__YZ-d3");

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
