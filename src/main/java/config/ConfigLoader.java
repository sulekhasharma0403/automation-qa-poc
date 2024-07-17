package config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    private static final String DEFAULT_ENV = "qa";
    private static Properties properties;
    static{
        loadProperties();
    }
    private static void loadProperties(){
        String env = System.getProperty("env",DEFAULT_ENV);
        String propertiesFileName = "config."+env+".properties";
        properties = new Properties();

        try(InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(propertiesFileName)){
            if(input == null){
                throw new RuntimeException("Unable to find properties file: "+ propertiesFileName);
            }
            properties.load(input);
        } catch (IOException ex){
            throw new RuntimeException("Error loading properties file: "+propertiesFileName, ex);
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static boolean getBooleanProperty(String key, boolean defaultValue){
        String value = properties.getProperty(key);
        return value!=null ? Boolean.parseBoolean(value): defaultValue;
    }
}
