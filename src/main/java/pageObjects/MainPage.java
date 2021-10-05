package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public static SelenideElement LOGO = $("#top > div.m-header__brandbar > div > a");
    public static SelenideElement LEFT_MENU = $("#top > div.m-header__navbar.is-built > div > button");
    public static SelenideElement SEARCH = $("#top > div.m-header__navbar.is-built > div > a");
    public static SelenideElement ACCEPT_COOKIES = $("#consentAcceptAll");
}
