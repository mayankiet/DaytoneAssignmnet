import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ResourceHelper;

import java.io.IOException;

public class GetDetails {

    public ConfigReader configReader;

    @Test
    public void verifyGetRequest() throws IOException {
        configReader = new ConfigReader();
        String url = configReader.getGetRequestUrl();
        Response response = ResourceHelper.get(url);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
