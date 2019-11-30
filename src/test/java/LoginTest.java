import builders.LoginRequestBuilder;
import org.testng.annotations.Test;
import entities.request.Login;
import utilities.ConfigReader;
import utilities.RequestHelper;
import utilities.ResourceHelper;
import io.restassured.response.*;
import org.testng.Assert;

import java.io.IOException;

public class LoginTest {

    public ConfigReader configReader;
    @Test
    public void verifyLoginRequest() throws IOException {
        Login login = new LoginRequestBuilder()
                .withGrantType("password")
                .withUserName("0990463169")
                .withPassword("9971")
                .withScope("customers_edit_non_recurring_beneficiary customers_add_non_recurring_beneficiary customers_get_beneficiary_by_id customers_delete_non_recurring_beneficiary")
                .build();
        configReader = new ConfigReader();
        String url = configReader.getLoginUrl();
        String json = RequestHelper.getJSONString(login);

        Response response = ResourceHelper.create(url, json);

        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
