import helpers.MainPageHelper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrametrizedTest {
    @Tag("parametrized")
    @Tag("code")
    @ParameterizedTest(name = "Open overview from {0}")
    @ValueSource(strings = {"Advisory", "Digital", "Cloud & Infrastructure", "Security", "Industries"})
    public void prametrizedTest(String submenu){
        MainPageHelper
                .openMainPage()
                .acceptCookiesIfRequired()
                .openMenu()
                .selectSubmenu(submenu)
                .selectOption("Overview");
    }
}
