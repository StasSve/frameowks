package helpers;

import pageObjects.MainPage;
import pageObjects.SearchPage;

public class SearchHelper {
    private static SearchHelper instance;
    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SearchHelper.class);

    public static SearchHelper get(){
        if(instance==null){
            instance = new SearchHelper();
        }
        return instance;
    }

    public SearchHelper search(String text){
        SearchPage.SEARCH_FIELD.sendKeys(text);
        SearchPage.SEARCH_BUTTON.click();
        return this;
    }
    public SearchHelper tryToFindResult(String text){
        log.info("HEADER: {}", SearchPage.getHeadlineWithText(text));
        log.info("TEASER: {}", SearchPage.getTeaserWithText(text));
        return this;
    }
    public MainPageHelper returnToMainPage(){
        MainPage.LOGO.click();
        return MainPageHelper.get();
    }
}
