package SkillboxTest;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SkillboxTest extends BaseTest {

    private final static String BASE_URL = "https://skillbox.ru/";
    private final static String EXPECTED_WORD = "python";

    @Test
    public void CheckTitle(){
        assertThat(new MainSkillPage(BASE_URL)
                .matchedTitle()
                .sendData()
                .contains(EXPECTED_WORD))
                .isTrue();
    }
}
