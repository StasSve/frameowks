package helpers;

import com.codeborne.selenide.Selenide;
import org.json.JSONObject;
import pageElements.MainMenu;
import pageObjects.MainPage;
import utils.PropertyLoader;

public class MainPageHelper {
    private static MainPageHelper instance;
    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MainPageHelper.class);

    public static MainPageHelper get(){
        if(instance==null){
            instance = new MainPageHelper();
        }
        return instance;
    }

    public static MainPageHelper openMainPage(){
        return openMainPage(null);
    }

    public MainMenu openMenu(){
        return MainMenu.get().openMenu();
    }

    public static MainPageHelper openMainPage(JSONObject testdata){
        if(testdata==null) {
            Selenide.open(PropertyLoader.loadProperty("mainUrl"));
            if(Boolean.parseBoolean(PropertyLoader.loadProperty("acceptCookies")))MainPage.ACCEPT_COOKIES.click();
        }
        else {
            Selenide.open(testdata.getString("url"));
            if(testdata.getBoolean("accept_cookies"))MainPage.ACCEPT_COOKIES.click();
        }

        return get();
    }

    public MainPageHelper acceptCookiesIfRequired(){
            if(MainPage.ACCEPT_COOKIES.isDisplayed())MainPage.ACCEPT_COOKIES.click();
        return get();
    }

    public SearchHelper clickSearchButton(){
        MainPage.SEARCH.click();
        return SearchHelper.get();
    }
}
