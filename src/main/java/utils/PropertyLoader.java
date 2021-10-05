package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {
    private final static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PropertyLoader.class);

    private static final String PROP_FILE = "/application.properties";

    private static Properties getPropertyFile() {
        Properties properties = new Properties();
        try {
            log.info("Load property file");
            properties.load(PropertyLoader.class.getResourceAsStream(PROP_FILE));
            return properties;
        } catch (IOException e) {
            log.error("Error while loading property: " + e.toString());
            return null;
        }
    }

    public static String loadProperty(String name) {
        Properties properties = getPropertyFile();
        return properties.getProperty(name);
    }
}

