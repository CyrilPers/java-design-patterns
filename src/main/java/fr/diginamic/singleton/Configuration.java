package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Configuration {

    public static Configuration instance = new Configuration();

    private static HashMap<String, String> cache = new HashMap<>();

    private Configuration() {}

    public static Configuration getInstance() {
        ResourceBundle configuration = ResourceBundle.getBundle("configuration") ;
        for (String key : configuration.keySet()) {
            cache.put(key, configuration.getString(key));

        }
        return instance;
    }

    public String get(String key) {
        return cache.get(key);
    }
}
