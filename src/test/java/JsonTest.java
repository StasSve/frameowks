import helpers.MainPageHelper;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.FileLoader;

class JsonTest {
    @Tag("json")
    @Tag("code")
    @Test
    @DisplayName("Test with json data")
    void searchTest(){
        JSONObject testdata=FileLoader.getJsonFromFile("./src/main/resources/testflow.json");
        MainPageHelper
                .openMainPage(testdata)
                .clickSearchButton()
                .search(testdata.getString("text_to_find"))
                .tryToFindResult(testdata.getString("expected_result"))
                .returnToMainPage();
    }
}
