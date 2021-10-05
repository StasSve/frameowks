package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    public static SelenideElement SEARCH_FIELD=$("#searchterm");
    public static SelenideElement SEARCH_BUTTON=$("#top > div.page > div.o-search > div.o-hero.o-hero-blank" +
                                                    ".hero-blank--filter-tags > div > div > form > div > div.form__element__block > button");

    public static SelenideElement getHeadlineWithText(String text) {
        $x("//h4[contains(@class, 'a-headline')]").shouldBe(Condition.visible);
        return $x(String.format("//h4[contains(@class, 'a-headline') and contains(text(), '%s')]", text));
    }
    public static SelenideElement getTeaserWithText(String text) {
        $x("//div[contains(@class, 'teaser-text')]").shouldBe(Condition.visible);
        return $x(String.format("//div[contains(@class, 'teaser-text') and contains(text(), '%s')]", text));
    }
}
