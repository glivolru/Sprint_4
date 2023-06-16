package ru.yandex.praktikum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static ru.yandex.praktikum.pages.LocatorsOnMainPage.*;

public class QuestionsAndAnswersOnMainPage {

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
