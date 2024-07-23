package fr.diginamic.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void getConfigurationInstance() {
        Configuration configuration = Configuration.getInstance();
        assert(configuration.getClass() == Configuration.class);
        assert(configuration.get("db.url").equals("jdbc:mysql://localhost:3306/mydb"));
    }
}
