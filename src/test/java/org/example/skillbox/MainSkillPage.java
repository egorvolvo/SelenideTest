package org.example.skillbox;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

@Slf4j

public class MainSkillPage {

    private final SelenideElement linkPythonPage =$("a.product-card-new__link[href='/course/profession-python/']");


    public MainSkillPage(String url) {
        log.info("Открываем главную страницу Skillbox");

        Selenide.open(url);
        log.info("Открыли главную страницу Skillbox");

        $("body").shouldBe(visible);
        log.debug("Основная страница загружена");


    }

    public PythonPage matchedTitle() {

        Selenide.screenshot("before_click");
        log.info("Пытаемся найти элемент Python-разработчик");

        linkPythonPage // прокручиваем без центрирования (быстрее)
                .click();
       switchTo().window(1);  // Переключаемся на новую вкладку
        log.info(url());
        // Ждем загрузки новой страницы
        return new PythonPage();
    }

}
