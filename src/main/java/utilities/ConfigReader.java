package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties properties = new Properties();

    public ConfigReader() throws IOException {
        File src = new File("/home/daytona/workspace/publicGitHup/DaytonaAssignmentAPI/src/main/resources/config.Properties");
        FileInputStream fileInputStream = new FileInputStream(src);
        properties.load(fileInputStream);
    }

    public String getLoginUrl(){
        return properties.getProperty("login");
    }

    public String getGetRequestUrl(){
        return properties.getProperty("getRequest");
    }

    public String getNonAccuringUrl(){
        return properties.getProperty("addNonAccuringUrl");
    }
}
