package ru.yandex.praktikum.pages;

import org.openqa.selenium.By;

public class LocatorsOnOrderScooterPages {
    //Поле для заполнения "Имя"
    public static final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //Поле для заполнения "Фамилия"
    public static final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //Поле для заполнения "Адрес: куда привезти заказ"
    public static final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //Поле для заполнения "Станция метро"
    public static final By subwayField = By.xpath(".//input[@placeholder='* Станция метро']");
    //Локатор для клика на выбранную станцию метро
    public static final By subwayChosen = By.cssSelector("li.select-search__row");
    //Поле для заполнения "Телефон: на него позвонит курьер"
    public static final By phoneNumberField = By.xpath
            (".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    public static final By nextButton = By.xpath(".//button[text()='Далее']");
    //Поле для заполнения "Когда привезти самокат"
    public static final By orderDateField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //Поле для заполнения "Срок аренды"
    public static final By dropdownOrderDay = By.className("Dropdown-placeholder");
    //Срок аренды сутки
    public static final By timeOrderDay = By.xpath(".//div[text()='сутки']");
    //Срок аренды двое суток
    public static final By timeOrderTwoDay = By.xpath(".//div[text()='двое суток']");
    //Чекбокс "чёрный жемчуг"
    public static final By colorScooterBlack = By.xpath(".//label[@for='black']");
    //Чекбокс "серая безысходность"
    public static final By colorScooterGrey = By.xpath(".//label[@for='grey']");
    //Кнопка "Заказать"
    public static final By finalOrderButton = By.xpath(".//div[3]/button[2]");
    //Комментарий для курьера
    public static final By commentForCourier = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //Модалка "Заказ оформлен" об успешном статусе заказа
    public static final By modalOrderCompleted = By.className("Order_Modal__YZ-d3");
}
