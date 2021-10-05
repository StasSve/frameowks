package utils;

import org.json.JSONObject;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLoader {
    public static JSONObject getJsonFromFile(String filename) {
        //".\\src\\main\\resources\\json\\" +
        try {
            File fileUri = new File(filename);
            return new JSONObject(
                    new String(
                            Files.readAllBytes(Paths.get(fileUri.getCanonicalPath())), StandardCharsets.UTF_8));
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }
        return null;
    }
}
