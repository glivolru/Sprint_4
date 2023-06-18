package ru.yandex.praktikum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionsAndAnswersOnMainPage {
    //Вопрос о стоимости
    private final By questionAboutPrice = By.xpath(".//div[@aria-controls='accordion__panel-0']");
    //Ответ на вопрос о стоимости
    private final By answerAboutPrice = By.xpath(".//div[@aria-labelledby='accordion__heading-0']");
    //Вопрос о возможности получения нескольких самокатов
    private final By questionAboutFewScooter = By.xpath(".//div[@aria-controls='accordion__panel-1']");
    //Ответ на вопрос о возможности получения нескольких самокатов
    private final By answerAboutFewScooter = By.xpath(".//div[@aria-labelledby='accordion__heading-1']");
    //Вопрос о расчете времени аренды
    private final By questionAboutRentTime = By.xpath(".//div[@aria-controls='accordion__panel-2']");
    //Ответ на вопрос о расчете времени аренды
    private final By answerAboutRentTime = By.xpath(".//div[@aria-labelledby='accordion__heading-2']");
    //Вопрос о том можно ли заказать самокат прямо на сегодня
    private final By questionAboutScooterToday = By.xpath(".//div[@aria-controls='accordion__panel-3']");
    //Ответ на вопрос можно ли заказать самокат на сегодня
    private final By answerAboutScooterToday = By.xpath(".//div[@aria-labelledby='accordion__heading-3']");
    //Вопрос о продлении заказа или возврате раньше
    private final By questionAboutHowLong = By.xpath(".//div[@aria-controls='accordion__panel-4']");
    //Ответ на вопрос о продлении или возврате заказа
    private final By answerAboutHowLong = By.xpath(".//div[@aria-labelledby='accordion__heading-4']");
    //Вопрос о зарядке
    private final By questionAboutCharge = By.xpath(".//div[@aria-controls='accordion__panel-5']");
    //Ответ на вопрос о зарядке
    private final By answerAboutCharge = By.xpath(".//div[@aria-labelledby='accordion__heading-5']");
    //Вопрос об отмене заказа
    private final By questionAboutCancelOrder = By.xpath(".//div[@aria-controls='accordion__panel-6']");
    //Ответ на вопрос об отмене заказа
    private final By answerAboutCancelOrder = By.xpath(".//div[@aria-labelledby='accordion__heading-6']");
    //Вопрос привозят ли самокат за МКАД
    private final By questionAboutMkad = By.xpath(".//div[@aria-controls='accordion__panel-7']");
    //Ответ на вопрос привозят ли самокат за МКАД
    private final By answerAboutMkad = By.xpath(".//div[@aria-labelledby='accordion__heading-7']");


    private final WebDriver driver;
    private final WebDriverWait wait;

    public QuestionsAndAnswersOnMainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    private void waitForClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    private void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void checkAllDropdown(int questionIndex, String expectedResult) {
        By[] question = {questionAboutPrice, questionAboutFewScooter, questionAboutRentTime, questionAboutScooterToday,
                questionAboutHowLong, questionAboutCharge, questionAboutCancelOrder, questionAboutMkad};
        By[] answer = {answerAboutPrice, answerAboutFewScooter, answerAboutRentTime, answerAboutScooterToday,
                answerAboutHowLong, answerAboutCharge, answerAboutCancelOrder, answerAboutMkad};
        for (int i = 0; i < answer.length; i++) {
            WebElement questionElement = driver.findElement(question[questionIndex]);
            scrollToElement(driver, questionElement);
            waitForClickable(questionElement);
            questionElement.click();
            WebElement answerElement = driver.findElement(answer[questionIndex]);
            waitForVisibility(answerElement);
            String actualResult = answerElement.getText();
            Assert.assertEquals("Текст не сходится", expectedResult, actualResult);
        }
    }
}
