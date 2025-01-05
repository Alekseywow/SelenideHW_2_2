package traning;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class SearchTestOne {

    @BeforeAll
    static void setupExtetion() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void testSearchPageAndTitle(){
        open("https://github.com");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a","Enterprises")).click();

        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
