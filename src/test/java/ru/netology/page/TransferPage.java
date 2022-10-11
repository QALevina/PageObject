package ru.netology.page;;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement heading = $("[data-test-id=dashboard]");

    private static SelenideElement amountField = $("[data-test-id=\"amount\"] .input__control");
    private static SelenideElement whereFrom = $("[data-test-id=\"from\"] input");
    private static SelenideElement button = $("[data-test-id=\"action-transfer\"] .button__text");
    private SelenideElement errorNotification = $("[data-test-id=\"error-notification\"] .notification__content");


    public void TransferPage() {
        heading.shouldBe(visible);
    }

    public static DashboardPage transferCardToCard(String amount, DataHelper.Card from) {
        amountField.click();
        amountField.setValue(amount);
        whereFrom.click();
        whereFrom.setValue(from.getNumber());
        button.click();
        return new DashboardPage();
    }


}

