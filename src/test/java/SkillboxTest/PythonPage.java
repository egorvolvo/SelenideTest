package SkillboxTest;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.WebDriverRunner.url;

public class PythonPage {
 private final SelenideElement inputName = $x("//input[@name=\"name\"]");
 private final SelenideElement inputPhone = $x("//input[@name=\"phone\"]");
 private final SelenideElement inputEmail =  $x("//input[@name=\"email\"]");
 private final SelenideElement messageSuccess = $x("//div[@class=\"message message__success\"]");
 private final SelenideElement button = $x("//button[.//span[contains(text(), 'Записаться на курс')]]");
    private final SelenideElement agreementCheckbox = $x("//input[@name=\"promo_accepted\"]");

 public String sendData() {
     inputName.setValue("EgorTest");
     inputEmail.setValue("testotegor@skillbox.ru");
     inputPhone.setValue("79855191414");
     // Отмечаем чекбокс согласия
     if (!agreementCheckbox.isSelected()) {
         agreementCheckbox.click();
     }
     button.click();
     messageSuccess.should(appear, Duration.ofSeconds(30));
     return  url();
 }

}
