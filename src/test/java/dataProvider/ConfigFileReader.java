package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    public Properties properties;
    private final String propertyFilePath= "C:/Users/gbrav/IdeaProjects/demoBlaze-TestNG/Configuration/config.properties";


    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getBrowser(){
        String browser = properties.getProperty("browser");
        if(browser != null){
            return browser;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    public String getURL(){
        String url = properties.getProperty("baseURL");
        if(url != null){
            return url;
        } else {
            throw new RuntimeException("url not specified in the Configuration.properties file.");
        }
    }

    public String getLogInTittle(){
        String title = properties.getProperty("logInModalTitle");
        if(title != null){
            return title;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getInvalidUsermane(){
        String user = properties.getProperty("logInInvalidUsername");
        if(user != null){
            return user;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getValidUsermane(){
        String user = properties.getProperty("logInValidUsername");
        if(user != null){
            return user;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getInvalidPassword(){
        String psw = properties.getProperty("logInInvalidPsw");
        if(psw != null){
            return psw;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getValidPassword(){
        String psw = properties.getProperty("logInValidPsw");
        if(psw != null){
            return psw;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getWrongUsernameAlert(){
        String alert = properties.getProperty("alertWrongUsername");
        if(alert != null){
            return alert;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getWrongPasswordAlert(){
        String alert = properties.getProperty("alertWrongPassword");
        if(alert != null){
            return alert;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }

    public String getSignUpTittle(){
        String title = properties.getProperty("signUpModalTittle");
        if(title != null){
            return title;
        } else {
            throw new RuntimeException("Value not specified in the Configuration.properties file.");
        }
    }
}
