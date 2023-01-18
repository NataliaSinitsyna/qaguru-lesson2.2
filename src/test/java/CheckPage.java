//На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
// Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best."

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckPage {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void CheckTheOnePage() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("h4.h6-mktg").shouldHave(Condition.text("GitHub for enterprises"));

    }
}
