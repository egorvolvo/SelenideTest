package apple;

import com.codeborne.selenide.ElementsCollection;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$$x;
@Slf4j
public class SearchPage{
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * Возвращает href из первой статьи
     */
    public String getHrefFromFirstArticle(){
        return articleTitles.first().getAttribute("href");
    }
}
