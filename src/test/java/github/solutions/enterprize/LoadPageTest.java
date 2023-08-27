package github.solutions.enterprize;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoadPageTest {

    @Test
    public void LoadingPage(){
        open("https://github.com/");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("button", "Solutions")).sibling(0).$(byText("Enterprise")).click();
        $("div.enterprise-hero h1").shouldHave(text("Build like the best"));
    }
}
