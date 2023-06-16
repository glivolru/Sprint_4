package ru.yandex.praktikum.pages;

import org.openqa.selenium.By;

public class LocatorsOnMainPage {
    //Кнопка "да все привыкли" для подтверждения куки
    public static final By cookieConfirmButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");
    //Кнопка "Заказать" в хедере
    public static final By firstOrderButton = By.xpath(".//div[2]/button[text()='Заказать']");
    //Вторая кнопка "Заказать"
    public static final By secondOrderButton = By.xpath(".//div[5]/button[text()='Заказать']");
    //Вопрос о стоимости
    public static final By questionAboutPrice = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    //Ответ на вопрос о стоимости
    public static final By answerAboutPrice = By.xpath(".//div[@aria-labelledby='accordion__heading-0']");
    //Вопрос о возможности получения нескольких самокатов
    public static final By questionAboutFewScooter = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    //Ответ на вопрос о возможности получения нескольких самокатов
    public static final By answerAboutFewScooter = By.xpath(".//div[@aria-labelledby='accordion__heading-1']");
    //Вопрос о расчете времени аренды
    public static final By questionAboutRentTime = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    //Ответ на вопрос о расчете времени аренды
    public static final By answerAboutRentTime = By.xpath(".//div[@aria-labelledby='accordion__heading-2']");
    //Вопрос о том можно ли заказать самокат прямо на сегодня
    public static final By questionAboutScooterToday = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    //Ответ на вопрос можно ли заказать самокат на сегодня
    public static final By answerAboutScooterToday = By.xpath(".//div[@aria-labelledby='accordion__heading-3']");
    //Вопрос о продлении заказа или возврате раньше
    public static final By questionAboutHowLong = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    //Ответ на вопрос о продлении или возврате заказа
    public static final By answerAboutHowLong = By.xpath(".//div[@aria-labelledby='accordion__heading-4']");
    //Вопрос о зарядке
    public static final By questionAboutCharge = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    //Ответ на вопрос о зарядке
    public static final By answerAboutCharge = By.xpath(".//div[@aria-labelledby='accordion__heading-5']");
    //Вопрос об отмене заказа
    public static final By questionAboutCancelOrder = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    //Ответ на вопрос об отмене заказа
    public static final By answerAboutCancelOrder = By.xpath(".//div[@aria-labelledby='accordion__heading-6']");
    //Вопрос привозят ли самокат за МКАД
    public static final By questionAboutMkad = By.xpath(".//div[@aria-controls='accordion__panel-7']");
    //Ответ на вопрос привозят ли самокат за МКАД
    public static final By answerAboutMkad = By.xpath(".//div[@aria-labelledby='accordion__heading-7']");

}
