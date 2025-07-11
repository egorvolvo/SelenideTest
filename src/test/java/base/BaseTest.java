package base;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseTest {

    @Test
    public  void setUp(){
        Configuration.browser = "chrome";
        Configuration.pageLoadTimeout = 60_000;
        Configuration.timeout = 30_000;


        ChromeOptions options = new ChromeOptions();
        options.addArguments(
                "--disable-blink-features=AutomationControlled",
                "--no-sandbox",
                "--disable-dev-shm-usage",
                "--disable-gpu",
                "--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36"
        );
        Configuration.browserCapabilities = options;

    }

    @BeforeEach
    public void init(){
        setUp();
    }

    @AfterEach
    public void close(){
        Selenide.closeWebDriver();
    }
}
