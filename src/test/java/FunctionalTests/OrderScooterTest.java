package FunctionalTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.pages.MainPage;
import ru.yandex.praktikum.pages.OrderScooterPages;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrderScooterTest extends BaseTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String subway;
    private final String phoneNumber;
    private final String date;
    private final String button;
    private final String colour;
    private final String day;
    private final String comment;

    public OrderScooterTest(String name, String surname, String address,
                            String subway, String phoneNumber, String date,
                            String button, String colour, String day, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.subway = subway;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.button = button;
        this.colour = colour;
        this.day = day;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"Иван", "Глушенков", "ул.Новоалексеевская 18к1", "Алексеевская", "+77778889900",
                        "22.12.2022", "first", "black", "one day", "Домофон не работает, позвоните."},
                {"Андрей", "Первозванный", "ул.Пушкина дом Колотушкина", "Сокол", "+78005553535",
                        "11.06.2022", "second", "grey", "two day", "Ты сегодня милашка!"}
        });
    }

    @Test
    public void checkTest() {
        MainPage objMainPage = new MainPage(driver);
        OrderScooterPages orderScooterPages = new OrderScooterPages(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        objMainPage.clickCookieConfirmButton();
        objMainPage.clickOrderButton(button);

        orderScooterPages.typeName(name);
        orderScooterPages.typeSurname(surname);
        orderScooterPages.typeAddress(address);
        orderScooterPages.typeSubway(subway);
        orderScooterPages.typePhoneNumber(phoneNumber);
        orderScooterPages.clickNextButton();
        orderScooterPages.typeOrderDate(date);
        orderScooterPages.clickColorSelection(colour);
        orderScooterPages.clickOrderDay(day);
        orderScooterPages.typeCommentForCourier(comment);
        orderScooterPages.clickFinalOrderButton();
        assertEquals(true, orderScooterPages.isModalOrderCompletedDisplayed());
    }
}