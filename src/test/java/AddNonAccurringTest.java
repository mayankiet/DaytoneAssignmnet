import builders.AddNonAccuringBuilder;
import entities.request.AddNonAccuring;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.RequestHelper;
import utilities.ResourceHelper;

public class AddNonAccurringTest {

    public ConfigReader configReader;
    @Test
    public void verifyNonAccuringTest()throws Exception{
        AddNonAccuring addNonAccuring = new AddNonAccuringBuilder()
                .withName("test")
                .withFromAccount("78600272872")
                .withAccountTypeCode("1")
                .withAccountNumber("78600272834")
                .withBankCode("BL00059")
                .withBranchCode("683000")
                .withmsisdn("0970181976")
                .withreference("javamigration34")
                .withownreference("javamigration34")
                .withemail("sudhakar@gmail.com")
                .build();

        configReader = new ConfigReader();
        String url = configReader.getNonAccuringUrl();
        String json = RequestHelper.getJSONString(addNonAccuring);

        Response response = ResourceHelper.createNew(url, json);

        Assert.assertEquals(response.getStatusCode(), 201);
    }
}
