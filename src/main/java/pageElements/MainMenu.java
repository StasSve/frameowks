package pageElements;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import helpers.MainPageHelper;

import static com.codeborne.selenide.Selenide.*;

public class MainMenu {

        private static MainMenu instance;
        org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MainMenu.class);

        public static MainMenu get(){
            if(instance==null){
                instance = new MainMenu();
            }
            return instance;
        }

    public MainMenu openMenu(){
        $x("//button[contains(@aria-label, 'open menu')]").click();
        return get();
    }

    public MainMenu selectSubmenu(String text){
        $x(String.format("//button[contains(text(), '%s')]", text)).click(ClickOptions.usingJavaScript());
        return get();
    }
    public MainMenu selectOption(String text){
        $$x(String.format
            ("//a[contains(@class, 'a-navigation__node js-navigation-node') and contains(text(), '%s')]", text))
                .filter(Condition.visible).get(0).click();
        return get();
    }

    public MainPageHelper closeMenu(){
        $x("//button[contains(@aria-label, 'close')]").click();
        return MainPageHelper.get();
    }

}
