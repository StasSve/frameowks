import helpers.MainPageHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CasualTest {
    @Tag("basic")
    @Tag("code")
    @Test
    @DisplayName("Basic test with profile")
    void searchTest(){
        MainPageHelper
                .openMainPage()
                .clickSearchButton()
                .search("help")
                .tryToFindResult("Technology")
                .returnToMainPage();
    }
}
