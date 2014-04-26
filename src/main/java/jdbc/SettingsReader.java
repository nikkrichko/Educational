package jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by никита on 21.04.14.
 */
public class SettingsReader implements Settings {

    private final String URL;
    private final int PORT;
    private final String NAME;
    private final String PASSWORD;

    public SettingsReader() {

        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream("src/main/resources/jdbc/db.props"))
        {
            properties.load(inputStream);

        }  catch (IOException e) {
            e.printStackTrace();
        }

        URL = properties.getProperty("URL", null);
        PORT = Integer.valueOf(properties.getProperty("port", "-1"));
        NAME = properties.getProperty("user", null);
        PASSWORD = properties.getProperty("password", null);

    }

    @Override
    public String getURL() {
        return URL;
    }

    @Override
    public int getPort() {
        return PORT;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getPassword() {
        return PASSWORD;
    }
}
