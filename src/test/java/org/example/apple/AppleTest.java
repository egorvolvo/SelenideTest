package org.example.apple;

import org.example.base.BaseTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest  extends BaseTest {
    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-12";
    @Test
    public void checkHref(){
       MainPage mainPage = new MainPage(BASE_URL);
        Assertions.assertThat(mainPage
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD)).isTrue();
    }
}
